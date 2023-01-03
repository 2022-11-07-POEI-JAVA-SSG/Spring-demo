package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class AnnuaireService {

    private ArrayList<Personne> personnes = new ArrayList<>();
    private int nextId = 0;

    public void addPersonne(Personne personne){
        nextId++;
        personne.setId(nextId);
        personnes.add(personne);
    }

    public ArrayList<Personne> getPersonnes(){
        return personnes;
    }

    public void delete(Integer id){
        Iterator<Personne> it = personnes.iterator();
        while (it.hasNext()){
            Personne p = it.next();
            if(p.getId().equals(id)){
                it.remove();
            }
        }
    }

    public Personne getPersonneById(Integer id) {
        for(Personne p : personnes){
            if(p.getId().equals((id))){
                return p;
            }
        }
        return null;
    }
}
