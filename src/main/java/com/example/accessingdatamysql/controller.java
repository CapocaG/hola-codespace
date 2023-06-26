package com.example.accessingdatamysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class controller {
    @GetMapping
    public String home(){
        return "AT77465395-Arturo Gabriel";
    }
}
