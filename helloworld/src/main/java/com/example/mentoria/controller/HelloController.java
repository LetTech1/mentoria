package com.example.mentoria.controller;

import com.example.mentoria.model.PersonModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {

    @GetMapping
    public String hello(){

        PersonModel pm = new PersonModel("Leticia", 23);
        log.info(pm.toString());

        return "Hello World!";

    }


}
