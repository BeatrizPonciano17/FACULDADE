import java.util.Scanner;

public class exercicio11 {
	public static void main(String[]args) {
		
		int cont = 0;
		double media;
		int soma =0 ;
		int num;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite um número: ");
			
			num = in.nextInt();
			cont ++;
			soma += num;
			
		}while(num != 0);
		System.out.println("A soma dos numeros é de: "+ soma);
		media = soma / (cont-1);
		System.out.println("A media dos valores informados é de: "+ media);
		
		
	}

}