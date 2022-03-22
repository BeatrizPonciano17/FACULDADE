import java.util.Scanner;

public class exercicio6 {
	public static void main (String[]args) {
		double rendimento;
		double aliq ;
		double imposto;
		
		System.out.println("Informe o salario Anual: ");
		Scanner in = new Scanner (System.in);
		rendimento = in.nextDouble();
		
		if (rendimento <= 1200.00 ) {
			System.out.println("O imposto a ser pago é de R$ 0,00 ");
			
		}
		if(rendimento >=1200.01 && rendimento <=2300.00) {
			imposto = rendimento * (7.5/100);
			System.out.println("O imposto a ser pago é de R$ "+imposto);
		}
		if(rendimento >= 2300.01 && rendimento <= 3700.00 ) {
			imposto = rendimento * (12.5/100);
			System.out.println("O imposto a ser pago é de R$ "+imposto);
		}
		if(rendimento >= 3700.01 && rendimento <= 5100.00 ) {
			imposto = rendimento * (17.5/100);
			System.out.println("O imposto a ser pago é de R$ "+imposto);
		}
		if(rendimento >= 5100.01 ) {
			imposto = rendimento * (27.5/100);
			System.out.println("O imposto a ser pago é de R$ "+imposto);
		}
		
	}
}