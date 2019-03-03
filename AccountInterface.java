package atm;

import java.util.Scanner;

public class AccountInterface {

	public Account updateAccount(Account Object) {
		Account acc = Object;
		return acc;
	}

	public AccountInterface(Account Object) {
		Account acc = Object;
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
				acc.withdraw();
				exit = acc.askNewOperation();
				break;

			case 2:
				acc.deposit();
				exit = acc.askNewOperation();
				break;

			case 3:
				System.out.println(acc.getBalance());
				exit = acc.askNewOperation();
				break;

			case 4:
				acc.payBill();
				exit = acc.askNewOperation();
				break;

			case 5:
				acc.setPIN();
				exit = acc.askNewOperation();
				break;

			case 6:
				System.out.println("Va multumim!");
				exit = true;
				break;

			}
		}
	}

}
