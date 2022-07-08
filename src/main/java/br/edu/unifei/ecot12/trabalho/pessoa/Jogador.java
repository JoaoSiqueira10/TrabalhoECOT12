package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;

public abstract class Jogador extends Pessoa {

	private float salario;
	private int numCamisa;
	private String posicao;
	private float forcaChute;
	private float agilidade;
	private float resistencia;
	private int numCartaoVermelho;
	private int numCartaoAmarelo;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getNumCamisa() {
		return numCamisa;
	}

	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public float getForcaChute() {
		return forcaChute;
	}

	public void setForcaChute(float forcaChute) {
		this.forcaChute = forcaChute;
	}

	public float getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(float agilidade) {
		this.agilidade = agilidade;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public int getNumCartaoVermelho() {
		return numCartaoVermelho;
	}

	public void setNumCartaoVermelho(int numCartaoVermelho) {
		this.numCartaoVermelho = numCartaoVermelho;
	}

	public int getNumCartaoAmarelo() {
		return numCartaoAmarelo;
	}

	public void setNumCartaoAmarelo(int numCartaoAmarelo) {
		this.numCartaoAmarelo = numCartaoAmarelo;
	}

	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public void comeraGol() {
		System.out.println("Faz alguma comemoracao");
	}

}
