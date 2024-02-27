package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int cod;
		float valor, saldo = 1000.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$%.2f", saldo);
			break;
			
		case 2:
			System.out.print("Valor: R$");
			valor = sc.nextFloat();
			System.out.println("Operação - Saque");
			if(valor > saldo) {
				System.out.println("Saldo Insuficiente!");
			}else {
				saldo -= valor;
				System.out.printf("Novo Saldo: R$%.2f", saldo);
			}
			break;
		case 3:
			System.out.print("Valor: R$");
			valor = sc.nextFloat();
			System.out.println("Operação - Deposito");
			saldo += valor;
			System.out.printf("Novo Saldo: R$%.2f", saldo);
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}
		
		
		
		sc.close();
	}
}
