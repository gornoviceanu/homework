package tema_atm_23_02;

import java.util.*;

public class ATM_menu {

	public ATM_menu() {
		List<Account> accountList = new ArrayList<>();
		// am pus card number de doar 4 cifre ca sa nu stai f mult in caz ca vrei sa
		// testezi. am lasat long pentru a putea tine 16 cifre
		Account a1 = new Account("Cristi", 1034.23d, 1234l, 1234);
		Account a2 = new Account("Elena", 1344.56d, 2345l, 2345);
		Account a3 = new Account("Iulian", 5655.68d, 3456l, 3456);

		accountList.add(a1);
		accountList.add(a2);
		accountList.add(a3);

		boolean systemOn = true;

		while (systemOn == true) {

			System.out.println("Introduceti Cardul: ");
			Scanner reader = new Scanner(System.in);
			long card = reader.nextLong();
			boolean x = false;
			int checkCardNo = String.valueOf(card).length();
			if (checkCardNo == 4) {
				for (Account a : accountList) {
					if (card == a.cardID) {
						System.out.println("Introduceti PIN: ");
						int pin = reader.nextInt();
						x = a.checkPIN(pin);
						if (x == true) {
							AccountInterface ai = new AccountInterface(a);
						} else {
							System.out.println("PIN invalid.");
						}
					}
				}
			} else {
				System.out.println("Card invalid.");
			}

		}
	}

}
