package br.edu.unifei.ecot12.trabalho.aplicacao;

import br.edu.unifei.ecot12.trabalho.futebol.Time;
import br.edu.unifei.ecot12.trabalho.pessoa.Auxiliar;
import br.edu.unifei.ecot12.trabalho.pessoa.Bandeirinha;
import br.edu.unifei.ecot12.trabalho.pessoa.Comentarista;
import br.edu.unifei.ecot12.trabalho.pessoa.Comum;
import br.edu.unifei.ecot12.trabalho.pessoa.Fisioterapeuta;
import br.edu.unifei.ecot12.trabalho.pessoa.Gandula;
import br.edu.unifei.ecot12.trabalho.pessoa.Juiz;
import br.edu.unifei.ecot12.trabalho.pessoa.Medico;
import br.edu.unifei.ecot12.trabalho.pessoa.Narrador;
import br.edu.unifei.ecot12.trabalho.pessoa.Organizada;
//import br.edu.unifei.ecot12.trabalho.futebol.Uniforme;
import br.edu.unifei.ecot12.trabalho.pessoa.Reserva;
import br.edu.unifei.ecot12.trabalho.pessoa.Seguranca;
import br.edu.unifei.ecot12.trabalho.pessoa.Tecnico;
import br.edu.unifei.ecot12.trabalho.pessoa.Titular;
import br.edu.unifei.ecot12.trabalho.pessoa.Vendedor;

public class App {

	public static void main(String[] args) {
		
		//Uniforme u = new Uniforme();
				
		System.out.println("#### Jogadores Titulares ####");
		
		Titular jt1 = new Titular();
		jt1.setNome("Bonamin");
		jt1.setAgilidade(80);
		jt1.setForcaChute(82);
		jt1.setIdade(20);
		jt1.setNumCamisa(50);
		jt1.setNumCartaoAmarelo(0);
		jt1.setNumCartaoVermelho(0);
		jt1.setPosicao("Volante");
		jt1.setResistencia(80);
		jt1.setSalario(100000.00f);
		//jt1.setUniforme(u);	apresenta discrepancia
		
		Titular jt2 = new Titular();
		jt2.setNome("Otavio");
		jt2.setAgilidade(85);
		jt2.setForcaChute(82);
		jt2.setIdade(19);
		jt2.setNumCamisa(50);
		jt2.setNumCartaoAmarelo(3);
		jt2.setNumCartaoVermelho(1);
		jt2.setPosicao("Lateral Esquerdo");
		jt2.setResistencia(80);
		jt2.setSalario(120000.00f);
		//jt2.setUniforme(u);	apresenta discrepancia
		
		System.out.println("Nome: " + jt1.getNome());
		System.out.println("Idade: " + jt1.getIdade());
		System.out.println("Numero da camisa: " + jt1.getNumCamisa());
		System.out.println("Numero cartao amarelo: " + jt1.getNumCartaoAmarelo());
		System.out.println("Numero cartao vermelho: " + jt1.getNumCartaoVermelho());
		System.out.println("Velocidade media do chute: " + jt1.getAgilidade() * jt1.getForcaChute() * 0.01 + "Km/h");
		System.out.println("Posicao: " + jt1.getPosicao());
		System.out.println("Salario: " + jt1.getSalario());
		System.out.println("Uniforme: ");
		
		System.out.println();
		System.out.println("Nome: " + jt2.getNome());
		System.out.println("Idade: " + jt2.getIdade());
		System.out.println("Numero da camisa: " + jt2.getNumCamisa());
		System.out.println("Numero cartao amarelo: " + jt2.getNumCartaoAmarelo());
		System.out.println("Numero cartao vermelho: " + jt2.getNumCartaoVermelho());
		System.out.println("Velocidade media do chute: " + jt2.getAgilidade() * jt2.getForcaChute() * 0.01 + "Km/h");
		System.out.println("Posicao: " + jt2.getPosicao());
		System.out.println("Salario: " + jt2.getSalario());
		
		System.out.println();
		System.out.println("#### Acoes Durante a Partida ####");
		jt1.perdeEstamina(jt1.getResistencia(),jt1.getNome());
		jt1.fazJogadaEnsaiada(jt1.getNome());
		jt1.fazGol(jt1.getNome());
		jt1.comeraGol(jt1.getNome());
		jt2.perdeEstamina(jt2.getResistencia(), jt2.getNome());
		jt2.substituicao(jt2.getNome());
		
		System.out.println();
		System.out.println("#### Jogadores da Reserva ####");
		
		Reserva jr = new Reserva();
		jr.setNome("Joao");
		jr.setAgilidade(85);
		jr.setForcaChute(82);
		jr.setIdade(19);
		jr.setNumCamisa(50);
		jr.setNumCartaoAmarelo(2);
		jr.setNumCartaoVermelho(0);
		jr.setPosicao("Zaqueiro");
		jr.setResistencia(80);
		jr.setSalario(90000.00f);
		
		jr.fazAquecimento(jr.getNome());
		jr.entraEmCampo(jr.getNome());
		
		System.out.println("#### TORCEDOR ####");
		Comum tc1 = new Comum();
		tc1.setNome("Kratos");
		tc1.setIdade(30);
		tc1.setIngresso("Arquibancada setor norte");
		tc1.setRenda(40000);
		//tc1.setUniforme(null);
		
		System.out.println("Nome: " + tc1.getNome());
		System.out.println("Idade: " + tc1.getIdade());
		System.out.println("Ingresso" + tc1.getIngresso());
		System.out.println("Renda" + tc1.getRenda());
		
		System.out.print("Torcedor canta ");
		tc1.cantaHino();
		System.out.print("Torcedor canta ");
		tc1.canta();
		System.out.print("Torcedor xinga o ");
		tc1.xingaJuiz();
		System.out.print("Torcedor xinga o ");
		tc1.xingaTecnico();
		System.out.print("Torcedor ");
		tc1.xingaJogador();
		System.out.print("Torcedor ");
		tc1.gritaOle();
		System.out.println("Torcedor ");
		tc1.critica();
		
		System.out.println("#### Torcida Organizada ####");
		Organizada to = new Organizada();
		to.setNome("Carlos");
		to.setIdade(75);
		to.setIngresso("Arquibancada setor organizada");
		to.setNumFaixa(4);
		to.setEquipamentoMusical("Tambor");
		//tc1.setUniforme(null);
		
		System.out.println("Nome: " + to.getNome());
		System.out.println("Idade: " + to.getIdade());
		System.out.println("Ingresso" + to.getIngresso());
		System.out.println("Numero de Faixa: " + to.getNumFaixa());
		System.out.println("Equipamento musical: " + to.getEquipamentoMusical());
		
		to.acendeSinalizador();
		to.estendeFaixa();
		to.provocaRival();
		to.tocaInstrumento();
		
		System.out.println();
		System.out.println("#### Comissao Tecnica ####");
		System.out.println("#### Tecnico ####");
		
		Tecnico t = new Tecnico();
		t.setNome("Guga");
		t.setIdade(40);
		t.setQualidadeTecnica("Otima");
		t.setSalario(150000.00f);
		
		System.out.println("Nome: " + t.getNome());
		System.out.println("Idade: " + t.getIdade());
		System.out.println("Qualidade tecnica: " + t.getQualidadeTecnica());
		System.out.println("Salario: " + t.getSalario());
		
		System.out.println("#### Acoes ####");
		t.orientaJogador();
		t.escolheTitular();
		t.esquemaTatico();
		
		System.out.println();
		System.out.println("#### Fisioterauta ####");
		
		Fisioterapeuta f = new Fisioterapeuta();
		f.setNome("Alexandre");
		f.setIdade(30);
		f.setQualidadeTecnica("Otima");
		f.setSalario(30000.00f);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Idade: " + f.getIdade());
		System.out.println("Qualidade tecnica: " + f.getQualidadeTecnica());
		System.out.println("Salario: " + f.getSalario());
		
		System.out.println("#### Acoes ####");
		f.orientaJogador();
		f.fazMassagem();
		
		System.out.println();
		System.out.println("#### Auxiliar ####");
		
		Auxiliar a = new Auxiliar();
		a.setNome("Paulo");
		a.setIdade(25);
		a.setQualidadeTecnica("Otima");
		a.setSalario(25000.00f);
		
		System.out.println("Nome: " + a.getNome());
		System.out.println("Idade: " + a.getIdade());
		System.out.println("Qualidade tecnica: " + a.getQualidadeTecnica());
		System.out.println("Salario: " + a.getSalario());
		
		System.out.println("#### Acoes ####");
		a.orientaJogador();
		a.auxiliaTecnico();
		
		System.out.println();
		System.out.println("#### Funcionario ####");
		System.out.println("#### Vendedor ####");
		
		Vendedor v = new Vendedor();
		v.setNome("Andre");
		v.setIdade(30);
		v.setQuantidadeVenda(45);
		v.setSalario(5000.00f);
		System.out.println("Nome: " + v.getNome());
		System.out.println("Idade: " + v.getIdade());
		System.out.println("Quantidade de Venda: " + v.getQuantidadeVenda());
		System.out.println("Salario: " + v.getSalario());
		System.out.println("#### Acoes ####");
		v.entregaProduto();
		v.recebePagamento();
		
		System.out.println();
		System.out.println("#### Seguranca ####");
		Seguranca s1 = new Seguranca();
		s1.setNome("Silveira");
		s1.setIdade(30);
		s1.setSalario(20000.00f);
		s1.setColete(true);
		s1.setSprayPìmanta(true);
		s1.setCacetete(true);
		s1.setBombaLagrimogenea(true);
		System.out.println("Nome: " + s1.getNome());
		System.out.println("Idade: " + s1.getIdade());
		System.out.println("Salario: " + s1.getSalario());
		System.out.println("Colete: " + s1.getColete());
		System.out.println("Spay de Pimenta: " + s1.getSprayPìmanta());
		System.out.println("Cacetete: " + s1.getCacetete());
		System.out.println("Gas Lagrimogeneo: " + s1.getBombaLagrimogenea());
		System.out.println("#### Acoes ####");
		s1.atiraBombaLagrimogenea("Vermelho");
		s1.seguraCacetete("Amarelo");
		s1.acalmaTorcedor("Vermelho");
		s1.usaSorayPimenta("Vermelho");
		
		System.out.println();		
		System.out.println("#### Medico ####");
		Medico m = new Medico();
		m.setNome("Clarice");
		m.setIdade(25);
		m.setSalario(80000.00f);
		m.setEstetoscopio(false);
		m.setLuva(false);
		m.setMascara(false);
		System.out.println("Nome: " + m.getNome());
		System.out.println("Idade: " + m.getIdade());
		System.out.println("Salario: " + m.getSalario());
		System.out.println("Estetoscopio: " + m.isEstetoscopio());
		System.out.println("Luva: " + m.isLuva());
		System.out.println("Mascara: " + m.isMascara());
		System.out.println("#### Acoes ####");
		m.equipaLuva();
		m.equipaMascara();
		m.atentePessoa();
		m.aplicaGlicose();
		
		System.out.println();		
		System.out.println("#### Gandula ####");
		Gandula g = new Gandula();
		g.setIdade(10);
		g.setNome("Valentina");
		g.setResistencia(60);
		g.setSalario(5000.00f);
		System.out.println("Nome: " + g.getNome());
		System.out.println("Idade: " + g.getIdade());
		System.out.println("Salario: " + g.getSalario());
		System.out.println("Resistencia: " + g.getResistencia());
		System.out.println("#### Acoes ####");
		g.pegaBola();
		g.jogaBola();
		
		System.out.println();
		System.out.println("#### Arbitragem ####");
		System.out.println("#### Juiz ####");
		Juiz j = new Juiz();
		j.setNome("Ozil");
		j.setIdade(30);
		j.setEspuma(true);
		j.setCartao(true);
		System.out.println("Nome: " + j.getNome());
		System.out.println("Idade: " + j.getIdade());
		System.out.println("Espuma: " + j.isEspuma());
		System.out.println("Cartao " + j.isCartao());
		System.out.println("#### Acoes ####");
		j.marcaFalta();
		j.chamaVar();
		j.usaCartao();
		
		
		System.out.println();
		System.out.println("#### Bandeirinha ####");
		Bandeirinha b = new Bandeirinha();
		b.setNome("Etho");
		b.setIdade(35);
		b.setBandeira(true);
		System.out.println("Nome: " + b.getNome());
		System.out.println("Idade: " + b.getIdade());
		System.out.println("Bandeira: " + b.isBandeira());
		System.out.println("#### Acoes ####");
		b.marcaImpedimento();
		
		System.out.println();
		System.out.println("#### Midia ####");
		System.out.println("#### Narrador ####");
		Narrador n = new Narrador();
		n.setNome("Bueno");
		n.setIdade(45);
		n.setQualidadeNarracao("Boa");
		n.setNomeEmpresa("Mundo");
		n.setFama("Conhecida");
		System.out.println("Nome: " + n.getNome());
		System.out.println("Idade: " + n.getIdade());
		System.out.println("Qualidade da Narracao " + n.getQualidadeNarracao());
		System.out.println("Nome da Empresa: " + n.getNomeEmpresa());
		System.out.println("Fama: " + n.getQualidadeNarracao());
		System.out.println("#### Acao ####");
		n.gritaGol();
		n.narraJogo();
		
		System.out.println();
		System.out.println("#### Comentarista ####");
		Comentarista c = new Comentarista();
		c.setNome("Bino");
		c.setIdade(50);
		c.setQualidadeComentario("Boa");
		System.out.println("Nome: " + c.getNome());
		System.out.println("Idade: " + c.getIdade());
		System.out.println("Qualidade do comentario" + c.getQualidadeComentario());
		System.out.println("#### Acao ####");
		c.fazComentario();
		
		System.out.println();
		System.out.println("#### Times ####");
		Time t1 = new Time();
		Time t2 = new Time();
		
		t1.setNome("Azuriz");
		t1.setSigla("SCA");
		t1.setPatrocinadores(null);
		
		
		t2.setNome("Tuntum");
		t2.setSigla("TFC");
		t2.setPatrocinadores(null);
	
		
		System.out.println("" + t1.getStatus());
		t1.mudaUniforme();
	}

}
