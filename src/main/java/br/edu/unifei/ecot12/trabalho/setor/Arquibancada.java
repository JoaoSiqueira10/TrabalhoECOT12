package br.edu.unifei.ecot12.trabalho.setor;

import br.edu.unifei.ecot12.trabalho.futebol.Setor;

public class Arquibancada extends Setor {

	private boolean cobertura;
	private int assento;

	public boolean isCobertura() {
		return cobertura;
	}

	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

}
