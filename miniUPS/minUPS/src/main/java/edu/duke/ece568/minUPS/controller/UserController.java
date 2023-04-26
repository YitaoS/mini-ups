package edu.duke.ece568.minUPS.controller;

import edu.duke.ece568.minUPS.entity.Users;
import edu.duke.ece568.minUPS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
//
//    @GetMapping
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new Users());
//        return "register";
//    }
//
//    @PostMapping
//    public String registerUser(Users users) {
//        userService.registerUser(users);
//        return "redirect:/login";
//    }

    @GetMapping("/")
    public String showLoginForm() {
        return "login";
    }
}