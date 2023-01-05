package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AdressesSpringTests {

	@Autowired
	AdresseRepository addresseRepository;

	@Autowired
	PersonneRepository personneRepository;


	@Test
	void testAddresses() {
		Adresse marseille = new Adresse(13,
				"rue du Vieuxport", "13000", "Marseille");
		addresseRepository.save(marseille);
	}

	@Test
	void testManyToOne() {
		Adresse marseille = new Adresse(13,
				"rue du Vieuxport", "13000", "Marseille");
		addresseRepository.save(marseille);

		Personne alain = new Personne("Alain", "Delon");
		alain.setAdresse(marseille);
		personneRepository.save(alain);
	}

	@Test
	void testAjoutDeuxiemeHabitant(){
		Adresse marseille = addresseRepository.findById(1).get();

		Personne marie = new Personne("Marie", "Delon");
		marie.setAdresse(marseille);
		personneRepository.save(marie);
	}

}
