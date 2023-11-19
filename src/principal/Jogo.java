package principal;

import java.util.List;

public class Jogo {
	private List<Jogador> listaJogadores;
	private int jogadas = listaJogadores.size() * 13;

	public int getJogadas() {
		return jogadas;
	}

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}

	public void jogar(List<Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
		
		
	}

}
