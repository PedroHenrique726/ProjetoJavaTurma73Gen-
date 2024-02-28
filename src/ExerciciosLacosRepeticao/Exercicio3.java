package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
		
		
		int menor = 0, maior = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(num >= 0) {
			System.out.print("Digite uma idade: ");
			num = sc.nextInt();
			
			if(num <21 && num > 0) {
				menor++;
			}else if (num > 50) {
				maior++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		
		
		
		sc.close();
		
	}
}
