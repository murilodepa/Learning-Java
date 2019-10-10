
public class Main {

	public static void main(String[] args) {

		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
	/*	float b, B, h, area;
		b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		*/
		
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = (double) c / d;    // para 5/2=2,5, se nao ele entende que é 2 (divisao de inteiros)
		System.out.println(resultado);
		
		double m;
		int n;
		m = 5.0;
		n = (int) m; // converter int para double (casting=conversao implicita)
		System.out.println(n);


	}

}
