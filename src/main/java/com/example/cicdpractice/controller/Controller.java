package com.example.cicdpractice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping("/")
    public String test() {
        return "okay 2";
    }

}
