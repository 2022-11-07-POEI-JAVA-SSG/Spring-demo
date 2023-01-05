package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class DemoSessionController {

    @Autowired
    HttpSession httpSession;

    @PostMapping("session")
    public void writeSession(@RequestBody Personne personne){
        httpSession.setAttribute("moi", personne);
    }

    @GetMapping("session")
    public Personne readSession(){
        Personne personne = (Personne)httpSession.getAttribute("moi");
        return personne;
    }
}
