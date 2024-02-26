package ExerciciosComplementares;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int entrada, seg, min, hr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em segundos: ");
		entrada = sc.nextInt();
		
		hr = entrada /3600;
		entrada %= 3600;
		
		min = entrada / 60;
		entrada %= 60;
		
		seg = entrada;
		
		System.out.printf("Valor Formatado: %d:%d:%d", hr, min, seg);
		
		sc.close();
		
	}
}
