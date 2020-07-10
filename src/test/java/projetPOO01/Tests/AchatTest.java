package projetPOO01.Tests;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

import projetPOO01.Methodes.Achat;

public class AchatTest {
	
	private Achat ach;
	private final Date odate = new Date();
	private final String ointitule = "Commande";
	private final String oquantite = "";
	private final Date setdate = new Date();
	private final String setintitule = "fgh";
	private final String setquantite = "dg";
	
	@Before
	public void init () {
	ach = new Achat(odate,ointitule,oquantite);
	}
	
	@Test
	public void testAchat() {
		assertNotNull(ach);
	}

	@Test
	public void testToString() {
		String toString = "Achat [Date:" + odate + 
				", Intitule=" + ointitule + 
				", Quantite=" + oquantite + "]";
		assertEquals(toString, ach.toString());
	}

	@Test
	public void testGetDate() {
		assertEquals(odate,ach.getDate());
	}

	@Test
	public void testSetDate() {
		ach.setDate(setdate);
		assertEquals(setdate,ach.getDate());
	}

	@Test
	public void testGetIntituleAchat() {
	assertEquals(ointitule, ach.getIntituleAchat());
	}

	@Test
	public void testSetIntituleAchat() {
		ach.setIntituleAchat(setintitule);
		assertEquals(setintitule, ach.getIntituleAchat());
	}

	@Test
	public void testGetQuantiteAchat() {
		assertEquals (oquantite, ach.getQuantiteAchat());
	}

	@Test
	public void testSetQuantiteAchat() {
	ach.setQuantiteAchat(setquantite);
	assertEquals(setquantite, ach.getQuantiteAchat());
	
	}

	@Test (expected = Exception.class)
	public void testCheckDate() throws Exception {

			Date date = new Date ();
			Achat.checkDate(date.toString());
	}

}
