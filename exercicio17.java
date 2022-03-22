Escreva um algoritmo que crie uma matriz de n�meros inteiros de dimens�o 2x2 e realize as seguintes a��es: 
a-) Preencha a matriz com n�meros informados pelo usu�rio; 
b-) Calcula e retorna o determinante da matriz; 
c-) Calcule e imprima a matriz transposta; 
d-) Verifica se a matriz � sim�trica (uma matriz � sim�trica se ela for igual � sua transposta).

import java.util.Scanner;

public class exercicio17 {
	public static void main (String[]args) {
			 int i;
			 int j;
			 int[][] m = new int[2][2];
			 int[] v = new int[2];
			 
			 
			 System.out.print("::: Informe os elementos do vetor :::\n");
			 for (i = 0;i < 2;i++)
			 {
			 System.out.printf("Elemento[%d]= ",i);
			 Scanner in = new Scanner(System.in);
			 if (tempVar != null)
			 {
				 v[i] = Integer.parseInt(tempVar);
			 }
			 }
			 
			 System.out.print("::: Informe os elementos da matriz :::\n");
			 for (i = 0;i < 2;i++)
			 {
			 for (j = 0;j < 2;j++)
			 {
			 System.out.printf("Elemento[%d][%d]= ",i,j);
			 Scanner in = new Scanner(System.in);
			 if (tempVar2 != null)
			 {
				 m[i][j] = Integer.parseInt(tempVar2);
			 }
			 }
			 }

			 System.out.print("\n::: Valores Originais do Vetor :::\n");
			 Scanner in = new Scanner(System.in);
			 for (i = 0;i < 2;i++)
			 {
			 System.out.printf("%d ",v[i]);
			 }
			 System.out.print("\n::: Valores Originais da Matriz :::\n");
			 for (i = 0;i < 2;i++)
			 {
			 for (j = 0;j < 2;j++)
			 {
			 System.out.printf("%d ",m[i][j]);
			 }
			 System.out.print("\n");
			 }

			 for (i = 0;i < 2;i++)
			 {
			 for (j = 0;j < 2;i++)
			 {
			 m[i][j] = v[i] * m[i][j];
			 }
			 }

			 System.out.print("\n::: Valores Multiplicados :::\n");
			 Scanner in = new Scanner(System.in);
			 
			 for (i = 0;i < 2;i++)
			 {
			 for (j = 0;j < 2;j++)
			 {
			 System.out.printf("%d ",m[i][j]);
			 }
			 System.out.print("\n");
			 }
			}
		}

	}
	
}
