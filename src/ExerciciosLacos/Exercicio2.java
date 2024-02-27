package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if(num >= 0 && num % 2 == 0) {
			System.out.printf("\nO Número %d é par e positivo!", num);
		} else if(num >= 0 && num % 2 != 0) {
			System.out.printf("\nO Número %d é impar e positivo!", num);
		}else if(num < 0 && num % 2 == 0) {
			System.out.printf("\nO Número %d é par e negativo!", num);
		}else {
			System.out.printf("\nO Número %d é impar e negativo!", num);
		}
		
		sc.close();
		
	}
}
