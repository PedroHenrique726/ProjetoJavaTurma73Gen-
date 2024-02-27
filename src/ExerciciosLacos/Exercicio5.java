package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		String prod = "";
		float valor = 0.00f;
		int qtd, cod;

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Código do Produto: ");
		cod = sc.nextInt();
		System.out.print("Quantidade: ");
		qtd = sc.nextInt();
		
		
		
		switch(cod) {
			case 1:
				prod = "Cachorro Quente";
				valor = 10.0f;
				break;
			case 2:
				prod = "X-Salada";
				valor = 15.0f;
				break;
			case 3:
				prod = "X-Bacon";
				valor = 18.0f;
				break;
			case 4:
				prod = "Bauru";
				valor = 12.0f;
				break;
				
			case 5:
				prod = "Refrigerante";
				valor = 8.0f;
				break;
			case 6:
				prod = "Suco de laranja";
				valor = 13.0f;
				break;
		}
		
		System.out.println("Produto: " + prod);
		System.out.printf("Valor total: R$ %.2f", (valor * qtd));
		
		sc.close();
	}
}
