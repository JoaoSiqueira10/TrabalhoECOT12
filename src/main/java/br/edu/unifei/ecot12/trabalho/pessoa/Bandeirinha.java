package br.edu.unifei.ecot12.trabalho.pessoa;

public class Bandeirinha extends Arbitragem {
	private boolean bandeira;

	public boolean isBandeira() {
		return bandeira;
	}

	public void setBandeira(boolean bandeira) {
		this.bandeira = bandeira;
	}

	public void marcaImpedimento() {
		if (bandeira == true) {
			System.out.println("Marcou impedimento");
		}
	}
}
