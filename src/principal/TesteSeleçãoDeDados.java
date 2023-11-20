package principal;

import java.util.Scanner;

public class TesteSeleçãoDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador j = new Jogador("Bernardo");
		Tabela tabelaJogador1 = new Tabela();
		j.setT(tabelaJogador1);
		Dados dado1 = new Dados();
		Dados dado2 = new Dados();
		Dados dado3 = new Dados();
		Dados dado4 = new Dados();
		Dados dado5 = new Dados();
		dado1.setNumFace(0);
		dado2.setNumFace(1);
		dado3.setNumFace(2);
		dado4.setNumFace(3);
		dado5.setNumFace(4);

		Dados[] d = { dado1, dado2, dado3, dado4, dado5 };
		Dados[] dadosGuardados = new Dados[5];

		for (int i = 0; i < 3; i++) {

			for (Dados dados : d) {
				dados.rolar();
				System.out.println("face: " + dados.getNumFace());
			}

			char escolha = 's';
			do {
				System.out.println("Deseja salvar algum dado? (s/n)");
				escolha = sc.nextLine().charAt(0);

				if (escolha == 's') {
					System.out.println("Digite o índice do dado que deseja salvar: ");
					int indiceDado = sc.nextInt();

					if (indiceDado >= 0 && indiceDado < d.length) {
						Dados dadoTemp = d[indiceDado];
						dadosGuardados[indiceDado] = dadoTemp; // adiciona na lista de dados guardados
						Dados dadoVoltando = new Dados();
						dadoVoltando.setPosVetor(indiceDado);
						d[indiceDado] = dadoVoltando; // remove da lista de dados atuais
						System.out.println("Dado da face " + dadoTemp.getNumFace() + " guardado");
					} else {
						System.out.println("Índice inválido. Tente novamente.");
					}

					sc.nextLine();
				}

			} while (escolha == 's');

			Tabela t = new Tabela();

			Dados d1Final = new Dados();
			Dados d2Final = new Dados();
			Dados d3Final = new Dados();
			Dados d4Final = new Dados();
			Dados d5Final = new Dados();

			if (d[0] == null) {
				d1Final = dadosGuardados[0];
			} else {
				d1Final = d[0];
			}
			if (d[1] == null) {
				d2Final = dadosGuardados[1];
			} else {
				d2Final = d[1];
			}
			if (d[2] == null) {
				d3Final = dadosGuardados[2];
			} else {
				d3Final = d[2];
			}
			if (d[3] == null) {
				d4Final = dadosGuardados[3];
			} else {
				d4Final = d[3];
			}
			if (d[4] == null) {
				d5Final = dadosGuardados[4];
			} else {
				d5Final = d[4];
			}

			Dados[] dadosFinal = { d1Final, d2Final, d3Final, d4Final, d5Final };

			t.ones(dadosFinal);
			System.out.println("t.ones() = " + t.getOnes());
			t.twos(dadosFinal);
			System.out.println("t.twos(d) = " + t.getTwos());
			t.threes(dadosFinal);
			System.out.println("t.threes(d) = " + t.getThrees());
			t.fours(dadosFinal);
			System.out.println("t.fours(d) = " + t.getFours());
			t.fives(dadosFinal);
			System.out.println("t.fives(d) = " + t.getFives());
			t.sixes(dadosFinal);
			System.out.println("t.sixes(d) = " + t.getSixes());
			t.total1();
			t.bonus();
			System.out.println("t.total1() = " + t.getTotal1());

			t.tresIguais(dadosFinal);
			System.out.println("t.tresIguais(d) = " + t.getTresIguais());
			t.quatroIguais(dadosFinal);
			System.out.println("t.quatroIguais(d) = " + t.getQuatroIguais());
			t.fullHouse(dadosFinal);
			System.out.println("t.fullHouse(d) = " + t.getFullHouse());
			t.sequenciaMenor(dadosFinal);
			System.out.println("t.sequenciaMenor(d) = " + t.getSequenciaMenor());
			t.sequenciaMaior(dadosFinal);
			System.out.println("t.sequenciaMaior(d) = " + t.getSequenciaMaior());
			t.somaDeTodos(dadosFinal);
			System.out.println("t.somaDeTodos(d) = " + t.getSomaDeTodos());
			t.yahtzee(dadosFinal);
			System.out.println("t.yatzhee(d) = " + t.getYahtzee());

		}
		sc.close();
	}

}
