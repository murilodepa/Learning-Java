import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
	
	double largura, comprimento, metroQuadrado, area, preco;
	
	System.out.printf("Digite a largura do terreno: ");
	largura = sc.nextDouble();
	
	System.out.printf("\nDigite o comprimento do terreno: ");
	comprimento = sc.nextDouble();
	
	System.out.printf("\nDigite o valor do metro quadrado: ");
	metroQuadrado = sc.nextDouble();
	
	area = largura*comprimento;
	preco = area*metroQuadrado;
	
	System.out.printf("\nAREA = %.2f", area);
	System.out.printf("\nPRECO = %.2f", preco);
	
	sc.close();
	
	
	}

}
