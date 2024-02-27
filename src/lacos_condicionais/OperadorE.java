package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		boolean carteiraM = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();
		
		System.out.println("Voce tem carteira de motorista? (true/false)");
		carteiraM = sc.nextBoolean();
		
		if(idade >= 18 && carteiraM) {
			System.out.println("Pode dirigir");
		}
		else {
			System.out.println("não pode dirigir");
		}
		
		
		
		
		
		float n1, n2, med;
		
		System.out.println("Digite a primeira nota:");
		n1 = sc.nextFloat();
		
		System.out.println("Digite a nota 2");
		n2 = sc.nextFloat();
		
		med = (n1 + n2) / 2;
		
		if (med >= 6) {
			System.out.println("Parabens, aprovado");
		}
		else if (med >= 5) {
			System.out.println("Está de exame");
		}else {
			System.out.println("Está reprovado");
		}
		
		sc.close();
	}

}
