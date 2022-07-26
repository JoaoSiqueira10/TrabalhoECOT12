package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.Date;

public class Relogio {

	private static Relogio relogio = new Relogio();
	private Date tempo;
	
	public Relogio() {

	}

	public static Relogio getRelogio() {
		return relogio;
	}

	public static void setRelogio(Relogio relogio) {
		Relogio.relogio = relogio;
	}

	public Date getTempo() {
		return tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
}
