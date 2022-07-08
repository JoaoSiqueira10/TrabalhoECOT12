package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Comentarista extends Midia {
	private String qualidadeComentario;
	
	public void fazComentario() {
		String[] comentario = new String[5];
		comentario[0] = "A compra desse jogador foi otimo para o melhoramento do time";
		comentario[1] = "A coisa esta feia para o tecnico se perderem hoje";
		comentario[2] = "Parece que ter substituição";
		comentario[3] = "Jogadores foram pro aquecimento";
		comentario[4] = "Esse jogador esta numa otima temporada";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println(comentario[num]);
	}

	public String getQualidadeComentario() {
		return qualidadeComentario;
	}

	public void setQualidadeComentario(String qualidadeComentario) {
		this.qualidadeComentario = qualidadeComentario;
	}
}
