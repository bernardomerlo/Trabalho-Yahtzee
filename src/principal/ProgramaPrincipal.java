package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de jogadores que vão jogar: ");
		int contadorJogadores = sc.nextInt();

		List<Jogador> listaJogadores = new ArrayList<Jogador>();
		for (int i = 0; i < contadorJogadores; i++) {
			System.out.println("Digite o nome do Jogador: ");
			sc.next();
			String nome = sc.nextLine();
			listaJogadores.add(new Jogador(nome));
		}

		Jogo jogoYathzee = new Jogo();
		jogoYathzee.jogar(listaJogadores);

		sc.close();
	}

}
