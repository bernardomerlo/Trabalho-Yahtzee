package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.println("=====MENU=====");
		System.out.println("1 - Jogar");
		System.out.println("2 - Mostrar resultados anteriores");
		System.out.println("3 - Mostrar jogadores cadastrados");
		System.out.println("4 - Cadastrar jogador(es)");
		System.out.println("5 - Sair");
	}

	public void jogar(Arquivos a) {
		JogadoresCadastrados jg = new JogadoresCadastrados();
		jg.atualizarJogadores(a);
		Jogador jogador1;
		Jogador jogador2;

		if (jg.getJogadores().size() > 1) {
			System.out.print("Deseja jogar com os jogadores cadastrados? (s/n) ");
			String jogarCadastrados = sc.next().toLowerCase();
			if (jogarCadastrados.charAt(0) == 's') {
				for (int i = 0; i < jg.getJogadores().size(); i++) {
					System.out.println("Jogador (" + i + ") " + jg.getJogadores().get(i).getNome());
				}
				System.out.print("Digite o index do jogador1: ");
				int indexJogador1 = sc.nextInt();
				System.out.print("Digite o index do jogador2: ");
				int indexJogador2 = sc.nextInt();

				jogador1 = jg.getJogadores().get(indexJogador1);
				jogador2 = jg.getJogadores().get(indexJogador2);
			} else {
				sc.nextLine();
				System.out.println("Digite o nome do jogador n1: ");
				String nome = sc.nextLine();
				jogador1 = new Jogador(nome);
				Tabela tabelaJogador1 = new Tabela();
				jogador1.setT(tabelaJogador1);

				System.out.println("Digite o nome do jogador n2: ");
				String nome2 = sc.nextLine();
				jogador2 = new Jogador(nome2);
				Tabela tabelaJogador2 = new Tabela();
				jogador2.setT(tabelaJogador2);

				a.cadastrarJogadores(new ArrayList<Jogador>(Arrays.asList(new Jogador[] { jogador1, jogador2 })));

				jg.atualizarJogadores(a);
			}
		} else {

			System.out.println("Digite o nome do jogador n1: ");
			String nome = sc.nextLine();
			jogador1 = new Jogador(nome);
			Tabela tabelaJogador1 = new Tabela();
			jogador1.setT(tabelaJogador1);

			System.out.println("Digite o nome do jogador n2: ");
			String nome2 = sc.nextLine();
			jogador2 = new Jogador(nome2);
			Tabela tabelaJogador2 = new Tabela();
			jogador2.setT(tabelaJogador2);

			a.cadastrarJogadores(new ArrayList<Jogador>(Arrays.asList(new Jogador[] { jogador1, jogador2 })));

			jg.atualizarJogadores(a);
		}

		for (int jgdores = 1; jgdores < 3; jgdores++) {
			Jogador jogador;
			// se o mod do index do for == 1, é a vez do jogador1 se nao, do jogador2
			if (jgdores % 2 == 1) {
				jogador = jogador1;
			} else {
				jogador = jogador2;
			}

			System.out.println("Vez do Jogador " + jogador.getNome());
			System.out.println();

			Dados[] dadosIniciais = new Dados[5];
			Dados[] dadosAux = new Dados[5];

			Dados d1 = new Dados();
			Dados d2 = new Dados();
			Dados d3 = new Dados();
			Dados d4 = new Dados();
			Dados d5 = new Dados();

			restaurarDados(dadosIniciais, d1, d2, d3, d4, d5);

			for (int rodadas = 0; rodadas < 3; rodadas++) {
				// se todos os valores do vetor dadosAux tiverem preenchidos, entao o for acaba
				if (dadosAux[0] != null && dadosAux[1] != null && dadosAux[2] != null && dadosAux[3] != null
						&& dadosAux[4] != null) {
					rodadas = 3;
				}

				// se a variavel jgdores for maior que 1, consome a quebra de linha que falta
				if (jgdores > 1) {
					sc.nextLine();
				}

				// pergunta se o jogador quer ver a tabela dele na primeira rodada
				if (rodadas == 0) {
					System.out.print("\nMostra sua tabela? (s/n) ");
					String mostraTabela = sc.nextLine().toLowerCase();
					if (mostraTabela.equals("s")) {
						mostraTabelaAtualizada(jogador.getT());
					}
				}

				// mostra os dados que ele pode selecionar para manter
				System.out.println("\n====================");
				for (int i = 0; i < dadosIniciais.length; i++) {
					if (dadosIniciais[i] != null) {
						dadosIniciais[i].rolar();
						System.out.println("Face do dado(" + i + "): " + dadosIniciais[i].getNumFace());
					}
				}
				System.out.println("====================");

				// seleçao de dados
				System.out.print("Vai salvar algum? (s/n) ");
				char escolha = sc.next().toLowerCase().charAt(0);
				if (escolha == 's') {
					System.out.print("Quantos? (1-5) ");
					int tamanhoVetor = sc.nextInt();

					// se o jogador salvar 5 dados, fecha o for na hora
					if (tamanhoVetor == 5) {
						break;
					}
					for (int j = 0; j < tamanhoVetor; j++) {
						System.out.print("Qual? (0-4) ");
						int indexDado = sc.nextInt();
						dadosAux[indexDado] = dadosIniciais[indexDado];
						dadosIniciais[indexDado] = null;
					}
					System.out.println("\nFaces dos dados Mantidos");
					for (Dados d : dadosAux) {
						if (d != null)
							System.out.println(d.getNumFace());
					}
					System.out.println();
				}
			}

			Tabela t = jogador.getT();

			Dados d1Final = new Dados();
			Dados d2Final = new Dados();
			Dados d3Final = new Dados();
			Dados d4Final = new Dados();
			Dados d5Final = new Dados();

			if (dadosIniciais[0] == null) {
				d1Final = dadosAux[0];
			} else {
				d1Final = dadosIniciais[0];
			}
			if (dadosIniciais[1] == null) {
				d2Final = dadosAux[1];
			} else {
				d2Final = dadosIniciais[1];
			}
			if (dadosIniciais[2] == null) {
				d3Final = dadosAux[2];
			} else {
				d3Final = dadosIniciais[2];
			}
			if (dadosIniciais[3] == null) {
				d4Final = dadosAux[3];
			} else {
				d4Final = dadosIniciais[3];
			}
			if (dadosIniciais[4] == null) {
				d5Final = dadosAux[4];
			} else {
				d5Final = dadosIniciais[4];
			}

			Dados[] dadosFinal = { d1Final, d2Final, d3Final, d4Final, d5Final };
			System.out.println();
			System.out.println("VETOR FINAL");
			for (Dados d : dadosFinal) {
				System.out.println(d.getNumFace());
			}

			mostrarTabela(t, dadosFinal);

			System.out.println("Digite o que voce deseja atribuir: ");
			int escolhaAtribuir = sc.nextInt();

			escolha(escolhaAtribuir, jogador.getT(), dadosFinal);

			mostraTabelaAtualizada(t);

			restaurarDados(dadosIniciais, d1, d2, d3, d4, d5);

		}

		System.out.println("TOTAL");
		System.out.println("Jogador " + jogador1.getNome() + "= " + jogador1.getT().calcularPontosTotal());
		System.out.println("Jogador " + jogador2.getNome() + "= " + jogador2.getT().calcularPontosTotal());

		a.escreverTabela(jogador1);
		a.escreverTabela(jogador2);

	}

	public static void restaurarDados(Dados[] dados, Dados d1, Dados d2, Dados d3, Dados d4, Dados d5) {
		dados[0] = d1;
		dados[1] = d2;
		dados[2] = d3;
		dados[3] = d4;
		dados[4] = d5;
	}

	private static void mostraTabelaAtualizada(Tabela t) {
		System.out.println();
		System.out.println("=======TABELA FINAL=======\n");
		System.out.println("1-ONES = " + t.getOnes());
		System.out.println("2-TWOS = " + t.getTwos());
		System.out.println("3-THREES = " + t.getThrees());
		System.out.println("4-FOURS = " + t.getFours());
		System.out.println("5-FIVES = " + t.getFives());
		System.out.println("6-SIXES = " + t.getSixes());
		System.out.println("TOTAL TEMPORARIO = " + t.getTotal1());
		System.out.println();
		System.out.println("7-THREE OF A KIND = " + t.getTresIguais());
		System.out.println("8-FOUR OF A KIND = " + t.getQuatroIguais());
		System.out.println("9-FULL HOUSE = " + t.getFullHouse());
		System.out.println("10-SEQUENCIA MENOR = " + t.getSequenciaMenor());
		System.out.println("11-SEQUENCIA MAIOR = " + t.getSequenciaMaior());
		System.out.println("12-SORTE = " + t.getSomaDeTodos());
		System.out.println("13-YAHTZEE = " + t.getYahtzee());
		System.out.println();
	}

	private static void mostrarTabela(Tabela t, Dados[] dadosFinal) {
		System.out.println();
		System.out.println("=======TABELA DE ESCOLHA=======\n");
		System.out.println("1-ONES = " + t.ones(dadosFinal));
		System.out.println("2-TWOS = " + t.twos(dadosFinal));
		System.out.println("3-THREES = " + t.threes(dadosFinal));
		System.out.println("4-FOURS = " + t.fours(dadosFinal));
		System.out.println("5-FIVES = " + t.fives(dadosFinal));
		System.out.println("6-SIXES = " + t.sixes(dadosFinal));
		if (t.getBonus() > 0) {
			System.out.println("BONUS = " + t.getBonus());
		}
		System.out.println();
		System.out.println("7-THREE OF A KIND = " + t.tresIguais(dadosFinal));
		System.out.println("8-FOUR OF A KIND = " + t.quatroIguais(dadosFinal));
		System.out.println("9-FULL HOUSE = " + t.fullHouse(dadosFinal));
		System.out.println("10-SEQUENCIA MENOR = " + t.sequenciaMenor(dadosFinal));
		System.out.println("11-SEQUENCIA MAIOR = " + t.sequenciaMaior(dadosFinal));
		System.out.println("12-SORTE = " + t.somaDeTodos(dadosFinal));
		System.out.println("13-YAHTZEE = " + t.yahtzee(dadosFinal));
		System.out.println();
	}

	public void escolha(int escolhaAtribuir, Tabela t, Dados[] dadosFinal) {
		switch (escolhaAtribuir) {
		case 1: {
			t.setOnes(t.ones(dadosFinal));
			System.out.println("1-ONES = " + t.getOnes());
			break;
		}
		case 2: {
			t.setTwos(t.twos(dadosFinal));
			System.out.println("2-TWOS = " + t.getTwos());
			break;
		}
		case 3: {
			t.setThrees(t.threes(dadosFinal));
			System.out.println("3-THREES = " + t.getThrees());
			break;
		}
		case 4: {
			t.setFours(t.fours(dadosFinal));
			System.out.println("4-FOURS = " + t.getFours());
			break;
		}
		case 5: {
			t.setFives(t.fives(dadosFinal));
			System.out.println("5-FIVES = " + t.getFives());
			break;
		}
		case 6: {
			t.setSixes(t.sixes(dadosFinal));
			System.out.println("6-SIXES = " + t.getSixes());
			break;
		}
		case 7: {
			t.setTresIguais(t.tresIguais(dadosFinal));
			System.out.println("7-THREE OF A KIND = " + t.getTresIguais());
			break;
		}
		case 8: {
			t.setQuatroIguais(t.quatroIguais(dadosFinal));
			System.out.println("8-FOUR OF A KIND = " + t.getQuatroIguais());
			break;
		}
		case 9: {
			t.setFullHouse(t.fullHouse(dadosFinal));
			System.out.println("9-FULL HOUSE = " + t.getFullHouse());
			break;
		}
		case 10: {
			t.setSequenciaMenor(t.sequenciaMenor(dadosFinal));
			System.out.println("10-SEQUENCIA MENOR = " + t.getSequenciaMenor());
			break;
		}
		case 11: {
			t.setSequenciaMaior(t.sequenciaMaior(dadosFinal));
			System.out.println("11-SEQUENCIA MAIOR = " + t.getSequenciaMaior());
			break;
		}
		case 12: {
			t.setSomaDeTodos(t.somaDeTodos(dadosFinal));
			System.out.println("12-SORTE = " + t.getSomaDeTodos());
			break;
		}
		case 13: {
			t.setYahtzee(t.yahtzee(dadosFinal));
			System.out.println("13-YAHTZEE = " + t.getYahtzee());
			break;
		}
		}
	}
}