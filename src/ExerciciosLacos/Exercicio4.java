package ExerciciosLacos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String pal1, pal2, pal3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vertebrado ou Invertebrado?");
		pal1 = sc.nextLine();
		
		if (pal1.equalsIgnoreCase("vertebrado")) {
			System.out.println("Ave ou Mamífero?");
			pal2 = sc.nextLine();
			if (pal2.equalsIgnoreCase("ave")) {
				System.out.println("Carnivoro ou Onivoro?");
				pal3 = sc.nextLine();
				if(pal3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				}else if(pal3.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				}else {
					System.out.println("Palavra digitada invalida. Tente: Carnivoro ou Onivoro");
				}
			}else if(pal2.equalsIgnoreCase("mamifero")){
				System.out.println("Onivoro ou herbivoro?");
				pal3 = sc.nextLine();
				if(pal3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				}else if(pal3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				}else {
					System.out.println("Palavra digitada invalida. Tente: Carnivoro ou Herbivoro");
				}
			}else {
				System.out.println("Palavra digitada invalida. Tente: Ave ou Mamífero");
			}
			
			
			
		}else if(pal1.equals("invertebrado")){
			System.out.println("Inseto ou Anelidio?");
			pal2 = sc.nextLine();
			if (pal2.equalsIgnoreCase("inseto")) {
				System.out.println("Hematofago ou Herbivoro?");
				pal3 = sc.nextLine();
				if(pal3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				}else if(pal3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				}else {
					System.out.println("Palavra digitada invalida. Tente: Hematofago ou Herbivoro");
				}
			}else if(pal2.equalsIgnoreCase("anelidio")) {
				System.out.println("Hematofago ou Onivoro?");
				pal3 = sc.nextLine();
				if(pal3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				}else if(pal3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}else {
					System.out.println("Palavra digitada invalida. Tente: Hematofago ou Onivoro");
				}
			}else {
				System.out.println("Palavra digitada invalida. Tente: Inseto ou Anelidio");
			}
						
		} else {
			System.out.println("Palavra digitada invalida. Tente: Vertebrado ou Invertebrado");
		}
				
		sc.close();
	}
}
