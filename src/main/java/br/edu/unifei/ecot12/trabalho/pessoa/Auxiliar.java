package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Auxiliar extends ComissaoTecnica {
	public void entregaAgua() {
		System.out.println("Entregou agua para o atleta");
	}

	public void auxiliaTecnico() {
		String[] ajuda = new String[3];
		ajuda[0] = "Palpitou na decisao do tecnico";
		ajuda[1] = "Ajudou no aquecimento";
		ajuda[2] = "Informou quem vai entrar em campo";

		Random rand = new Random();
		int num = rand.nextInt(3);
		System.out.println(ajuda[num]);
	}
}
