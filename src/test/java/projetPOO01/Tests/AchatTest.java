package projetPOO01.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import projetPOO01.Methodes.Achat;

public class AchatTest {
	
	@Test
	public void testAchat() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIntituleAchat() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIntituleAchat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetQuantiteAchat() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetQuantiteAchat() {
		Achat achat = new Achat (15/7/2020, "Maison", "15" );
		assertNotNull(achat); //Vérifier que l'objet maPersonne est bien un objet Personne
		assertEquals("15", achat.toString()); // Vérifier que l'objet quantité achat et bien du string	

		
		fail("Not yet implemented");
	}

	@Test
	public void testCheckDate() {
		fail("Not yet implemented");
	}

}
