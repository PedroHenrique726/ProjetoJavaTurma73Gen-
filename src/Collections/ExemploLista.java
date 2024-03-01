package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLista {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for (int i = 0; i<= 10; i++) {
			fila.add(i);
		}
		
		System.out.println("\nElementos na fila: " + fila);
		
		System.out.println("\nRemover item da lista: " + fila.remove());
		
		System.out.println("\nFila atualizada: " + fila);
		
		System.out.println("\nAdicionar elemento 11: " + fila.add(11));
		
		System.out.println("\nFila atualizada: " + fila);
		
		System.out.println("\nExibir o primeiro elemento da fila: " + fila.peek());
		
		
		Iterator<Integer> iterator = fila.iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpar a fila");
		fila.clear();
		System.out.println("\nA fila esta vazia? " + fila.isEmpty());
		
	}
}
