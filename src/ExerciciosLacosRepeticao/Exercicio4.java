package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, gen, des, back = 0, muFron = 0, hMob40 = 0, nbFull30 = 0, total = 0;
		float media = 0.0f;
		String sn = "s";

		while (sn.equalsIgnoreCase("s")) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Identidade de Gênero: ");
			gen = sc.nextInt();
			System.out.print("Pessoa Desenvolvedora: ");
			des = sc.nextInt();

			if (des == 1) {
				back++;
			} else if ((gen == 1 || gen == 4) && des == 2) {
				muFron++;
			} else if ((gen == 2 || gen == 5) && des == 3 && idade > 40) {
				hMob40++;
			} else if (gen == 3 && des == 4 && idade < 30) {
				nbFull30++;
			}

			media += idade;
			total++;

			System.out.print("Deseja continuar (S/N): ");
			sn = sc.next();

		}

		media = media / total;

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + muFron);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hMob40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFull30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", media);

		sc.close();

	}
}
