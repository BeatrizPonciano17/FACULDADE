import java.util.Scanner;

public class exercicio7 {
	public static void main (String[]args) {
		int opcao;
		int num1;
		int num2;
		
		System.out.println("digite 2 numeros inteiros para opera��o: ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		System.out.println("Qual opera��o voc� deseja realizar\n1 para SOMA\n2 para SUBTRA��O\n3 para MULTIPLICA��O\n4 para DIVIS�O");
		opcao = in.nextInt();
		switch(opcao) {
			case 1 : 
				int soma = num1 + num2 ;
					System.out.println("A soma �: "+ soma);
			break;
			case 2:
				if(num1 > num2) {
					int sub = num1 - num2;
					System.out.println("A subtra��o do maior numero pelo menor numero � de: " + sub);
					break;
				}
				if(num2 > num1) {
					int sub = num2 - num1;
					System.out.println("A subtra��o do maior numero pelo menor numero � de: " + sub);
					break;
				}
				if(num1 == num2) {
					int sub = num1 - num2;
					System.out.println("A subtra��o dos 2 numeros � de: " + sub);
					break;
				}
			break;
			case 3 :
				int mult = num1 * num2 ;
				System.out.println("A multiplica��o �: "+ mult);
			break;
			case 4:
				if(num2 == 0) {
					System.out.println("A opera��o n�o � v�lida, o denominador n�o pode ser 0");
					break;
				}
				double div = num1 / num2;
				System.out.println("A divis�o �: "+ div);
			break;
		}
		
		
		
	}
	
}