package br.edu.unifei.ecot12.trabalho.setor;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.trabalho.futebol.PlacaPublicidade;
import br.edu.unifei.ecot12.trabalho.futebol.Setor;
import br.edu.unifei.ecot12.trabalho.pessoa.Gandula;

public class Campo extends Setor {

	private int aspersor;
	private List<Gandula> gandulas = new ArrayList<Gandula>();
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

	public List<Gandula> getGandulas() {
		return gandulas;
	}

	public void setGandulas(List<Gandula> gandulas) {
		this.gandulas = gandulas;
	}

}
