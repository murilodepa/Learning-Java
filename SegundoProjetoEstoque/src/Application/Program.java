package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data");

		System.out.print("\nDigite o Name: ");
		product.name = sc.nextLine();

		System.out.print("Digite o preco: ");
		product.price = sc.nextDouble();

		System.out.print("Digite a quantidade em estoque: ");
		product.quantity = sc.nextInt();

		// System.out.println("\nNome: " + product.name + "\nPreco: " + product.price +
		// "\nQuantidade: " + product.quantity);
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
