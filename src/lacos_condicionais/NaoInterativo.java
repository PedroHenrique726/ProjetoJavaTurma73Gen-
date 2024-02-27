package lacos_condicionais;

public class NaoInterativo {

	public static void main(String[] args) {
//		
//		int idade = 18;
//		
//		if (idade >= 18) {
//			System.out.println("Você é maior de idade.");
//		} else {
//			System.out.println("Você é menor de idade");
//		}
		
		
		int x = 9, y = 10;
		
		if(x > y) {
			System.out.println("X é maior que Y");
		}
		else if(x == y) {
			System.out.println("Não tem maior");
		}
		else {
			System.out.println("Y é maior que X");
		}
	}
}
