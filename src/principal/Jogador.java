package principal;

import java.util.List;

public class Jogador {
	private String nome;
	private List<Dados> dadosAtuais;
	private List<Dados> dadosSalvos;

	private Tabela t = new Tabela();

	public Jogador(String nome) {
		super();
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Dados> getDadosAtuais() {
		return dadosAtuais;
	}

	public void setDadosAtuais(List<Dados> dadosAtuais) {
		this.dadosAtuais = dadosAtuais;
	}

	public Tabela getT() {
		return t;
	}

	public void setT(Tabela t) {
		this.t = t;
	}

	public List<Dados> getDadosSalvos() {
		return dadosSalvos;
	}

	public void setDadosSalvos(List<Dados> dadosSalvos) {
		this.dadosSalvos = dadosSalvos;
	}
}
