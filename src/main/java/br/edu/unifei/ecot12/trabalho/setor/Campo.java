package br.edu.unifei.ecot12.trabalho.setor;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.trabalho.futebol.PlacaPublicidade;
import br.edu.unifei.ecot12.trabalho.futebol.Setor;

public class Campo extends Setor {

	private int aspersor;

	private List<PlacaPublicidade> placas = new ArrayList<PlacaPublicidade>();

	public Campo() {
		// TODO Auto-generated constructor stub
	}

	public int getAspersor() {
		return aspersor;
	}

	public void setAspersor(int aspersor) {
		this.aspersor = aspersor;
	}

	public List<PlacaPublicidade> getPlacas() {
		return placas;
	}

	public void setPlacas(List<PlacaPublicidade> placas) {
		this.placas = placas;
	}

}
