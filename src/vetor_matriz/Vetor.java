package vetor_matriz;

import java.util.Scanner;

public class Vetor {

public static void main(String[] args) {
		
		String cachorros[] = new String[3];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		
		for(indice = 0; indice < 3; indice++) {
			System.out.println("Digite o " + (indice+1) + "o nome: ");
			
			cachorros[indice] = leia.nextLine();
		}
		
		for(indice = 0; indice < cachorros.length; indice++) {
			System.out.println("Cachorros[" + indice +"]: " + cachorros[indice] );
		}
		
		
		leia.close();
		
	}

}
