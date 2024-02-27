package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean prim;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
		nome = sc.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = sc.nextInt();
		
		System.out.print("Primeira doação de sangue?");
		prim = sc.nextBoolean();
		
		if(18 < idade && idade < 60 ) {
			System.out.println(nome + " está apta para doar sangue!");
		} else if(idade > 60 && idade < 69 && prim != true ) {
			System.out.println(nome + " está apta para doar sangue!");
		}
		else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
		sc.close();
		
	}
}
