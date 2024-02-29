package Exerciciosvetor_matriz;

import java.util.Scanner;

public class Exercicio1 {
	
public static void main(String[] args) {
		
		
		int vet[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, pos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();
		
		for(int i = 0; i < vet.length ; i++) {
			if (num == vet[i]) {
				pos = i;
			}
			
		}
		if(pos != 0) {
			System.out.printf("O número %d está localizado na posição: %d", num, pos);
		}
		else {
			System.out.printf("O número %d não foi encontrado!", num);
		}
		sc.close();
	}

}
