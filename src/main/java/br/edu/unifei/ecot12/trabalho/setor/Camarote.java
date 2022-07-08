package br.edu.unifei.ecot12.trabalho.setor;

import br.edu.unifei.ecot12.trabalho.futebol.Setor;

public class Camarote extends Setor{

	private boolean openBar;
	private boolean openFood;
	private int numMax;
	private int numOcupado;

	public boolean isOpenBar() {
		return openBar;
	}

	public void setOpenBar(boolean openBar) {
		this.openBar = openBar;
	}

	public boolean isOpenFood() {
		return openFood;
	}

	public void setOpenFood(boolean openFood) {
		this.openFood = openFood;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	public int getNumOcupado() {
		return numOcupado;
	}

	public void setNumOcupado(int numOcupado) {
		this.numOcupado = numOcupado;
	}

	public Camarote() {
		// TODO Auto-generated constructor stub
	}

}
