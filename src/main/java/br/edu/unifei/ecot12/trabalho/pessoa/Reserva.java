package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Reserva extends Jogador {

	public void fazAquecimento(String nome) {
		System.out.println("Jogador " + nome + " esta fazendo aquecimento");
	}

	public void entraEmCampo(String nome) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("Jogador " + nome + " entra em campo no lugar do camisa " + num);
	}
}
