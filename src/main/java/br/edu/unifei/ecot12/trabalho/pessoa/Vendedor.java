package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

public class Vendedor extends Funcionario {
	private int quantidadeVenda;
	
	public void recebePagamento() {
		System.out.println("Pega o pagamento");
		entregaProduto();
	}
	
	public void entregaProduto() {
		String[] produto = new String[5];
		produto[0] = "Pastel";
		produto[1] = "Agua";
		produto[2] = "Refrigerante";
		produto[3] = "Churros";
		produto[4] = "Salgado";

		Random rand = new Random();
		int num = rand.nextInt(5);
		System.out.println("Entregou " + produto[num]);
		
		quantidadeVenda ++;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
}
