import java.util.Scanner;

public class exercicio5 {
	public static void main (String[]args) {
		int num;
		int numB;
		int numA;
		int soma;
		
		System.out.println("Digite um numero de 4 casas: ");
		Scanner in = new Scanner (System.in);
		num=in.nextInt();
		
		numB = num % 100 ;
		numA = num / 100 ;
		
		System.out.println("Dividindo em duas dezenas temos: \nNumero 1: " + numA +"\nNumero 2: "+ numB);
	
		
		soma = numA+numB;
		
		System.out.println("A soma é das duas dezenas é de: "+ soma);
		
		int quadrado = soma*soma;
		
		if(quadrado == num) {
			System.out.println("\n\no numero informado foi: "+num);
			System.out.println("o quadrado do numero informado é: " +quadrado );
			System.out.println("A soma das duas dezenas é o quadrado do numero informado");
			
		}else {
			System.out.println("\n\no numero informado foi: "+num);
			System.out.println("o quadrado do numero informado é: " +quadrado );
			System.out.println("A soma das duas dezenas não é o quadrado do numero informado ");
			
		}
		
		
		
	}

}