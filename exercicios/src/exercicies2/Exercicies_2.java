package exercicies2;

import java.util.Locale;
import java.util.Scanner;

import entites.Entities;

public class Exercicies_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Entities cn;
		cn = new Entities();
		
		
		System.out.print("Name: ");
		cn.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		cn.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		cn.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + cn);
		
		System.out.println();
		System.out.print("Witch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		cn.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + cn);		
		
		sc.close();

	}

}
