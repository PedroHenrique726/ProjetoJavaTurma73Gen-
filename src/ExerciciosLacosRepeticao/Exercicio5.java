package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

public static void main(String[] args) {
		
		int soma = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			if(num > 0) {
				soma += num;
			}
			
			
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		sc.close();
	}
}
