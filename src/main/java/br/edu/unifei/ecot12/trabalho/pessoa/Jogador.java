package br.edu.unifei.ecot12.trabalho.pessoa;

import java.util.Random;

import br.edu.unifei.ecot12.trabalho.futebol.Pessoa;
import br.edu.unifei.ecot12.trabalho.futebol.Uniforme;

public abstract class Jogador extends Pessoa {

	private float salario;
	private int numCamisa;
	private String posicao;
	private float forcaChute;
	private float agilidade;
	private float resistencia;
	private int numCartaoVermelho;
	private int numCartaoAmarelo;
	private Uniforme uniforme;

	@Override
	public String toString () {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getNumCamisa() {
		return numCamisa;
	}

	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public float getForcaChute() {
		return forcaChute;
	}

	public void setForcaChute(float forcaChute) {
		this.forcaChute = forcaChute;
	}

	public float getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(float agilidade) {
		this.agilidade = agilidade;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public int getNumCartaoVermelho() {
		return numCartaoVermelho;
	}

	public void setNumCartaoVermelho(int numCartaoVermelho) {
		this.numCartaoVermelho = numCartaoVermelho;
	}

	public int getNumCartaoAmarelo() {
		return numCartaoAmarelo;
	}

	public void setNumCartaoAmarelo(int numCartaoAmarelo) {
		this.numCartaoAmarelo = numCartaoAmarelo;
	}
	
	public Uniforme getUniforme() {
		return uniforme;
	}

	public void setUniforme(Uniforme uniforme) {
		this.uniforme = uniforme;
	}

	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public void comeraGol(String nome) {
		String[] tipoComemoracao = new String[5];
		tipoComemoracao[0] = " deu mortal";
		tipoComemoracao[1] = " faz peixinho";
		tipoComemoracao[2] = " agradece a Deus";
		tipoComemoracao[3] = " homenageia a familia";
		tipoComemoracao[4] = " faz dancinha do rebolation";

		Random rand = new Random();
		int num = rand.nextInt(5);
		
		System.out.print(nome);
		System.out.println(tipoComemoracao[num]);
	}
}
