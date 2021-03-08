
import java.util.Scanner;



public class Haula3 {

	public static void main(String[] args) {
//		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//			
//		String x;
//		int y;
//		double z;
//		
////		x = sc.nextDouble();
////		System.out.printf("Você digitou: %.2f%n", x);
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		System.out.println("Dados digitados: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		
	}

}
