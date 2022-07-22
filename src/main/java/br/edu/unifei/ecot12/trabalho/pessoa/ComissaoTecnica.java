package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

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
		String[] orientacao = new String[5];
		orientacao[0] = "Faz alguma coisa, reage!!!!";
		orientacao[1] = "Marca direito!!!";
		orientacao[2] = "Chuta pro gol!!!!";
		orientacao[3] = "Passa a bola!!!";
		orientacao[4] = "Cruza pra area!!!";

		Random rand = new Random();
		int num = rand.nextInt(5);
		
		System.out.println(orientacao[num]);
	}

	public ComissaoTecnica() {
		// TODO Auto-generated constructor stub
	}

}
