package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Circle;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Shape #" + i + "data: ");
			System.out.println("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			Color color = null;
			
			try {
				System.out.println("Digite a cor (black/blue/red): ");
				color = Color.valueOf(sc.next());
				}
				catch(IllegalArgumentException e){
					System.out.println("Digitou uma opcao invalida");
				}
			
			if(ch == 'r') {
				System.out.println("Largura: ");
				double largura = sc.nextDouble();
				
				System.out.println("Digite a altura: ");
				double altura = sc.nextDouble();
				
				Shape shape = new Rectangle(color, largura, altura);
				list.add(shape);
			}
			
			else {
				System.out.println("Digite o raio: ");
				double radius = sc.nextDouble();
				
				Shape shape = new Circle(color, radius);
				list.add(shape);
			}
		}
		
		System.out.println();
		System.out.println("Shape AREAS!");
		for(Shape shape : list) {
		System.out.println(shape.area());
		}
		
		sc.close();
	}

}
