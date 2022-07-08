package br.edu.unifei.ecot12.trabalho.futebol;

public abstract class Setor {

	private float area;
	private int numPessoa;
	private int numLixeira;

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public int getNumPessoa() {
		return numPessoa;
	}

	public void setNumPessoa(int numPessoa) {
		this.numPessoa = numPessoa;
	}

	public int getNumLixeira() {
		return numLixeira;
	}

	public void setNumLixeira(int numLixeira) {
		this.numLixeira = numLixeira;
	}

	public Setor() {
		// TODO Auto-generated constructor stub
	}

}
