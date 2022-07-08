package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;

public abstract class ComissaoTecnica extends Pessoa {

	private float salario;
	private String qualidadeTecnica;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getQualidadeTecnica() {
		return qualidadeTecnica;
	}

	public void setQualidadeTecnica(String qualidadeTecnica) {
		this.qualidadeTecnica = qualidadeTecnica;
	}

	public void orientaJogador() {
		System.out.println("Faz alguma coisa, reage!!!!");
	}

	public ComissaoTecnica() {
		// TODO Auto-generated constructor stub
	}

}
