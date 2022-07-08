package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;

public abstract class Funcionario extends Pessoa {

	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
}
