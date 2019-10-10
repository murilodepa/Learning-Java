package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product(); //construtor padrao

		System.out.println("Enter product data");

		System.out.print("\nDigite o Name: ");
		String name = sc.nextLine();

		System.out.print("Digite o preco: ");
		double price = sc.nextDouble();
	
		//System.out.print("Digite a quantidade em estoque: ");
		//int quantity = sc.nextInt();

		Product product = new Product(name, price);
		
		// System.out.println("\nNome: " + product.name + "\nPreco: " + product.price +
		// "\nQuantidade: " + product.quantity);
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		
		product.setPrice(1200);
		System.out.println("Price update: " + product.getPrice());
		
		System.out.println("\nProduct data: " + product.toString()); // ou pode colocar apenas product
		System.out.print("\nDigite o numero de produtos para serem adicionado no estoque: ");
	    int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("\nUpdate data: " + product.toString()); // ou pode colocar apenas product

		System.out.print("\nDigite o numero de produtos para serem removidos no estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		

		System.out.println("\nUpdate data: " + product.toString()); // ou pode colocar apenas product

		sc.close();
	}

}
