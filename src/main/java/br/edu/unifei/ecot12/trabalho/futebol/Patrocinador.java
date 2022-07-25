package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.Date;

public class Patrocinador {

	private String nome;
	private float valor;
	private Date inicioContrato;
	private Date fimContrato;
	
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(Date inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public Date getFimContrato() {
		return fimContrato;
	}

	public void setFimContrato(Date fimContrato) {
		this.fimContrato = fimContrato;
	}

	public Patrocinador() {
		// TODO Auto-generated constructor stub
	}

}
