package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChienSpringTests {

	@Autowired
	ChienRepository chienRepository;

	@Autowired
	PersonneRepository personneRepository;


	@Test
	void testCreateChien() {
			Personne alain = personneRepository.findById(5).get();

			Chien medor = new Chien("Médor");
			medor.setMaitre(alain);
			chienRepository.save(medor);
	}

}
