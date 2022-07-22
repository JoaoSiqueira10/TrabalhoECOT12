package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Titular extends Jogador {
	


	public void perdeEstamina(float resistencia, String nome) {
		resistencia = resistencia - 0.5f;
		System.out.print(nome);
		System.out.println(" perdeu 0.5 de resistencia");
		System.out.println("Resistencia total: " + resistencia);
	}

	public void fazJogadaEnsaiada(String nome) {
		System.out.print(nome);
		System.out.println(" faz jogada ensaiada");
	}

	public void substituicao(String nome) {
		System.out.print(nome);
		System.out.println(" sai de campo");
	}

	public void fazGol(String nome) {	
		System.out.print(nome);
		System.out.println(" faz Gol");
	}

	public void fazFalta(String nome) {
		String[] tipoFalta = new String[5];
		tipoFalta[0] = " chegou na maldade";
		tipoFalta[1] = " errou a bola e fez falta";
		tipoFalta[2] = " empurrou o adversario";
		tipoFalta[3] = " colocou a mao na bola";
		tipoFalta[4] = " esta impedido";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.print(nome);
		System.out.println(tipoFalta[num]);

	}
}
