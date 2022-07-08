package br.edu.unifei.ecot12.trabalho.pessoa;

import br.edu.unifei.ecot12.trabalho.futebol.Cor;

public class Organizada extends Torcedor {
	
	private String equipamentoMusical;
	private int numFaixa;
	private Cor cor;
	
	public void provocaRival() {
		System.out.println("Grita que a partida esta facil");
	}
	
	public void acendeSinalizador() {
		System.out.println("Sinalizador" + cor + "aceso");
	}
	
	public void tocaInstrumento() {
		if(equipamentoMusical != null) {
			System.out.println("Faz barulho com "+ equipamentoMusical);
		}
	}
	
	public void estendeFaixa() {
		if(numFaixa > 0) {
			System.out.println("Estende a faixa");
		}
	}

	public String getEquipamentoMusical() {
		return equipamentoMusical;
	}

	public void setEquipamentoMusical(String equipamentoMusical) {
		this.equipamentoMusical = equipamentoMusical;
	}

	public int getNumFaixa() {
		return numFaixa;
	}

	public void setNumFaixa(int numFaixa) {
		this.numFaixa = numFaixa;
	}
}
