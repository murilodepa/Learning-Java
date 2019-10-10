package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	/* ENUNCIADO DO PROBLEMA DISSE QUE NAO PODE SER MODIFICADO UMA VEZ QUE FOI ALTERADO
	public void setNumber(int number) {
		this.number = number;
	}
	*/

	public String getHolder() {
		return holder;
	}

	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/* REGRA DE NEGOCIO, NAO PODE ALTERAR CONTA BANCARIA, APENAS ACRESCENTAR NO SALDO OU SAQUE
	public void setBalance(double balance) {
		this.balance = balance;
	}
	*/
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount+5.00;
	}
	
	public String toString() {
		return "\nAccount: " + number
				+ "\nHolder: " + holder
				+ "\nBalance: $" + String.format("%.2f", balance);
	}
	
	
	
	
	
	

}
