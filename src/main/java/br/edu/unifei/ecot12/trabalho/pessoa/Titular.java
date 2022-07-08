package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Titular extends Jogador {

	public void perdeEstamina() {
		System.out.println("Perdeu 0.5 de resistencia");
	}

	public void fazJogadaEnsaiada() {
		System.out.println("Faz jogada ensaiada");
	}

	public void substituicao() {
		System.out.println("Sai de campo");
	}

	public void fazGol() {
		System.out.println("Fez Gol");
	}

	public void fazFalta() {
		String[] tipoFalta = new String[5];
		tipoFalta[0] = "Chegou na maldade";
		tipoFalta[1] = "Errou a bola e fez falta";
		tipoFalta[2] = "Empurrou o adversario";
		tipoFalta[3] = "Colocou a mao na bola";
		tipoFalta[4] = "Impedido";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println(tipoFalta[num]);

	}
}
