package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Narrador extends Midia {
	private String qualidadeNarracao;
	
	public void gritaGol() {
		System.out.println("GOOOOOOOOOOOOOOOOOOOL!!!!!!!!!!!!!!!!");
	}
	
	public void narraJogo() {
		String[] frase = new String[5];
		frase[0] = "Passou a bola";
		frase[1] = "Cruzou para area";
		frase[2] = "Cabeciou";
		frase[3] = "Tomou cartao";
		frase[4] = "Chutou pra longe!!!!";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println(frase[num]);
	}

	public String getQualidadeNarracao() {
		return qualidadeNarracao;
	}

	public void setQualidadeNarracao(String qualidadeNarracao) {
		this.qualidadeNarracao = qualidadeNarracao;
	}
}
