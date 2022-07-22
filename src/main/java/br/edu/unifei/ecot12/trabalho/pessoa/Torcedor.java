package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;
import br.edu.unifei.ecot12.trabalho.futebol.Uniforme;

public abstract class Torcedor extends Pessoa {

	private String ingresso;
	private Uniforme uniforme;

	public Torcedor() {

	}

	public String getIngresso() {
		return ingresso;
	}

	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	
	public Uniforme getUniforme() {
		return uniforme;
	}

	public void setUniforme(Uniforme uniforme) {
		this.uniforme = uniforme;
	}

	public void cantaHino() {
		System.out.println("musica do hino do time");
	}

	public void xingaJuiz() {
		System.out.println("juiz de ladrão");
	}

	public void xingaTecnico() {
		System.out.println("tecnico de ruim");
	}

	public void xingaJogador() {
		System.out.println("vaia jogador");
	}

	public void gritaOle() {
		System.out.println("Oleeeeeee");
	}

	public void canta() {
		System.out.println("Uma musica qualquer");
	}
}
