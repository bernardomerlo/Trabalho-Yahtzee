package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteSeleçãoDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador j = new Jogador("Bernardo");
		Tabela tabelaJogador1 = new Tabela();
		j.setT(tabelaJogador1);
		List<Dados> d = new ArrayList<Dados>();
		List<Dados> dadosGuardados = new ArrayList<Dados>();
		Dados dado1 = new Dados();
		Dados dado2 = new Dados();
		Dados dado3 = new Dados();
		Dados dado4 = new Dados();
		Dados dado5 = new Dados();

		d.add(dado1);
		d.add(dado2);
		d.add(dado3);
		d.add(dado4);
		d.add(dado5);

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

					if (indiceDado >= 0 && indiceDado < d.size()) {
						Dados dadoTemp = d.get(indiceDado);
						dadosGuardados.add(dadoTemp); // adiciona na lista de dados guardados
						d.remove(indiceDado); // remove da lista de dados atuais
						System.out.println("Dado da face " + dadoTemp.getNumFace() + " guardado");
					} else {
						System.out.println("Índice inválido. Tente novamente.");
					}

					sc.nextLine();
				}

			} while (escolha == 's');

			Tabela t = new Tabela();

			t.ones(d);
			System.out.println("t.ones() = " + t.getOnes());
			t.twos(d);
			System.out.println("t.twos(d) = " + t.getTwos());
			t.threes(d);
			System.out.println("t.threes(d) = " + t.getThrees());
			t.fours(d);
			System.out.println("t.fours(d) = " + t.getFours());
			t.fives(d);
			System.out.println("t.fives(d) = " + t.getFives());
			t.sixes(d);
			System.out.println("t.sixes(d) = " + t.getSixes());
			t.total1();
			t.bonus();
			System.out.println("t.total1() = " + t.getTotal1());

			t.tresIguais(d);
			System.out.println("t.tresIguais(d) = " + t.getTresIguais());
			t.quatroIguais(d);
			System.out.println("t.quatroIguais(d) = " + t.getQuatroIguais());
			t.fullHouse(d);
			System.out.println("t.fullHouse(d) = " + t.getFullHouse());
			t.sequenciaMenor(d);
			System.out.println("t.sequenciaMenor(d) = " + t.getSequenciaMenor());
			t.sequenciaMaior(d);
			System.out.println("t.sequenciaMaior(d) = " + t.getSequenciaMaior());
			t.somaDeTodos(d);
			System.out.println("t.somaDeTodos(d) = " + t.getSomaDeTodos());
			t.yahtzee(d);
			System.out.println("t.yatzhee(d) = " + t.getYahtzee());

		}
		sc.close();
	}

}
