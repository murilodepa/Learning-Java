import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		int x;
		double y;
		char c;

		Locale.setDefault(Locale.US);

		System.out.print("Digite um nome: ");
		//nome = sc.next(); // le apenas uma palavra
		nome = sc.nextLine(); // le a linha inteira  digitada
		
		System.out.println("");
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		// sc.nextLine(); //limpar buffer de leitura quando nao utilizar nextLine acima
		
		System.out.print("Digite um numero com float: ");
		y = sc.nextDouble();

		c = sc.next().charAt(0); // charAt(0) pega apenas a primeira letra da string que eu digitar

		System.out.println("Voce digitou o nome: " + nome);
		System.out.println("Voce digitou o numero: " + x);
		System.out.println("Voce digitou o numero: " + y + " ponto flutuante");
		System.out.println("Voce digitou o caracter: " + c);
		sc.close();

	}

}
