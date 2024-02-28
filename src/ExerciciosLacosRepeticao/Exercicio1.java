package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	int num1, num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o primeiro número do intervalo: ");
	num1 = sc.nextInt();
	
	System.out.print("Digite o último número do intervalo: ");
	num2 = sc.nextInt();
	
	
	if(num2 < num1) {
		System.out.println("Intervalo inválido!");
	}
	else {
		for(int i = num1; i < num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
	}
	sc.close();
}
}