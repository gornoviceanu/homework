package tema_atm_23_02;

import java.util.Scanner;

public class Account {
	private String name;
	private double accountBalance;
	private double accountCredit;
	public long cardID;
	private int pin;

	public Account(String name, double accountBalance, long cardID, int pin) {
		this.name = name;
		this.accountBalance = accountBalance;
		this.cardID = cardID;
		this.pin = pin;
	}
	
	public Account() {
		
	}

	public double getBalance() {
		return accountBalance;
	}

	public boolean checkPIN(int pin) {
		if (this.pin == pin) {
			return true;
		} else {
			return false;
		}
	}

	public void setPIN() {
		System.out.println("Introduceti noul cod PIN: ");
		Scanner reader = new Scanner(System.in);
		int pin = reader.nextInt();
		String a = String.valueOf(pin);
		if (a.length() == 4) {
			this.pin = pin;
			System.out.println("Codul PIN a fost schimbat.");
		} else {
			System.out.println("PIN invalid. Introduceti un PIN de 4 cifre.");
		}
	}

	public boolean askNewOperation() {
		System.out.println("Doriti sa efectuati o alta operatie?");
		System.out.println("1. Da");
		System.out.println("2. Nu");
		Scanner reader = new Scanner(System.in);
		byte answer = reader.nextByte();
		if (answer == 2) {
			return true;
		} else {
			System.out.println("Va multumim!");
			return false;
		}
	}

	public void deposit() {
		System.out.println("Introduceti suma: ");
		Scanner reader = new Scanner(System.in);
		double sum = reader.nextInt();
		if (sum > 0) {
			this.accountBalance = this.accountBalance + sum;
			System.out.println("Suma a fost depusa.");
		} else {
			System.out.println("Invalid input.");
		}
	}

	public void withdraw() {
		System.out.println("Introduceti suma: ");
		Scanner reader = new Scanner(System.in);
		double sum = reader.nextInt();
		if (this.accountBalance >= sum) {
			this.accountBalance = this.accountBalance - sum;
			System.out.println("Va rugam ridicati cardul si banii.");
		} else {
			System.out.println("Fonduri insuficiente.");
		}
	}

	public void payBill() {
		System.out.println("Introduceti suma: ");
		Scanner reader = new Scanner(System.in);
		double sum = reader.nextInt();
		if (this.accountBalance >= sum) {
			this.accountBalance = this.accountBalance - sum;
			this.accountCredit = this.accountCredit + sum;
			System.out.println("Contul dvs. de plata facturi a fost alimentat.");
		} else {
			System.out.println("Fonduri insuficiente");
		}
	}
}
