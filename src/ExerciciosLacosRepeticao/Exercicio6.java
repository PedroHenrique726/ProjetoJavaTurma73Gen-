package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

public static void main(String[] args) {
		
		int num = 0, soma = 0, cont = 0;
		float media = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if(num != 0 && num % 3 == 0) {
				soma +=num;
				cont++;
			}
			
		}while(num != 0);
		
		System.out.println(soma + "   " +cont);
		media = (float)soma / (float)cont;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f" , media);
		sc.close();
	}
}
