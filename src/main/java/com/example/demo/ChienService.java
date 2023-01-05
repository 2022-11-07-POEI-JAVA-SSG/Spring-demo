package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChienService {

    @Autowired
    ChienRepository chienRepository;

    public void saveChien(Chien chien){
        chienRepository.save(chien);
    }
}
