package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArray1 {

public static void main(String[] args) {
		
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 cores: ");
		for(int i = 0; i <5 ;i++) {
			System.out.print("Digite a " + (i+1) + "ª cor: ");
			cores.add(sc.nextLine());
		}
		
		System.out.println("\nlista das cores: ");
		
		for(String cor : cores) {
			System.out.println(cor);
		}
		
	
		cores.sort(null);
		
		
		System.out.println("\nlista das cores: ");
		
		
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		
		sc.close();
		
	}
}
