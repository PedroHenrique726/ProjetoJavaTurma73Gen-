package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio7 {

public static void main(String[] args) {
		
		float num1, num2;
		int cod;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o 1º número: ");
		num1 = sc.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		num2 = sc.nextFloat();
		
		System.out.print("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.printf("%.1f + %.1f = %.1f", num1, num2, (num1 + num2));
			break;
		
		case 2:
			System.out.printf("%.1f - %.1f = %.1f", num1, num2, (num1 - num2));
			break;
			
		case 3:
			System.out.printf("%.1f * %.1f = %.1f", num1, num2, (num1 * num2));
			break;
		case 4:
			System.out.printf("%.1f / %.1f = %.1f", num1, num2, (num1 / num2));
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
	}
		
		sc.close();
	}
}
