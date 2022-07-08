package br.edu.unifei.ecot12.trabalho.setor;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.trabalho.futebol.Setor;
import br.edu.unifei.ecot12.trabalho.pessoa.Vendedor;

public class Cantina extends Setor {

	private String[] produto;
	private float[] preco;
	private int numAtendente;
	
	private List<Vendedor> vendedor = new ArrayList<Vendedor>();

	public String[] getProduto() {
		return produto;
	}

	public void setProduto(String[] produto) {
		this.produto = produto;
	}

	public float[] getPreco() {
		return preco;
	}

	public void setPreco(float[] preco) {
		this.preco = preco;
	}

	public int getNumAtendente() {
		return numAtendente;
	}

	public void setNumAtendente(int numAtendente) {
		this.numAtendente = numAtendente;
	}

	public List<Vendedor> getVendedor() {
		return vendedor;
	}

	public void setVendedor(List<Vendedor> vendedor) {
		this.vendedor = vendedor;
	}

}
