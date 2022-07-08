package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

	private String nome;

	private List<Partida> partidas = new ArrayList<Partida>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	public Campeonato() {
		// TODO Auto-generated constructor stub
	}

}
