package com.juanjojur.curso.springboot.webapp.springbootweb.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.juanjojur.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) { // Se puede hacer con Map<String, Object>
        User user = new User("Juanjo", "Jurado");
        user.setEmail("jj@jj.jj");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users",users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Lalo", "Perez", "lalo@correo.com"),
                new User("Juanita", "Roe", "juana@correo.com"),
                new User("Andres", "Doe"));

    }

    // @GetMapping("list-2")
    // public String list2(ModelMap model) {
    // List<User> users = new ArrayList<>();

    // model.addAttribute("users",users);
    // model.addAttribute("title","Listado de usuarios");
    // return "list";
    // }

}
