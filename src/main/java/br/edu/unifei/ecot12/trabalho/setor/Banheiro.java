package br.edu.unifei.ecot12.trabalho.setor;

import br.edu.unifei.ecot12.trabalho.futebol.Setor;

public class Banheiro extends Setor {
	private String genero;
	private int numPrivada;
	private int numPia;
	private int mictorio;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPrivada() {
		return numPrivada;
	}

	public void setNumPrivada(int numPrivada) {
		this.numPrivada = numPrivada;
	}

	public int getNumPia() {
		return numPia;
	}

	public void setNumPia(int numPia) {
		this.numPia = numPia;
	}

	public int getMictorio() {
		return mictorio;
	}

	public void setMictorio(int mictorio) {
		this.mictorio = mictorio;
	}

}
