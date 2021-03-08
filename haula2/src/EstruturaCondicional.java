import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		int hora;
//			System.out.println("Quantas horas");
//			hora = sc.nextInt();
//			
//			if(hora < 12) {
//				System.out.println("Boa bom dia");
//			} 
//			else if(hora < 18) {
//					System.out.println("Bom tarde ");	
//			} 
//			else {
//					System.out.println("Bom noite ");
//		    }
//				int minutos = sc.nextInt();
//				
//				double conta = 50.0;
//				if(minutos > 100) {
//					conta += (minutos - 100) * 2.0;  
//				}
//				System.out.printf("Valor da Conta R$ = %.2f%n", conta);
//		int x = sc.nextInt();
//		String dia;
//					if(x == 1) {
//						dia = "domingo";
//					} else if(x == 2) {
//						dia = "segunda";
//					} else if(x == 3) {
//						dia = "terça";
//					} else if(x == 4) {
//						dia = "quarta";
//					} else if(x == 5) {
//						dia = "quinta";
//					} else if(x == 6) {
//						dia = "sexta";
//					} else if(x == 7) {
//						dia = "sabado";
//					} else {
//						dia = "Valor Indefinido";
//					}
//		switch (x) {
//		case 1:
//			dia = "domingo";
//			break;
//		case 2:
//			dia = "segunda";
//			break;
//		case 3:
//			dia = "terça";
//			break;
//		case 4:
//			dia = "quarta";
//			break;
//		case 5:
//			dia = "quinta";
//			break;
//		case 6:
//			dia = "sexta";
//			break;
//		case 7:
//			dia = "sabado";
//			break;
//		default: 
//			dia = "Valor Indefinido";
//		}
//		System.out.println("Dia da Semana: " + dia);
		
		
			double preco = 34.5;
			double desconto =(preco < 20.0) ?  preco * 0.1 :  preco * 0.05;
			
//			if(preco < 20.0) {
//				desconto = preco * 0.1;
//			}
//			else {
//				desconto = preco * 0.05;
//			}
			System.out.println(desconto);
		sc.close();
	}

}
