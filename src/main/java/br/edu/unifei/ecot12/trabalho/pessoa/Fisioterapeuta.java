package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Fisioterapeuta extends ComissaoTecnica {

	public void fazMassagem() {
		String[] massagem = new String[5];
		massagem[0] = "Aliviou a caimbra";
		massagem[1] = "Aplicou spray na distencao muscular";
		massagem[2] = "Aliviou a tensao do musculo";
		massagem[3] = "Ajudou no alongamento";
		massagem[4] = "Fez massagem";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println(massagem[num]);
	}
}
