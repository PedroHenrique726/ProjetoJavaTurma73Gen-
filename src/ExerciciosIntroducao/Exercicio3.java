package ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bruto, noturno, horas, descontos, liquido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		bruto = sc.nextDouble();
		
		System.out.print("Adicional Noturno: ");
		noturno = sc.nextDouble();
		
		System.out.print("Horas Extras: ");
		horas = sc.nextDouble();
		
		System.out.print("Descontos: ");
		descontos = sc.nextDouble();
		
		liquido = bruto + noturno + (horas * 5) - descontos;
		
		System.out.printf("Salário Liquido: R$%.2f", liquido);
		
		sc.close();
		
	}

}
