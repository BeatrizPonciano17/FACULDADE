import java.util.Scanner;	

public class exercicio3 {
	
public static void main (String []args) {
		
		int ano;
		System.out.println("Digite um ano para saber se ele � bissexto ou n�o: ");
		Scanner in = new Scanner (System.in);
		ano = in.nextInt();
			
		if((ano % 4 ==0) || (ano%4 == 0 && ano%100 != 0) ) {
		System.out.println("O ano � bissexto!");
		}else {
			System.out.println("O ano n�o � bissexto");
		}
}

}