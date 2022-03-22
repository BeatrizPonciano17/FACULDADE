=import java.util.Scanner;

public class exercicio14(String[] args)
{
  int tmpTt;
  int tmpHr;
  int tmpMm;
  int tmpSg;
  int tempVar;
  float msInicial;
  float msFinal;
  float tempVar;

  System.out.println("Massa Inicial (em Gramas):\n");
  Scanner in = new Scanner (System.in);
  if (tempVar != null)
  {
	  msInicial = Float.parseFloat(tempVar);
  }

  msFinal = msInicial;
  tmpTt = 0;
  while (msFinal >= 0.5F)
  {
	msFinal = msFinal / 2;
	tmpTt = tmpTt + 50;
  }

  System.out.print("\n");
  System.out.printf("Massa Inicial.: %7.0f gramas.\n", msInicial);
  System.out.printf("Massa Final...: %9.2f gramas.\n", msFinal);

  System.out.print("\n");
  System.out.printf("Tempo Total...: %d segundos.\n", tmpTt);
  tmpHr = (tmpTt / 3600);
  tmpMm = (tmpTt % 3600) / 60;
  tmpSg = (tmpTt % 3600) % 60;
  System.out.printf("Tempo Dividido: %d horas:%d minutos:%d segundos.", tmpHr, tmpMm, tmpSg);
 }
}
