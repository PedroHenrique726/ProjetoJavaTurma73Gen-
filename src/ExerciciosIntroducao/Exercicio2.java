package ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 4 notas: ");
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota4 + nota3)/4;
		
		System.out.printf("Média: %.1f", media);
		
		sc.close();
		
	}

}
