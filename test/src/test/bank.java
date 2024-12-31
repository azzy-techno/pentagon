package test;

import java.util.Scanner;


public class bank {
	
	public static void main(String[] args) {
		banker b = new banker();
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the bank portal " + b.name);
		System.out.println("1. pin");
		System.out.println("2. withdraw");
		System.out.println("3. deposit");
		System.out.println("4. balance");
		System.out.println("5. Exit");
		int i=0;
		while (i <= 5) {
		int entry = sc.nextInt();
		switch (entry) {
		case 1: 
			b.pin();
			break;			
		case 2: 
			b.withdraw();
			break;
		case 3:
			b.deposit();
			break;
		case 4: 
			b.balance();
			break;
		case 5:
			System.out.println("Exited Succesfully");
			System.exit(0);
			break;
		default:
			System.out.println("Oops!! wrong entry");
		
		 }
		}
	}
}
