package br.edu.unifei.ecot12.trabalho.pessoa;

public class Gandula extends Funcionario {
	private float resistencia;

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public void pegaBola() {
		resistencia = resistencia - 0.5f;
		System.out.println("Resistencia de sobra " + resistencia);
	}

	public void jogaBola() {
		resistencia = resistencia - 0.5f;
		System.out.println("Resistencia de sobra " + resistencia);
	}
}
