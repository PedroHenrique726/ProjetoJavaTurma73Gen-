package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArray2 {
	public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int number = 0;

	list.add(2);
	list.add(5);
	list.add(1);
	list.add(3);
	list.add(4);
	list.add(9);
	list.add(7);
	list.add(8);
	list.add(10);
	list.add(6);
	
	
	System.out.print("Digite o número que você deseja encontrar: ");
	number = sc.nextInt();
	
	if(list.indexOf(number) != -1) {
		System.out.println("O número 7 está localizado na posição: " + list.indexOf(number));
	}else {
		System.out.println("O número "+ number +" não foi encontrado!");
	}
	

	
	sc.close();
	
}

}
