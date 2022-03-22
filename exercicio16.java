import java.util.Scanner;

public class exercicio16 {
	public static void main(String[]args) {
		int numVetor[] = new int[10];
		int cont;
		int numComparacao;
		Scanner in = new Scanner (System.in);
		
		
		for(cont = 0 ; cont <10; cont ++) {
			System.out.println("digite um numero: ");
			numVetor[cont] = in.nextInt();
			
		}
		System.out.println("Digite outro numero para comparar: ");
		numComparacao = in.nextInt();
		boolean numExiste = false;
		
		for(cont = 0 ; cont <10 ; cont ++) {
			if(numComparacao == numVetor[cont]) {
				System.out.println("esta no vetor!! Posição no Array:" + cont );
				numExiste = true;
				break;
				
			} 
			
		}
		if(!numExiste){
			System.out.println("Número não encontrado! ");
			
		}
		
		
	}
}