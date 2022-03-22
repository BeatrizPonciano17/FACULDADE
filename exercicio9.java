import java.util.Scanner;

public class exercicio9 {
	public static void main (String[]args) {
		float num1, num2,num3, num4,num5 , soma, media;
		
		System.out.println("Digite 5 numeros: ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextFloat();
		num2 = in.nextFloat();
		num3 = in.nextFloat();
		num4 = in.nextFloat();
		num5 = in.nextFloat();
		
		soma = num1 + num2 + num3 + num4+ num5;
		
		System.out.println("A soma dos valores digitado foi de: "+ soma);
		
		media = soma /5;
		
		System.out.println("A média dos valores digitado é de: "+ media);
		
	}
}