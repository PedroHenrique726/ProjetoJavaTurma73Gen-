package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para X:");
		x = sc.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		y = sc.nextInt();
		
		if (x > y) {
			System.out.println("X maior que Y");
		}else if(x == y) {
			System.out.println("Não tem maior");
		}else {
			System.out.println("Y é maior que X");
		}
		
		sc.close();
	}
}
