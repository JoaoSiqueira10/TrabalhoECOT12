package br.edu.unifei.ecot12.trabalho.pessoa;

public class Medico extends Funcionario {
	private boolean estetoscopio;
	private boolean luva;
	private boolean mascara;
	
	@Override
	public String toString() {
		return nome;
	}

	public void equipaLuva() {
		if (luva == false) {
			System.out.println("Medico coloca a luva");
			luva = true;
		}
	}

	public void equipaMascara() {
		if (mascara == false) {
			System.out.println("Medico coloca a marcara");
			mascara = true;
		}
	}

	public void atentePessoa() {

		System.out.println("Medico atende pessoa");
	}

	public void aplicaGlicose() {
		System.out.println("Medico aplica glicose no paciente");
	}

	public boolean isEstetoscopio() {
		return estetoscopio;
	}

	public void setEstetoscopio(boolean estetoscopio) {
		this.estetoscopio = estetoscopio;
	}

	public boolean isLuva() {
		return luva;
	}

	public void setLuva(boolean luva) {
		this.luva = luva;
	}

	public boolean isMascara() {
		return mascara;
	}

	public void setMascara(boolean mascara) {
		this.mascara = mascara;
	}
}
