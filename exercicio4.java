import java.util.Scanner;

public class exercicio4 {
	public static void main (String[]args) {
		int opcao;
		float temp;
		
		System.out.println("Qual a temperatura? : ");
		Scanner in = new Scanner(System.in);
		temp = in.nextFloat();
		
		System.out.println("Qual convers�o voc� deseja realizar para a temperatura?\nDigite 1 para Kelvin \nDigite 2 para R�aumur \nDigite 3 para Rankine\nDigite 4 Fahrenheit ");
		opcao = in.nextInt();
		
		switch(opcao) {
			case 1 : 
				double kelvin;
				kelvin = temp  + 273.15;
				System.out.println("A temperatura em KELVIN � de: "+kelvin);
				break;
			case 2 : 
				double reau;
				reau = temp * 0.8;
				System.out.println("A temperatura em R�AUMUR � de: "+reau);
				break;
			case 3 : 
				double ran;
				ran = (temp *1.8) +32 +459.67;
				System.out.println("A temperatura em RANKINE � de: "+ran);
				break;
			case 4 : 
				double fa;
				fa = (temp * 1.8) + 32;
				System.out.println("A temperatura em FAHRENHEIT � de: "+ fa);
				break;
			default : System.out.println("A op��o informada n�o � v�lida ");
		}
	}

}