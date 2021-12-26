package ua.com.sis.membersclubwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import ua.com.sis.membersclubwebapp.model.User;
import ua.com.sis.membersclubwebapp.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;




    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", userService.getAll());
        return "create-user";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute User user, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("user", user);
            model.addAttribute("users", userService.getAll());
            return "redirect:/users/create";
        }
        userService.create(user);
        return "redirect:/users/create";
    }

    //    @GetMapping("/{id}/read")
//    public String read(//add needed parameters) {
//        //ToDo
//        return " ";
//    }
////
//    @GetMapping("/{id}/update")
//    public String update(//add needed parameters) {
//        //ToDo
//        return " ";
//    }
//
//
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users/create";
    }




//    @GetMapping("/all")
//    public String getAll(@PathVariable("user_id") int user_id, Model model) {
//        model.addAttribute("user", userService.readById(user_id));
//
//        return "todos_user";
//    }
}

