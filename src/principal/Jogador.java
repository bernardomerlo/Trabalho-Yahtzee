package principal;

public class Jogador {
	private String nome;

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

	public Tabela getT() {
		return t;
	}

	public void setT(Tabela t) {
		this.t = t;
	}

}
