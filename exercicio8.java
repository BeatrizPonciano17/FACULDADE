import java.util.Scanner;

public class exercicio8 {

	public static void main(String[]args) {
		
		int data;
		int ano;
		int mes1;
		int mes;
		int dia;
		System.out.println("Digite uma data no formato de ddmmaa");
		Scanner in = new Scanner(System.in);
		data = in.nextInt();
		ano = data % 100;
		mes1 = data/100;
		mes = mes1 %100;
		dia = mes1 /100;
		
		
		if((ano % 4 ==0) || (ano%4 == 0 && ano%100 != 0) && mes == 2 && dia <=29) {
				if(mes<=12 && mes == 2 && dia <=29) {
				    System.out.println("A data é dd "+dia+ "mes "+ mes+ "ano "+ano);  
				}
				
		} else if(mes<=12 && mes == 1 && dia <=31 || mes == 3 && dia <=31 || mes == 5 && dia <=31
				|| mes == 7 && dia <=31 || mes == 8 && dia <=31 || mes == 10 && dia <=31
				|| mes == 12 && dia <=31 || mes == 4 && dia <=30 || mes == 6 && dia <=30
				|| mes == 9 && dia <=30 || mes == 11 && dia <=30 || mes == 2 && dia <=28) {
		
			    System.out.println("A data é dd "+dia+ "mes "+ mes+ "ano "+ano);			
		}else {
				System.out.println("Digite uma data válida");
			}		
	}
}