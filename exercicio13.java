import java.util.Scanner;

public class exercicio13 {
	public static void main (String[]args) {
		int num ; 
		int cont = 0 ; 
		
		int media;
		int soma = 0;
		Scanner in = new Scanner (System.in);
		num = in.nextInt();
	
		int maior = num; 
		int menor = num;
		
		 do{
			 System.out.println("Digite um número: ");
				if(num>0) { 
				cont ++; 
				soma += num; 
				
				if(num > maior ) {
					
					maior = num;
					}
				 if(num < menor){
			            menor = num;
				 	}
					
					}
				num = in.nextInt();
			
		}while(num > 0);
		media = soma / (cont);
		System.out.println("A media dos valores é de: "+ media);
		System.out.println("O menor numero digitado é " + menor);
		System.out.println("O maior numero digitado é " + maior);
		
	}

}