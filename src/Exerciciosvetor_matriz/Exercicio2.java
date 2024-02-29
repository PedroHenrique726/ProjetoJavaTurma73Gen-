package Exerciciosvetor_matriz;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
		
		int vet[] = new int [10];	
		int soma = 0;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os numeros do vetor: ");
		for(int i = 0; i < 10 ; i++) {
			
			vet[i] = sc.nextInt();
			soma += vet[i];
		}
		
		System.out.println("Elementos nos índices ímpares: " + vet[1] + " " + vet[3] + " " + vet[5] + " " + vet[7] + " " + vet[9]);
		
		System.out.print("Elementos pares: ");
		
		for(int i = 0; i < 10 ; i++) {
			
			if(vet[i] % 2 ==0) {
				System.out.print( vet[i] + " ");
			}
		
		}
		
		
		
		
		System.out.println("\nSoma: " + soma);
		
		System.out.printf("Média: %.1f", ((float)soma / (float)vet.length));
		
		sc.close();
		
	}
}
