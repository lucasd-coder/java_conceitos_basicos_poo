package haula8_exercio;


import java.util.Locale;
import java.util.Scanner;



import entites.Entites;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("How many rooms will be rented? ");		
		int N = sc.nextInt();
		Entites[] vect = new Entites[N];
		
		for (int i = 0; i<N; i++) 
		{
			System.out.println();
			System.out.println("Rent #"+ (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine(); //Limper buffer do tackled
			String name = sc.nextLine();			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();			
			vect[i] = new Entites(name, email, room);			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(Entites e: vect) {
						
			System.out.println(e);
		}

		
		sc.close();
	}

}
