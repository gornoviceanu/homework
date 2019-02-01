package testing.homework;
import java.util.Random;

public class Metode {

	public Metode() {
		
	}
	
	static int indexOfCharacter(String cuvant, String caracter) {
		System.out.println("Indexul caracterului selectat din String str este: " + cuvant.indexOf(caracter));
		return cuvant.indexOf(caracter);
	}
	
	static boolean checkPalindrome(String cuvant) {
		int lungime = cuvant.length();
		String invers = "";
		
		for (int i = lungime - 1; i >= 0; i--) {
			invers = invers + cuvant.charAt(i);
		}
		
		if (cuvant.equals(invers)) {
			System.out.println("Cuvantul este un palindrom. ");
			return true;
		}
		else { System.out.println("Cuvantul nu este un palindrom. ");	
		    return false;
		}
	}
	
	
	
    static int[][] matrice = new int[5][5];
    
    public void MatriceEngine (int rows, int columns) {
    	matrice = new int[rows][columns];
    }
    
    static void initMatrice() {
    	for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    			matrice[i][j] = new Random().nextInt(10);
    		}
    	}
    }
	
	static int maxDiagPrincipala() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			if (matrice[i][i] > max) {
				max = matrice[i][i];
			}
		}
		return max;
	}
	
	static int maxDiagSecundara() {
		int max = Integer.MIN_VALUE;
		int j = matrice.length - 1;
		for (int i = 0; i < 5; i++) {
			if(matrice[i][j] > max) {
				max = matrice[i][j];
			}
			j--;
		}
		return max;
	}
	
	static int maxDiagonale() {
		int max = Integer.MIN_VALUE;
		int principala = maxDiagPrincipala();
		int secundara = maxDiagSecundara();
		if (principala >= secundara) {
			max = principala;
		}
		else { max = secundara;
		}
		return max;
	}
	
	static int sumDiagonalaPrincipala() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = matrice[i][i] + sum;
		}
		return sum;
	}
	
	
	


}
