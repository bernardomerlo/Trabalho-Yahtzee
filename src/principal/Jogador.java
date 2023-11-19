package principal;

import java.util.List;

public class Jogador {
	private String nome;
	private List<Dados> listaDeDados;

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

	public List<Dados> getListaDeDados() {
		return listaDeDados;
	}

	public void setListaDeDados(List<Dados> listaDeDados) {
		this.listaDeDados = listaDeDados;
	}

	public void criarTabela() {
		Tabela t = new Tabela();
	}
}
