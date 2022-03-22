import java.util.Scanner;

public class exercicio7 {
	public static void main (String[]args) {
		int opcao;
		int num1;
		int num2;
		
		System.out.println("digite 2 numeros inteiros para operação: ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		System.out.println("Qual operação você deseja realizar\n1 para SOMA\n2 para SUBTRAÇÃO\n3 para MULTIPLICAÇÃO\n4 para DIVISÃO");
		opcao = in.nextInt();
		switch(opcao) {
			case 1 : 
				int soma = num1 + num2 ;
					System.out.println("A soma é: "+ soma);
			break;
			case 2:
				if(num1 > num2) {
					int sub = num1 - num2;
					System.out.println("A subtração do maior numero pelo menor numero é de: " + sub);
					break;
				}
				if(num2 > num1) {
					int sub = num2 - num1;
					System.out.println("A subtração do maior numero pelo menor numero é de: " + sub);
					break;
				}
				if(num1 == num2) {
					int sub = num1 - num2;
					System.out.println("A subtração dos 2 numeros é de: " + sub);
					break;
				}
			break;
			case 3 :
				int mult = num1 * num2 ;
				System.out.println("A multiplicação é: "+ mult);
			break;
			case 4:
				if(num2 == 0) {
					System.out.println("A operação não é válida, o denominador não pode ser 0");
					break;
				}
				double div = num1 / num2;
				System.out.println("A divisão é: "+ div);
			break;
		}
		
		
		
	}
	
}