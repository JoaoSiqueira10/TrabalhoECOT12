package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;

public abstract class Midia extends Pessoa {

	private String nomeEmpresa;
	private String fala;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getFala() {
		return fala;
	}

	public void setFala(String fala) {
		this.fala = fala;
	}

	public Midia() {
		// TODO Auto-generated constructor stub
	}
}
