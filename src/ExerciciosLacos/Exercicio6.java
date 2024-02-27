package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		String nome = "", cargo = "";
	
		int cod = 0;
		float sal = 0.0f, perc = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nome = sc.nextLine();
		
		System.out.print("Cargo: ");
		cod = sc.nextInt();
		
		System.out.print("Salário: R$ ");
		sal = sc.nextFloat();
		
		switch(cod) {
			case 1:
				cargo = "Gerente";
				perc = 0.1f;
				break;
			case 2:
				cargo = "Vendedor";
				perc = 0.07f;
				break;
			case 3:
				cargo = "Supervisor";
				perc = 0.09f;
				break;
			case 4:
				cargo = "Motorisa";
				perc = 0.06f;
				break;
			case 5:
				cargo = "Estoquista";
				perc = 0.05F;
				break;
			case 6:
				cargo = "Tecnico de TI";
				perc = 0.08F;
				break;
				
		}
		//sal = sal + (sal * perc);
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: "+ cargo);
		System.out.printf("Salário: R$ %.2f", (sal + (sal * perc)));
		
		sc.close();
	}
}
