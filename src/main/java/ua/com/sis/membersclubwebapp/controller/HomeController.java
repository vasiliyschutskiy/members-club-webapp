package ua.com.sis.membersclubwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.sis.membersclubwebapp.service.UserService;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping({"/", "home"})
    public String home(Model model) {
        model.addAttribute("users", userService.getAll());
        return "home";
    }
}
