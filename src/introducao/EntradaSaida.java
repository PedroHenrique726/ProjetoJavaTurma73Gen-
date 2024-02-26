package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Nome: " + nome + "\nIdade: " + idade);
		
		
		sc.close();
	}

}
