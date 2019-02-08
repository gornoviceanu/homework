package tema_19_01_2019;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTema {
	
	private Metode test = new Metode();
	
	@Test
	public void checkPalindromeTest () {
		String cuvant = "cojoc";
		int length = cuvant.length();
		boolean rezultat = Metode.checkPalindrome(cuvant);
		assertEquals(true, rezultat);
	}
	
	@Test
	public void indexOfCharacterTest () {
		String cuvant = "irlanda";
		String caracter = "a";
		int rezultat;
		rezultat = Metode.indexOfCharacter(cuvant, caracter);
		assertEquals(3, rezultat);
	}
	
	@Test
	public void maxDiagonalaPrincipalaTest() {	
        Metode.initMatrice();
		int maax = Metode.maxDiagPrincipala();
		assertEquals(9, maax);
	}




}
