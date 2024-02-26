package ExerciciosComplementares;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int x1, x2, soma, dif, mult;
		double div;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		
		soma = x1 + x2;
		dif = x1 - x2;
		mult = x1 + x2;
		div = (double) x1 / (double) x2;
		System.out.println("Soma: " + soma);
		System.out.println("Diferença: " + dif);
		System.out.println("Multiplicação: " + mult);
		System.out.printf("Divisao: %.3f", div);
		sc.close();
		
	}
}
