package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorCincunferencia;

public class Program {

	// public static final double PI = 3.14159; //VERSAO 1

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// CalculatorCincunferencia calc = new CalculatorCincunferencia(); VERSAO 2

		System.out.print("Digite o valor do raio: ");
		double radius = sc.nextDouble();

		// double circun = calc.circumference(radius); // VERSAO 2
		double circun = CalculatorCincunferencia.circumference(radius); // funcao para calcular o valor da
																		// circunferencia

		// double vol = calc.volume(radius); // VERSAO 2
		double vol = CalculatorCincunferencia.volume(radius);

		System.out.printf("\nCincunferencia: %.2f", circun);
		System.out.printf("\nVolume: %.2f", vol);
		// System.out.printf("\nCincunferencia: %.2f", alc.PI); //VERSAO 2
		System.out.printf("\nCincunferencia: %.2f", CalculatorCincunferencia.PI);

		sc.close();

	}

	/*
	 * VERSAO 1 public static double circumference(double radius) { return
	 * (2.0*PI*radius); }
	 * 
	 * public static double volume(double radius) { return
	 * (4.0/3.0*PI*Math.pow(radius, 3)); }
	 */

}
