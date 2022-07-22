package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;

public abstract class Midia extends Pessoa {

	private String nomeEmpresa;
	private String fama;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getFama() {
		return fama;
	}

	public void setFama(String fama) {
		this.fama = fama;
	}

	public Midia() {
		// TODO Auto-generated constructor stub
	}
}
