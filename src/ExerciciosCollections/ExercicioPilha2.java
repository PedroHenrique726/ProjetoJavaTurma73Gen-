package ExerciciosCollections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Scanner sc = new Scanner(System.in);

		int escolha = 0;
		do {
			System.out.println("\n1- Adicionar Livro na pilha");
			System.out.println("2- listar todos os Livros");
			System.out.println("3- Retirar livro da pilha");
			System.out.println("0- Sair");
			System.out.print("Digite uma opção: ");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				sc.nextLine();
				System.out.print("\nDigite o nome do livro: ");
				String livro = sc.nextLine();
				livros.push(livro);
				System.out.println("O livro: '" + livros.peek() + "' foi adicionado.");
				break;
			case 2:
				System.out.println("\nLista de livros da pilha: ");
				for (String livroo : livros) {
					if (livroo != null) {
						System.out.println(livroo);
					}
				}

				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("\n--A Pilha está vazia!--");
				} else {
					System.out.println("\nO livro: '" + livros.pop() + "' foi retirado");
					System.out.println("\nNova pilha: ");
					for (String livroo : livros) {
						if (livroo != null) {
							System.out.println(livroo);
						}
					}
				}
				break;
			case 0:
				System.out.println("\n\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção invalida\n\n");
				break;

			}

		} while (escolha != 0);

		sc.close();
	}
}
