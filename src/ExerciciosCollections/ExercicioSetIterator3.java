package ExerciciosCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSetIterator3 {

public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 10 números não repetidos.");
		for(int i = 0; i <10; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			numeros.add(sc.nextInt());
		}
		
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> numIte = numeros.iterator();
		
		while(numIte.hasNext()) {
			System.out.println(numIte.next());
		}
		
		
		sc.close();
	}
}
