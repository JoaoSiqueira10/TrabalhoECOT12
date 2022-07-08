package br.edu.unifei.ecot12.trabalho.setor;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.trabalho.futebol.Setor;
import br.edu.unifei.ecot12.trabalho.pessoa.Medico;

public class Enfermaria extends Setor {
	private int numCama;
	private int numSoro;
	private int numCadeira;
	
	private List<Medico> medico = new ArrayList<Medico>();

	public int getNumCama() {
		return numCama;
	}

	public void setNumCama(int numCama) {
		this.numCama = numCama;
	}

	public int getNumSoro() {
		return numSoro;
	}

	public void setNumSoro(int numSoro) {
		this.numSoro = numSoro;
	}

	public int getNumCadeira() {
		return numCadeira;
	}

	public void setNumCadeira(int numCadeira) {
		this.numCadeira = numCadeira;
	}

	public List<Medico> getMedico() {
		return medico;
	}

	public void setMedico(List<Medico> medico) {
		this.medico = medico;
	}

}
