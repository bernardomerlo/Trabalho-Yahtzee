package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		int escolhaInicial = 0;

		while (escolhaInicial != 3) {
			m.menu();
			escolhaInicial = sc.nextInt();
			sc.nextLine();
			if (escolhaInicial == 1) {
				m.jogar();
			} else if (escolhaInicial == 2) {
				lerDados();
			} else if (escolhaInicial == 3) {
				System.out.println("FIM");
				sc.close();
			}
		}

	}

	public static void lerDados() {
		String caminho = "c:\\temp\\saida.txt";
		try {
			File arquivo = new File(caminho);
			FileReader fileReader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				String[] vet = linha.split(" ");
				if (vet[0].equals("Jogador:")) {
					System.out.println(linha);
				}
				if (vet[0].equals("Total") && vet[1].equals("Final:")) {
					System.out.println(linha);
					System.out.println();
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
}