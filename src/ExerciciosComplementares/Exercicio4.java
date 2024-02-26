package ExerciciosComplementares;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int num, cem = 0, cinq = 0, vin = 0, dez = 0, cinc = 0, dois = 0, um = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor:");
		num = sc.nextInt();
		
		if (num / 100 >= 1) {
			cem = num / 100;
			num = num - cem * 100;
		} 
		if (num / 50 >= 1) {
			
			cinq = num / 50;
			num = num - cinq * 50;
		}
		if (num / 20 >= 1) {
			vin = num / 20;
			num = num - vin * 20;
		}
		if (num / 10 >= 1) {
			dez = num / 10;
			num = num - dez * 10;
		}
		if (num / 5 >= 1) {
			cinc = num / 5;
			num = num - cinc * 5;
		}
		if (num / 2 >= 1) {
			dois = num / 2;
			num = num - dois * 2;
		}
		if (num / 1 >= 1) {
			um = num / 1;
			num = num - um;
		}
		
		

		

		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vin + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinc + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
		sc.close();
		
	}
}
