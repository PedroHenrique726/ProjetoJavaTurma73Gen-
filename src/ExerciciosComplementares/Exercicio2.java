package ExerciciosComplementares;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		float raio, result;
		final float PI = 3.14159f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		raio = sc.nextFloat();
		
		result = PI * (raio + raio);
		
		System.out.printf("Area: %.4f", result);
		
		sc.close();
	}

}
