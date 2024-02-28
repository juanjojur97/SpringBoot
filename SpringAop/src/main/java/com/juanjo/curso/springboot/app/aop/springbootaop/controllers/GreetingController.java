package com.juanjo.curso.springboot.app.aop.springbootaop.controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanjo.curso.springboot.app.aop.springbootaop.services.GreetingService;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greeting;


    @GetMapping("/greeting")
    public ResponseEntity <?> greeting() {
        return ResponseEntity.ok(Collections.singletonMap("greeting", greeting.sayHello("Juanjo", "¿Hola, que tal?")));
    }
    @GetMapping("/greeting-error")
    public ResponseEntity <?> greetingError() {
        return ResponseEntity.ok(Collections.singletonMap("greeting", greeting.sayHelloError("Juanjo", "¿Hola, que tal?")));
    }
}
