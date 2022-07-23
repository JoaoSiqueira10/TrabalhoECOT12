package br.edu.unifei.ecot12.trabalho.futebol;

public class PlacaPublicidade {

	private String patrocinador;
	private Cor cor;
	private String cores;

	public void trocaPatrocinio() {
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

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

}
