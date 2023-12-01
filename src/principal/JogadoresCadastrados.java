package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JogadoresCadastrados {
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public void cadastrarJogador(Jogador j) {
		jogadores.add(j);
	}

	public void removerJogador(Jogador j) {
		jogadores.remove(j);
	}

	public void atualizarJogadores(Arquivos a) {
		String caminho = "jogadores.txt";
		try {
			File arquivo = new File(caminho);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				String nome = linha.replace("Jogador:", "").trim();
				jogadores.add(new Jogador(nome));
			}
			bufferedReader.close();
		} catch (IOException e) {
		}
	}
}
