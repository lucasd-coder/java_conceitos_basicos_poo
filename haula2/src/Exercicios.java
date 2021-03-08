import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, h;
		double ph, sa;
		
		x = sc.nextInt();
		sc.nextLine();
		h = sc.nextInt();
		sc.nextLine();
		ph = sc.nextDouble();
		sc.nextLine();
		
		sa = h * ph;
		System.out.println("NUMBER = "+ x);
		System.out.printf("SALARY = U$ %.2f%n", sa);



		
//		int a, b, c, d, z;
//		a = sc.nextInt();
//		sc.nextLine();
//		b = sc.nextInt();
//		sc.nextLine();
//		c = sc.nextInt();
//		sc.nextLine();
//		d = sc.nextInt();
//		sc.nextLine();
//		
//		z = a * b - d * c;
//		
//		System.out.println("DIFERENCA = " + z);


//		int x, y;
//		x = sc.nextInt();
//		sc.nextLine();
//		y = sc.nextInt();
//		sc.nextLine();
//		
//	 int soma = x + y; 
//		
//		System.out.println("Soma =" + soma);
////		
//		double x, A;
//		
//		x = sc.nextDouble();
//		sc.nextLine();
//		A = 3.14159 * Math.pow(x, 2);
//		
//		System.out.printf("Area = %.4f%n", A);
		
		sc.close();
	}

}
