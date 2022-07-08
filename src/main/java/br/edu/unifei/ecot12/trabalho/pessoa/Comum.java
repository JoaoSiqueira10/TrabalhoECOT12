package br.edu.unifei.ecot12.trabalho.pessoa;

public class Comum extends Torcedor {
	private boolean camarote;
	private float renda;
	
	public boolean isCamarote() {
		return camarote;
	}

	public void setCamarote(boolean camarote) {
		this.camarote = camarote;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public void critica() {
		System.out.println("Faz uma critica");
	}
}
