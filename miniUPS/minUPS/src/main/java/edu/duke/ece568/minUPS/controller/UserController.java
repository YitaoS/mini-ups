package edu.duke.ece568.minUPS.controller;

import edu.duke.ece568.minUPS.entity.Package;
import edu.duke.ece568.minUPS.entity.Users;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

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

    @GetMapping("/searchPackage")
    public String searchPackage(@RequestParam("packageId") Long packageId, Model model) {
        Package foundPackage = userService.findPackageById(packageId);
        if (foundPackage == null) {
            model.addAttribute("errorMessage", "Sorry, the packageID is not valid!");
            return "main";
        }
        model.addAttribute("foundPackage", foundPackage);

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

}