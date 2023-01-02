package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("hello")
    @ResponseBody // remplie le Body de la Réponse HTTP avec ce que retourne cette méthode
    public String sayHello(){
        return "<h1>Hello</h1>";
    }
}
