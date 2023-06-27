package com.example.accessingdatamysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path="/hola")
public class controller {
    @GetMapping(path="/mundo")
    public String home(){
        return "AT77465395-Arturo Gabriel";
    }
}