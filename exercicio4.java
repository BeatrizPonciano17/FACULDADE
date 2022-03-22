import java.util.Scanner;

public class exercicio4 {
	public static void main (String[]args) {
		int opcao;
		float temp;
		
		System.out.println("Qual a temperatura? : ");
		Scanner in = new Scanner(System.in);
		temp = in.nextFloat();
		
		System.out.println("Qual conversão você deseja realizar para a temperatura?\nDigite 1 para Kelvin \nDigite 2 para Réaumur \nDigite 3 para Rankine\nDigite 4 Fahrenheit ");
		opcao = in.nextInt();
		
		switch(opcao) {
			case 1 : 
				double kelvin;
				kelvin = temp  + 273.15;
				System.out.println("A temperatura em KELVIN é de: "+kelvin);
				break;
			case 2 : 
				double reau;
				reau = temp * 0.8;
				System.out.println("A temperatura em RÉAUMUR é de: "+reau);
				break;
			case 3 : 
				double ran;
				ran = (temp *1.8) +32 +459.67;
				System.out.println("A temperatura em RANKINE é de: "+ran);
				break;
			case 4 : 
				double fa;
				fa = (temp * 1.8) + 32;
				System.out.println("A temperatura em FAHRENHEIT é de: "+ fa);
				break;
			default : System.out.println("A opção informada não é válida ");
		}
	}

}