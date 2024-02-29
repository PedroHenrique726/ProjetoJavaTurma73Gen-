package Exerciciosvetor_matriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float notas[][] = new float[10][4];
		float medias[] = new float[10];
		float media = 0.0f;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite a " + (j + 1) + "ª nota do aluno " + (i + 1) + ": ");
				notas[i][j] = sc.nextFloat();
			}
		}

		for (int i = 0; i < 10; i++) {
			media = 0;
			for (int j = 0; j < 4; j++) {
				media += (float) notas[i][j];
			}
			medias[i] = (float) media / 4;

		}

		System.out.print("Média dos alunos: ");

		for (int i = 0; i < medias.length; i++) {
			System.out.printf("%.1f ", medias[i]);
		}
		sc.close();

	}
}
