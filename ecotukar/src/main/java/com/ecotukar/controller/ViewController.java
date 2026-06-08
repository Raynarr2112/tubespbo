package com.ecotukar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.security.Principal;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home(Principal principal) {
        return "home";
    }

    @GetMapping("/customer")
    public String customer(Model model, Principal principal) {
        if (principal != null) model.addAttribute("username", principal.getName());
        return "customer";
    }

    @GetMapping("/courier")
    public String courier(Model model, Principal principal) {
        if (principal != null) model.addAttribute("username", principal.getName());
        return "courier";
    }

    @GetMapping("/admin")
    public String admin(Model model, Principal principal) {
        if (principal != null) model.addAttribute("username", principal.getName());
        return "admin";
    }
}
