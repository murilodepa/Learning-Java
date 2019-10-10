package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Account account;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an Initial Deposit (y/n)?: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Update account date: " + account.getBalance());
		System.out.println(account);
		
		System.out.println("");
		
		System.out.print("Enter a deposit withdraw: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account date: " + account.getBalance());
		System.out.println(account);
		
		sc.close();
	}

}
