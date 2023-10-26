//package ru.kata.spring.boot_security.demo.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserService;
//
//import java.security.Principal;
//
//@RestController
//public class MainController {
//
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//
//    @GetMapping("/")
//    public String homePage() {
//        return "home";
//    }
//
//    @GetMapping("/authenticated")
//    public String pageForAuthenticatedUsers (Principal principal) {
//        User user = userService.findByUsername(principal.getName());
//        return "secured part of web service " + user.getUsername();
//    }
//
//    @GetMapping("/read_profile")
//    public String pageForReadProfile () {
//        return "read profile page ";
//    }
//
//    @GetMapping("/admin")
//    public String pageOnlyForAdmins() {
//        return "admins page";
//    }
//
//}
