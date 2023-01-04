package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationUnitTests {

	@Test
	void testAdditionner() {
		AnnuaireDatabaseService annuaireDatabaseService = new AnnuaireDatabaseService();
		int resultat = annuaireDatabaseService.additionner(2, 3);
		assertEquals(5, resultat);
	}
}
