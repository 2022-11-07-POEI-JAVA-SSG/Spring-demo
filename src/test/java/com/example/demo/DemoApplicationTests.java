package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	AnnuaireDatabaseService annuaireDatabaseService;

	@Test
	void testfindAllPersonnesByNom() {
		List<Personne> familleDelon = annuaireDatabaseService.getPersonnesByNom("Delon");
		assertEquals(2, familleDelon.size());
	}

	@Test
	void testAdditionner() {
		int resultat = annuaireDatabaseService.additionner(2, 3);
		assertEquals(5, resultat);
	}
}
