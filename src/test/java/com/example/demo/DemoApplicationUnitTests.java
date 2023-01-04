package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationUnitTests {

	@Test
	void testAdditionner() {
		AnnuaireDatabaseService annuaireDatabaseService = new AnnuaireDatabaseService();
		int resultat = annuaireDatabaseService.additionner(2, 3);
		assertEquals(5, resultat);
	}
}
