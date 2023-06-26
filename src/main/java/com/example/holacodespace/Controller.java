package com.example.holacodespace;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/hola")
public class Controller{
    @GetMapping(path="/mundo")
    public String home(){
        return "AT77465395-Arturo Gabriel ";
    }
}