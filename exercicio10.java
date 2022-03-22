import java.util.Scanner;

public class exercicio10 {
	public static void main (String[]args) {
		
		int escolha;
		int cont;
		int soma=0;
		System.out.println("Digite um numero inteiro para calcular a soma dos numeros pares");
		Scanner in = new Scanner (System.in);
		escolha = in.nextInt();
		
			for(cont = 0 ; cont < escolha ; cont ++) {
				if(cont % 2 == 0) {
					soma += cont;
				}
			}
			
		
		System.out.println("soma dos numeros pares do 0 até o número " +escolha+" é de: " + soma);
		
	}

}