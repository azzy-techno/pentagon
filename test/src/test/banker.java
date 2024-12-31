package test;

import java.util.Scanner;

public class banker {

	Scanner sc = new Scanner(System.in);
	String name = "HDFC BANK";
	int pin = 1234;
	double balance = 1000;
	int amount;

	public void pin() {
		System.out.println("Enter your PIN");
		int Npin = sc.nextInt();
		if (pin == Npin) {
			System.out.println("Correct pin!!");
		}
		else {
			System.out.println("Wrong Pin");
			System.exit(0);
		}
	}

	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw: ");
		int amount=sc.nextInt();
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn Succesfully, Current Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void deposit() {
		System.out.println("Enter the amount you want to deposit: ");
		int amount=sc.nextInt();
		balance = balance + amount;
		System.out.println("Deposited Succesfully, New Balance is: " + balance);
	}

	public void balance() {
		System.out.println("Current Balance is: " + balance);
	}

}
