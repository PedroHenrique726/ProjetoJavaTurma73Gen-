package ExerciciosCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

public static void main(String[] args) {
		
		int escolha = 0;
		Queue<String> clientes = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1- Adicionar Clientes na Fila");
			System.out.println("2- Listar todos os Clientes");
			System.out.println("3- Retirar Clientes da Fila");
			System.out.println("0- Sair");
			
			System.out.print("Digite uma opção: ");
			
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 1: 
				System.out.println();
				System.out.print("Digite o nome: ");
				String cliente = sc.next();
				
				clientes.add(cliente);
				System.out.println("\n" + clientes);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("\nFila de Clientes: ");
				for(String cliente1 : clientes) {
					if(cliente1 != null) {
					System.out.println(cliente1);
					}
				}
				
				break;
			case 3:
				if(clientes.isEmpty())
				{
					System.out.println("\n\n--A Fila está vazia!--");
				}else {
					System.out.println("O cliente " + clientes.poll() + " foi chamado.");
					System.out.println("Fila atual: ");
					for(String cliente1 : clientes) {
						if(cliente1 != null) {
						System.out.println(cliente1);
						}
					}
					}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
			default:
				System.out.println("\nOpção invalida");
				break;
			}
			
			
			
		}while(escolha!=0);
		
		
		
		sc.close();
	}
}
