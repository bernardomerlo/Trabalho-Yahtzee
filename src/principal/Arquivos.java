package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Arquivos {
	static Scanner sc = new Scanner(System.in);
	private JogadoresCadastrados jogadores = new JogadoresCadastrados();

	public void lerDados() {
		String caminho = "saida.txt";
		try {
			File arquivo = new File(caminho);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
			String linha;
			boolean passou = false;

			System.out.println();
			System.out.println("====================");
			while ((linha = bufferedReader.readLine()) != null) {
				String[] vet = linha.split(" ");
				if (vet[0].equals("Jogador:")) {
					System.out.println(linha);
				}
				if (vet[0].equals("Total") && vet[1].equals("Final:")) {
					System.out.println(linha);
					if (passou) {
						System.out.println("====================");
					}
					passou = !passou;
				}
			}
			if (passou) {
				System.out.println("====================");
			}
			System.out.println();
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println();
			System.out.println("Erro ao ler o arquivo, possívelmente ele ainda nao existe");
			System.out.println();
		}
	}

	public void escreverTabela(Jogador jogador) {
		String caminho = "saida.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			bw.write("Jogador: " + jogador.getNome() + "\n");
			bw.write("1s: " + jogador.getT().getOnes() + "p\n");
			bw.write("2s: " + jogador.getT().getTwos() + "p\n");
			bw.write("3s: " + jogador.getT().getThrees() + "p\n");
			bw.write("4s: " + jogador.getT().getFours() + "p\n");
			bw.write("5s: " + jogador.getT().getFives() + "p\n");
			bw.write("6s: " + jogador.getT().getSixes() + "p\n");
			bw.write("Bônus: " + jogador.getT().getBonus() + "p\n");
			bw.write("Trinca: " + jogador.getT().getTresIguais() + "p\n");
			bw.write("Quadra: " + jogador.getT().getQuatroIguais() + "p\n");
			bw.write("FullHouse: " + jogador.getT().getFullHouse() + "p\n");
			bw.write("Sequência Menor: " + jogador.getT().getSequenciaMenor() + "p\n");
			bw.write("Sequência Maior: " + jogador.getT().getSequenciaMaior() + "p\n");
			bw.write("Soma de Todos: " + jogador.getT().getSomaDeTodos() + "p\n");
			bw.write("Yahtzee: " + jogador.getT().getYahtzee() + "p\n");
			bw.write("Total Final: " + jogador.getT().getTotalFinal() + "p\n");
		} catch (IOException erroEscrita1) {
			System.out.println();
			System.out.println("Erro ao escrever o arquivo, possívelmente ele ainda nao existe");
			System.out.println();
		}
	}

	public void mostrarJogadoresCadastrados() {
		System.out.println();
		System.out.println("=======JOGADORES CADASTRADOS=======");
		String caminho = "jogadores.txt";
		try {
			File arquivo = new File(caminho);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				String[] vet = linha.split(" ");
				if (vet[0].equals("Jogador:")) {
					System.out.println(linha);
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println();
			System.out.println("Erro ao ler o arquivo, possívelmente ele ainda nao existe");
			System.out.println();

		}
		System.out.println("===================================");
		System.out.println();
	}

	public List<Jogador> listaJogadores() {
		char cadastrar = 's';
		while (cadastrar == 's') {
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			jogadores.getJogadores().add(new Jogador(nome));
			System.out.print("Deseja cadastrar mais? (s/n) ");
			cadastrar = sc.nextLine().toLowerCase().charAt(0);
		}
		System.out.println();
		return jogadores.getJogadores();
	}

	public void cadastrarJogadores(List<Jogador> jogadores) {
		String caminho = "jogadores.txt";
		for (Jogador j : jogadores) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
				bw.write("Jogador: " + j.getNome() + "\n");
			} catch (IOException erroEscrita1) {
				System.out.println();
				System.out.println("Erro ao escrever o arquivo, possívelmente ele ainda nao existe");
				System.out.println();

			}
		}
	}
}