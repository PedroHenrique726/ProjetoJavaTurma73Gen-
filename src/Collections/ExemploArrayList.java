package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Double numero;
		Scanner leia = new Scanner(System.in);
		
		
		notas.add(7.0);
		notas.add(3.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNota cadastradas: " + notas);
		
		System.out.println("Digite a nota que voce deseja procurar: ");
		numero = leia.nextDouble();
		
		
		System.out.println("\nA posição da nota 10 é: " + notas.indexOf(10));
		
		
		leia.close();
	}
}
