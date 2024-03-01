package Collections;

import java.util.Stack;

public class ExemploFila {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");
		pilha.push("Prato Azul");
		pilha.push("Prato branco");
		pilha.push("Prato amarelo");
		pilha.push("Prato vermelho");
		
		System.out.println("\nElementos da pilha: " + pilha);
		System.out.println("\nRetirar elemento: " + pilha.pop());
		System.out.println("\nMostrar pilha: " + pilha);
		
		
	}
}
