package ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario, abono, novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		salario = sc.nextFloat();
		System.out.print("Digite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
		sc.close();
	}

}
