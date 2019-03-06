package tema_atm_23_02;

import java.util.Scanner;

public class AccountInterface {

	public Account updateAccount(Account Object) {
		Account acc = Object;
		return acc;
	}

	public AccountInterface(Account account) {
		boolean exit = false;

		while (exit == false) {
			System.out.println("Alegeti operatia pe care o doriti: ");
			System.out.println("1. Eliberare numerar.");
			System.out.println("2. Depunere numerar");
			System.out.println("3. Interogare sold.");
			System.out.println("4. Plata facturi.");
			System.out.println("5. Schimbare PIN.");
			System.out.println("6. Iesire.");

			Scanner reader = new Scanner(System.in);
			byte option = reader.nextByte();
		
			switch (option) {

			case 1:
				account.withdraw();
				exit = account.askNewOperation();
				break;

			case 2:
				account.deposit();
				exit = account.askNewOperation();
				break;

			case 3:
				System.out.println(account.getBalance());
				exit = account.askNewOperation();
				break;

			case 4:
				account.payBill();
				exit = account.askNewOperation();
				break;

			case 5:
				account.setPIN();
				exit = account.askNewOperation();
				break;

			case 6:
				System.out.println("Va multumim!");
				exit = true;
				break;

			}
		}
	}

}
