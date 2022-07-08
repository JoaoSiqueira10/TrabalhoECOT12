package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

import br.edu.unifei.ecot12.trabalho.futebol.Cor;

public class Juiz extends Arbitragem {

	private boolean espuma;
	private boolean cartao[];

	public void chamaVar() {
		System.out.println("Foi conferir no VAR");
		String[] VAR = new String[5];
		VAR[0] = "Penalti";
		VAR[1] = "Falta";
		VAR[2] = "Mao";
		VAR[3] = "Gol valido";
		VAR[4] = "Gol invalido";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println("O resultado do VAR é " + VAR[num]);

	}

	public void usaCartao(Cor cor) {
		Cor[] cart = new Cor[2];
		cart[0] = Cor.AMARELO;
		cart[1] = Cor.VERMELHO;

		Random rand = new Random();
		int num = rand.nextInt(2);
		System.out.println("Juiz aplicou cartao " + cart[num]);
	}

	public boolean isEspuma() {
		return espuma;
	}

	public void setEspuma(boolean espuma) {
		this.espuma = espuma;
	}

	public boolean[] getCartao() {
		return cartao;
	}

	public void setCartao(boolean[] cartao) {
		this.cartao = cartao;
	}

}
