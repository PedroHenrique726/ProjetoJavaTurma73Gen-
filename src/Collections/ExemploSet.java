package Collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	
	public static void main(String[] args) {
		
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Maça");
		setFrutas.add("Morango");
		setFrutas.add("Pera");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collection: " + setFrutas);
		
		for (String fruta : setFrutas) {
			System.out.println("A posiçãop da fruta: " + fruta + " é: " + fruta.hashCode());
		}
		
	}

}
