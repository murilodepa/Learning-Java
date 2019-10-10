package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];
		int contNeg=0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] < 0)
					contNeg+=1;
			}
		}

		System.out.println("Matriz");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("Diagonal Principal");

		for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("");
		System.out.println("Quantidade de numero negativos: " + contNeg);

		sc.close();
	}

}
