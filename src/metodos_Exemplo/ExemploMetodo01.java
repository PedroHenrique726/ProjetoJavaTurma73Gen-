package metodos_Exemplo;
import metodos_Exemplo.ExemploMetodo02;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = somar(2, 3);
		
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8, 3));
		
		ExemploMetodo02.mensagem();
		
		ExemploMetodo02.saudacao("Oi, sei la");
	}

	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	/*
	public static void mensagem() {
		System.out.println("Ola turma 73!");
	}
	
	public static void saudacao(String mensagem) {
		System.out.println(mensagem);
	}
*/
}
