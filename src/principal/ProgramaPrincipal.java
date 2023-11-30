package principal;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Arquivos arquivo = new Arquivos();
		int escolhaInicial = 0;

		while (escolhaInicial != 5) {
			menu.menu();
			escolhaInicial = sc.nextInt();
			sc.nextLine();
			if (escolhaInicial == 1) {
				menu.jogar(arquivo);
			} else if (escolhaInicial == 2) {
				arquivo.lerDados();
			} else if (escolhaInicial == 3) {
				arquivo.mostrarJogadoresCadastrados();
			} else if (escolhaInicial == 4) {
				arquivo.cadastrarJogadores(arquivo.listaJogadores());
			} else if (escolhaInicial == 5) {
				System.out.println("FIM");
				sc.close();
			}
		}
	}
}