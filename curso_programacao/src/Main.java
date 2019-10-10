import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.2355;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.println(y);
		System.out.printf("%.2f%n", x); //porcento n ou barra n é a quebra de linha, printF é um print formatado
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x); //porcento n ou barra n é a quebra de linha, printF é um print formatado
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
