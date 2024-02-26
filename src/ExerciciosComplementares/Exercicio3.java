package ExerciciosComplementares;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int entrada, seg, min, hr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em segundos: ");
		entrada = sc.nextInt();
		
		if (entrada < 60) {
			System.out.println("Valor Formatado: 0:0:" + entrada);
		}
		else if(entrada > 60 && entrada < 3600) {
			seg = entrada % 60;
			min = entrada / 60;
			System.out.println("Valor Formatado: 0:" + min + ":" + seg);
		}
		
		else if(entrada > 3600 ) {
			
			hr = entrada / 3600;
			entrada = entrada % 3600;
			min = entrada / 60;
			seg = entrada % 60;
			
			System.out.println("Valor Formatado: " + hr + ":" + min + ":" + seg);
		}
		
		
		sc.close();
		
	}
}
