package edu.duke.ece568.minUPS.controller;

import edu.duke.ece568.minUPS.entity.Package;
import edu.duke.ece568.minUPS.entity.Users;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.service.UserService;
import edu.duke.ece568.minUPS.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PackageService packageService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(Users users) {
        userService.registerUser(users);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping({"/", "/main"})
    public String mainPage() {
        return "mainpage";
    }

    private String computeDistance(Package aPackage, Truck truck) {
        if (aPackage.getStatus().equals(Package.Status.DELIVERING.getText())) {
            int deltaX = aPackage.getDestinationX() - truck.getPosX();
            int deltaY = aPackage.getDestinationY() - truck.getPosY();
            double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
            return String.format("%.2f", distance);
        } else if (aPackage.getStatus().equals(Package.Status.DELIVERED.getText())) {
            return "Check your mailbox!";
        } else {
            return "Still in warehouse!";
        }
    }

    @GetMapping("/searchPackage")
    public String searchPackage(@RequestParam("packageId") Long packageId, Model model) {
        Package foundPackage = userService.findPackageById(packageId);
        if (foundPackage == null) {
            model.addAttribute("errorMessage", "Sorry, the packageID is not valid!");
            return "mainpage";
        }
        model.addAttribute("foundPackage", foundPackage);
        Truck atruck = foundPackage.getTruck();
        model.addAttribute("atruck", atruck);
        model.addAttribute("distance", computeDistance(foundPackage, atruck));

        String location;
        Package.Status status = Package.Status.fromString(foundPackage.getStatus());
        if (status == Package.Status.DELIVERED) {
            location = "(" + foundPackage.getDestinationX() + ", " + foundPackage.getDestinationY() + ")";
        } else if (status == Package.Status.DELIVERING) {
            Truck truck = userService.findTruckById(foundPackage.getTruck().getTruckID());
            location = "(" + truck.getPosX() + ", " + truck.getPosY() + ")";
        } else {
            location = "Wait for delivery";
        }
        model.addAttribute("location", location);

        return "packageInfo";
    }

    @GetMapping("/userPackages")
    public String userPackages(Model model, Principal principal) {
        Users user = userService.findByEmail(principal.getName()).orElse(null);
        if (user != null) {
            List<Package> userPackages = packageService.findAllByUpsID(user.getUpsID());
            userPackages.sort(Comparator.comparing(Package::getPackageID));
            List<Truck> trucks = userPackages.stream().map(Package::getTruck).collect(Collectors.toList());
            List<String> distances = new ArrayList<>();
            for (int i = 0; i < userPackages.size(); i++) {
                distances.add(computeDistance(userPackages.get(i), trucks.get(i)));
            }
            model.addAttribute("trucks", trucks);
            model.addAttribute("distances", distances);
            model.addAttribute("userPackages", userPackages);
        }
        return "userPackages";
    }

    @GetMapping("/changedest/{id}")
    public String showChangeDestForm(@PathVariable("id") Long packageID, Model model) {
        model.addAttribute("packageID", packageID);
        return "changedest";
    }

    @PostMapping("/changedest/{id}")
    public String changeDestination(@PathVariable("id") Long packageID,
                                    @RequestParam("destinationX") Integer destinationX,
                                    @RequestParam("destinationY") Integer destinationY,
                                    RedirectAttributes redirectAttributes) {
        packageService.updateDestination(packageID, destinationX, destinationY);
        redirectAttributes.addFlashAttribute("message", "Destination updated successfully!");
        return "redirect:/userPackages";
    }



    }