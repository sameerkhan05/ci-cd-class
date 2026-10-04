package com.same.cicd.cicd_practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcomecontroller(){
        return ResponseEntity.ok("API is UP using ci/cd pipeline");
    }
}
