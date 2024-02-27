package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero A: ");
		a = sc.nextInt();

		System.out.print("\nDigite o numero B: ");
		b = sc.nextInt();

		System.out.print("\nDigite o número C: ");
		c = sc.nextInt();

		int soma = a + b;

		if (soma > c) {

			System.out.printf("\n%d + %d = %d > %d", a, b, soma, c);
			System.out.println("\nA soma de A + B é Maior do que C");
		} else if (soma == c) {

			System.out.printf("\n%d + %d = %d = %d", a, b, soma, c);
			System.out.println("\nA soma de A + B é igual a C");
		} else {
			System.out.printf("\n%d + %d = %d < %d", a, b, soma, c);
			System.out.println("\nA soma de A + B é Menor do que C");
		}
		sc.close();

}
}