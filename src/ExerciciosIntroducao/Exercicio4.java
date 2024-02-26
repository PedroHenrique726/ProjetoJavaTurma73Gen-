package ExerciciosIntroducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float diferenca;
		List<Float> numero = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Numero" + (i+1) + ": ");
			numero.add(sc.nextFloat());	
		}
		
		diferenca = (numero.get(0) * numero.get(1)) - (numero.get(2) * numero.get(3));
		
		System.out.printf("Diferença: %.1f", diferenca);
		sc.close();
		
	}

}
