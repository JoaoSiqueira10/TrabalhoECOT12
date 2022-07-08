package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.ArrayList;
import java.util.List;

public class Estadio {

	private int capacidade;
	private int ocupacao;
	private float area;

	private List<Setor> setores = new ArrayList<Setor>();
	private Partida partida;

	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

}
