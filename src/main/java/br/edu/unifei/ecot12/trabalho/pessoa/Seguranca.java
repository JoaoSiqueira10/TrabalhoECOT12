package br.edu.unifei.ecot12.trabalho.pessoa;

//import br.edu.unifei.ecot12.trabalho.futebol.Cor;

public class Seguranca extends Funcionario {
	private boolean colete;
	private boolean sprayPìmanta;
	private boolean cacetete;
	private boolean bombaLagrimogenea;

	
	
	public boolean isColete() {
		return colete;
	}

	public void setColete(boolean colete) {
		this.colete = colete;
	}

	public boolean isSprayPìmanta() {
		return sprayPìmanta;
	}

	public void setSprayPìmanta(boolean sprayPìmanta) {
		this.sprayPìmanta = sprayPìmanta;
	}

	public boolean isCacetete() {
		return cacetete;
	}

	public void setCacetete(boolean cacetete) {
		this.cacetete = cacetete;
	}

	public boolean isBombaLagrimogenea() {
		return bombaLagrimogenea;
	}

	public void setBombaLagrimogenea(boolean bombaLagrimogenea) {
		this.bombaLagrimogenea = bombaLagrimogenea;
	}

	public void atiraBombaLagrimogenea(String corAlerta) {
		if (corAlerta == "Vermelho" && bombaLagrimogenea == true) {
			System.out.println("Segunca usa bomba lagrimogenea");
		}
	}
	
	public void seguraCacetete(String corAlerta) {
		if ((corAlerta == "Vermelho" || corAlerta == "Amarelo") && cacetete == true) {
			System.out.println("Segunca segura o cacetete");
		}
	}

	public void acalmaTorcedor(String corAlerta) {
		if (corAlerta == "Vermelho" && cacetete == true) {
			System.out.println("Segunca acalma tocedor com cacetete");
		}
	}

	public void usaSorayPimenta(String corAlerta) {
		if (corAlerta == "Vermelho" && sprayPìmanta == true) {
			System.out.println("Segunca usa spray de pimenta");
		}
	}
	
	/*
	public void atiraBombaLagrimogenea(Cor alerta) {
		if (alerta == Cor.VERMELHO && bombaLagrimogenea == true) {
			System.out.println("Segunca usa bomba lagrimogenea");
		}
	}
	
	public void seguraCacetete(Cor alerta) {
		if (alerta == Cor.AMARELO && cacetete == true) {
			System.out.println("Segunca segura o cacetete");
		}
	}

	public void acalmaTorcedor(Cor alerta) {
		if (alerta == Cor.VERMELHO && cacetete == true) {
			System.out.println("Segunca acalma tocedor");
		}
	}

	public void usaSorayPimenta(Cor alerta) {
		if (alerta == Cor.VERMELHO && sprayPìmanta == true) {
			System.out.println("Segunca usa sprau de pimenta");
		}
	}
	*/
}
