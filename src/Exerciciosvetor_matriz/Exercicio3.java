package Exerciciosvetor_matriz;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		
		int mat[][] = new int [3][3];
		int somaPrinc = 0;
		int somaSec = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os elementos da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nElementos da Diagonal Principal: ");
		
		for(int i =0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			somaPrinc += mat[i][i];
			
		}
		
		
		System.out.print("\nElementos da Diagonal Secundária: ");
		for (int i = 0; i < mat.length ; i++) {
			
			System.out.print(mat[i][((mat.length-i)-1)] + " ");
			
		}
		
		somaSec +=  mat[0][2] + mat[1][1]+  mat[2][0];
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrinc);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSec);
		
		sc.close();
		
	
	}
	

}
