package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.ArrayList;
import java.util.List;

public class PlacaPublicidade {

	private String patrocinador;
	private Cor cor;

	private List<Patrocinador> marcas = new ArrayList<Patrocinador>();

	public void trocaPatrocinio(String patrocinador) {
		System.out.println("Mudando Patrocinador");
	}

	public PlacaPublicidade() {
		// TODO Auto-generated constructor stub
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public List<Patrocinador> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Patrocinador> marcas) {
		this.marcas = marcas;
	}

}
