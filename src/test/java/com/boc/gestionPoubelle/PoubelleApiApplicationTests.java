package com.boc.gestionPoubelle;

import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import static org.springframework.test.util.AssertionErrors.*;

@SpringBootTest
class PoubelleApiApplicationTests {
	@Autowired
	private UsagerService usagerService;
	@Autowired
	private HabitationService habitationService;
	@Test
	void contextLoads() {}
	@Test
	public void testGetUsagers() {
		assertNotNull("Usager not found", usagerService.getAll());
	}
	@Test
	public void testGetHabitation() {
		assertNotNull("Usager not found", habitationService.getAll());
	}

}
