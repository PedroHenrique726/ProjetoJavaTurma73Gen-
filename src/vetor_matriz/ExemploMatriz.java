package vetor_matriz;

public class ExemploMatriz {
	
	
public static void main(String[] args) {
		
		int numeros [][] = {{10,15,35},{75,120,140},{50,100,150}};
		
		int [][] matriz= new int [3][3];
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna <3; coluna++) {
				
				System.out.println("Número [" + linha + "], coluna [" + coluna + "]: " + numeros[linha][coluna]);
			}
			
		}
		
		
	}
	
	
	
	
}
