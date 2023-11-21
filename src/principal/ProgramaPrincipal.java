package principal;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de jogadores vão jogar: ");
		int quantJogadores = sc.nextInt();
		for (int jgdores = 0; jgdores < quantJogadores; jgdores++) {
			System.out.println("Digite o jogador numero " + (jgdores + 1) + ": ");
			String nome = sc.nextLine();
			Jogador jogador = new Jogador(nome);
			sc.next();
			Dados[] dadosIniciais = new Dados[5];
			Dados[] dadosAux = new Dados[5];

			Dados d1 = new Dados();
			Dados d2 = new Dados();
			Dados d3 = new Dados();
			Dados d4 = new Dados();
			Dados d5 = new Dados();

			restaurarDados(dadosIniciais, d1, d2, d3, d4, d5);

			for (int rodadas = 0; rodadas < 3; rodadas++) {
				for (int i = 0; i < dadosIniciais.length; i++) {
					if (dadosIniciais[i] != null) {
						dadosIniciais[i].rolar();
						System.out.println("Face do dado (" + i + "): " + dadosIniciais[i].getNumFace());

					}
				}

				System.out.println("Vai salvar algum? ");
				char escolha = sc.next().charAt(0);
				if (escolha == 's') {
					System.out.println("Quantos? ");
					int tamanhoVetor = sc.nextInt();
					for (int j = 0; j < tamanhoVetor; j++) {
						System.out.println("Qual? ");
						int indexDado = sc.nextInt();
						dadosAux[indexDado] = dadosIniciais[indexDado];
						dadosIniciais[indexDado] = null;
						System.out.println("DADO DA POSICAO " + indexDado + " SALVO");
					}
					System.out.println("Faces dos dados Mantidos");
					for (Dados d : dadosAux) {
						if (d != null)
							System.out.println(d.getNumFace());
					}
					System.out.println();
					System.out.println("Face dos dados antigos");
					for (Dados d : dadosIniciais) {
						if (d != null)
							System.out.println(d.getNumFace());
					}

				}
			}

			Tabela t = new Tabela();
			jogador.setT(t);

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

			System.out.println("1-t.ones() = " + t.ones(dadosFinal));
			System.out.println("2-t.twos(d) = " + t.twos(dadosFinal));
			System.out.println("3-t.threes(d) = " + t.threes(dadosFinal));
			System.out.println("4-t.fours(d) = " + t.fours(dadosFinal));
			System.out.println("5-t.fives(d) = " + t.fives(dadosFinal));
			System.out.println("6-t.sixes(d) = " + t.sixes(dadosFinal));
			t.total1();
			t.bonus();
			System.out.println("t.total1() = " + t.getTotal1());

			System.out.println("7-t.tresIguais(d) = " + t.tresIguais(dadosFinal));
			System.out.println("-8t.quatroIguais(d) = " + t.quatroIguais(dadosFinal));
			System.out.println("9-t.fullHouse(d) = " + t.fullHouse(dadosFinal));
			System.out.println("10-t.sequenciaMenor(d) = " + t.sequenciaMenor(dadosFinal));
			System.out.println("11-t.sequenciaMaior(d) = " + t.sequenciaMaior(dadosFinal));
			System.out.println("12-t.somaDeTodos(d) = " + t.somaDeTodos(dadosFinal));
			System.out.println("13-t.yatzhee(d) = " + t.yahtzee(dadosFinal));

			System.out.println("Digite o que voce deseja atribuir: ");
			int escolhaAtribuir = sc.nextInt();

			switch (escolhaAtribuir) {
			case 1: {
				t.setOnes(t.ones(dadosFinal));
				System.out.println("1-t.ones() = " + t.getOnes());
				break;
			}
			case 2: {
				t.setTwos(t.twos(dadosFinal));
				System.out.println("2-t.twos(d) = " + t.getTwos());
			}
			case 3: {
				t.setThrees(t.threes(dadosFinal));
				System.out.println("3-t.threes(d) = " + t.threes(dadosFinal));
			}
			}
			restaurarDados(dadosIniciais, d1, d2, d3, d4, d5);
		}
		sc.close();

	}

	public static void restaurarDados(Dados[] dados, Dados d1, Dados d2, Dados d3, Dados d4, Dados d5) {
		dados[0] = d1;
		dados[1] = d2;
		dados[2] = d3;
		dados[3] = d4;
		dados[4] = d5;

	}
}
