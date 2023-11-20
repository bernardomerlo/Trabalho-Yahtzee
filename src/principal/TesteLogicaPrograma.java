package principal;

import java.util.Scanner;

public class TesteLogicaPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador jogador1 = new Jogador("Bernardo");
		Jogador jogador2 = new Jogador("Antonio");
		Jogador jogador3 = new Jogador("Jose");

		Tabela tabelaJogador1 = new Tabela();
		Tabela tabelaJogador2 = new Tabela();
		Tabela tabelaJogador3 = new Tabela();

		jogador1.setT(tabelaJogador1);
		jogador2.setT(tabelaJogador2);
		jogador3.setT(tabelaJogador3);

		Dados dado1 = new Dados();
		Dados dado2 = new Dados();
		Dados dado3 = new Dados();
		Dados dado4 = new Dados();
		Dados dado5 = new Dados();

		dado1.setPosVetor(0);
		dado2.setPosVetor(1);
		dado3.setPosVetor(2);
		dado4.setPosVetor(3);
		dado5.setPosVetor(4);

		Dados[] dadosAtuais = { dado1, dado2, dado3, dado4, dado5 };
		Dados[] dadosGuardados = new Dados[5];
		Dados[] dadosFinal = new Dados[5];
		int[] facesSalvas = new int[5];
		// numero de rodadas por pessoa
		for (int i = 0; i < 3; i++) {

			for (int indexDadosAtuais = 0; indexDadosAtuais < dadosAtuais.length; indexDadosAtuais++) {
				if (!dadosAtuais[indexDadosAtuais].isSalvo()) {
					dadosAtuais[indexDadosAtuais].rolar();
					System.out
							.println("index" + (indexDadosAtuais) + ": " + dadosAtuais[indexDadosAtuais].getNumFace());
				}
			}
			for (int num : facesSalvas) {
				System.out.println("faces: " + num);
			}

			char escolha = 's';
			do {
				System.out.println("Deseja salvar algum dado? (s/n)");
				escolha = sc.nextLine().charAt(0);

				if (escolha == 's') {
					System.out.println("Digite o índice do dado que deseja salvar: ");
					int indiceDado = sc.nextInt();

					if (indiceDado >= 0 && indiceDado < dadosAtuais.length) {
						int numFace = dadosAtuais[indiceDado].getNumFace();
						facesSalvas[indiceDado] = numFace;
						dadosAtuais[indiceDado].setSalvo(true);
					} else {
						System.out.println("Índice inválido. Tente novamente.");
					}

					sc.nextLine();
				}

			} while (escolha == 's');

		}
		sc.close();
	}

}
