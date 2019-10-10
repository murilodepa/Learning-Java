package entities;

public class Product {
	/*
	public String name;
	public double price;
	public int quantity;
	*/
	
	//Encapsulando meus atributos
	//String name; //Nao tem modificador de acesso, consigo acessar ele em classes do mesmo pacote
	private String name;
	private double price;
	private int quantity;
	
	
	
	public Product() { //Declaração de um construtor padrão
	}
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public Product(String name, double price) { //Aprendendo sobrecarga
		this.name = name;
		this.price = price;
		//this.quantity = 0; //opcional 0 e o this tambem
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	/* REGRA DE NEGOCIO QUE PROTEGE A INTEGRIDADE DO PRODUTO NAO AUTORIZANDO QUE A PESSOA COLOCA QUALQUER QUANTIDADE NO ESTOQUE
	public void setQuantity (int quantity) { //PERMITINDO APENAS ENTRA OU SAIDA DO ESTOQUE
		this.quantity = quantity;
	}
	*/


	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "\nNome: " + name 
				+ "\nPreco: $" + String.format("%.2f", price) 
				+ "\nQuantidade: " + quantity + " unidades"
				+ "\nunits, Total: $" + String.format("%.2f", totalValueInStock());
	}
}
