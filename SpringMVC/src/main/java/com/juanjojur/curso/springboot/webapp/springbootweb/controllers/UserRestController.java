package com.juanjojur.curso.springboot.webapp.springbootweb.controllers;

import java.util.Map;
// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanjojur.curso.springboot.webapp.springbootweb.models.User;
import com.juanjojur.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;





@RestController
@RequestMapping("/api")

public class UserRestController {

    @GetMapping("/details") //@RequestMapping(path="/details",method = RequestMethod.GET)
    public UserDto details(){ 
        
        User user = new User("Juanjo", "Jurado");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")  
    public List<User> list(){
        User user = new User("Juanjo", "Jurado");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("Jhon", "Doe");

        List<User> users = Arrays.asList(user,user2,user3);
        // List <User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/details-map") //@RequestMapping(path="/details",method = RequestMethod.GET)
    public Map<String, Object> detailsMap(){ 

        User user = new User("Juanjo", "Jurado");
        Map<String, Object> body = new LinkedHashMap<>(); //linked respeta el orden

        body.put("title","Hola Mundo Spring Boot");
        body.put("user", user);
        return body;
    }

}
