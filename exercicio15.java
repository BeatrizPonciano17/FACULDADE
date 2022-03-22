import java.util.Scanner;

public class exercicio15 {
	public static void main (String[]args) {
		int opcaoLaco;
		int opcaoCase;
		int num1;
		int num2;
		
		
		
		Scanner in = new Scanner(System.in);
		
		do {
			
		System.out.println("Qual operação você deseja realizar\n1 para SOMA\n2 para SUBTRAÇÃO\n3 para MULTIPLICAÇÃO\n4 para DIVISÃO");	
		opcaoCase = in.nextInt();
		System.out.println("digite dois numeros para realizar a operação: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		switch (opcaoCase) {
		case 1 : int soma = num1 + num2;
			System.out.println("A Soma é de: "+ soma);
		break;
		case 2 : int sub = num1 - num2;
			System.out.println("A Subtração é de: " + sub);
		break;
		case 3 : int mult = num1 - num2;
			System.out.println("A Multiplicação é de: " + mult);
		break;
		case 4 : int div = num1 / num2;
			System.out.println("A divisão é de: "+ div);
		break;
		default : System.out.println("A opção é inválida!");
		}
			
			System.out.println("Voce deseja continuar no programa?\nDigite 1 para SIM ou 2 para NÃO");
			opcaoLaco = in.nextInt();
		}while(opcaoLaco == 1);
		
		
		
	}

}