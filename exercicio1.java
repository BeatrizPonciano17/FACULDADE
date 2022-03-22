import java.util.Scanner;

public class exercicio1 {
	public static void main (String[]args) {
		float notaA,notaB,notaC,notaD;
		float mediaNotas;
		
		System.out.println("Digite as 4 notas do aluno");
		Scanner in = new Scanner (System.in);
		notaA = in.nextFloat();
		notaB = in.nextFloat();
		notaC = in.nextFloat();
		notaD = in.nextFloat();
		mediaNotas = (notaA + notaB + notaC + notaD) /4;
		
		System.out.println("A média das notas do aluno é de: "+mediaNotas);
		
		if(mediaNotas >= 6) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
		
	}
}