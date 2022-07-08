package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Reserva extends Jogador {

	public void fazAquecimento() {
		System.out.println("Fazendo aquecimento");
	}

	public void entraEmCampo() {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("Entra em campo no lugar do camisa " + num);
	}
}
