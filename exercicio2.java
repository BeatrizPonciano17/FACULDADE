import java.util.Scanner;

public class exercicio2 {
	public static void main (String[]args) {
		double salario;
		double reajuste = 0.05;
		
		double salarioComReajuste ;
		double salarioComReajusteFinal;
		int abono = 100;
		double salarioComAbono;
		
		System.out.println("Digite o salario do funcionário: ");
		Scanner in = new Scanner (System.in);
		salario = in.nextDouble();
		salarioComReajuste = salario * reajuste; 
		salarioComReajusteFinal = salario + salarioComReajuste;
		
		
		if(salario < 750) {
			salarioComAbono = salarioComReajusteFinal + abono;
			System.out.println("O Salario com reajuste de 5% e com o abono de 100 é de: " + salarioComAbono);
		}else {
		System.out.println("O Salario com reajuste de 5% é de: "+ salarioComReajusteFinal );
		}
		
	}

}