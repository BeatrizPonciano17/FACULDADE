import java.util.Scanner;

public class exercicio15 {
	public static void main (String[]args) {
		int opcaoLaco;
		int opcaoCase;
		int num1;
		int num2;
		
		
		
		Scanner in = new Scanner(System.in);
		
		do {
			
		System.out.println("Qual opera��o voc� deseja realizar\n1 para SOMA\n2 para SUBTRA��O\n3 para MULTIPLICA��O\n4 para DIVIS�O");	
		opcaoCase = in.nextInt();
		System.out.println("digite dois numeros para realizar a opera��o: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		switch (opcaoCase) {
		case 1 : int soma = num1 + num2;
			System.out.println("A Soma � de: "+ soma);
		break;
		case 2 : int sub = num1 - num2;
			System.out.println("A Subtra��o � de: " + sub);
		break;
		case 3 : int mult = num1 - num2;
			System.out.println("A Multiplica��o � de: " + mult);
		break;
		case 4 : int div = num1 / num2;
			System.out.println("A divis�o � de: "+ div);
		break;
		default : System.out.println("A op��o � inv�lida!");
		}
			
			System.out.println("Voce deseja continuar no programa?\nDigite 1 para SIM ou 2 para N�O");
			opcaoLaco = in.nextInt();
		}while(opcaoLaco == 1);
		
		
		
	}

}