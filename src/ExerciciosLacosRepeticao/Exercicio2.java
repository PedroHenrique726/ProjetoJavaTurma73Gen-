package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int imp = 0, par = 0;
		for(int i = 1; i <11; i++) {
			System.out.printf("Digite o %dº número: ", i);
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				imp++;
			}
			
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + imp);
		sc.close();

	}
}
