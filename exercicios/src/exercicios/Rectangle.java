package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entites.Entities;

public class Rectangle {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Entities cn;
		
		cn = new Entities();
		
		
		System.out.println("Enter rectangle width and height: ");
		cn.width = sc.nextDouble();
		cn.height = sc.nextDouble();
		
		 double resultArea = cn.Area();
		 System.out.printf("AREA = %.2f%n", resultArea); 
		 
		 double resultPeri = cn.Perimeter();
		 System.out.printf("PERIMETER = %.2f%n", resultPeri);
		 
		 double resultDiag = cn.Diagonal();
		 System.out.printf("DIAGONAL = %.2f%n", resultDiag);

		
		sc.close();

	}
	


}
