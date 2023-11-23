package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Editor {
	static Scanner scan = new Scanner(System.in);
	private Jogador jogador1;
	private Jogador jogador2;

	public Editor(Jogador jogador1, Jogador jogador2) {
		this.setJogador1(jogador1);
		this.setJogador2(jogador2);

	}

	public void escreverJogador1() {
		try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\jogador1.txt", true))) {
			bw1.write("1s: " + jogador1.getT().getOnes() + "p");
			bw1.write("2s: " + jogador1.getT().getTwos() + "p");
			bw1.write("3s: " + jogador1.getT().getThrees() + "p");
			bw1.write("4s: " + jogador1.getT().getFours() + "p");
			bw1.write("5s: " + jogador1.getT().getFives() + "p");
			bw1.write("6s: " + jogador1.getT().getSixes() + "p");
			bw1.write("Bônus: " + jogador1.getT().getBonus() + "p");
			bw1.write("Trinca: " + jogador1.getT().getTresIguais() + "p");
			bw1.write("Quadra: " + jogador1.getT().getQuatroIguais() + "p");
			bw1.write("FullHouse: " + jogador1.getT().getFullHouse() + "p");
			bw1.write("Sequência Menor: " + jogador1.getT().getSequenciaMenor() + "p");
			bw1.write("Sequência Maior: " + jogador1.getT().getSequenciaMaior() + "p");
			bw1.write("Soma de Todos: " + jogador1.getT().getSomaDeTodos() + "p");
			bw1.write("Yahtzee: " + jogador1.getT().getYahtzee() + "p");
			bw1.write("Total Final " + jogador1.getT().getTotalFinal() + "p");
		} catch (IOException erroEscrita1) {
			System.out.println("Erro: " + erroEscrita1.getMessage());
		} finally {
			System.out.println("RODOU");

		}
	}

	public void lerJogador1() {
		try (BufferedReader br1 = new BufferedReader(new FileReader("c:\\jogador1.txt"))) {

		} catch (IOException erroLeitura1) {
			System.out.println("Erro: " + erroLeitura1.getMessage());
		} finally {

		}
	}

	public void escreverJogador2() {
		try (BufferedWriter bw2 = new BufferedWriter(new FileWriter("c:\\jogador2.txt", true))) {
			bw2.write("1s: " + jogador2.getT().getOnes() + "p");
			bw2.write("2s: " + jogador2.getT().getTwos() + "p");
			bw2.write("3s: " + jogador2.getT().getThrees() + "p");
			bw2.write("4s: " + jogador2.getT().getFours() + "p");
			bw2.write("5s: " + jogador2.getT().getFives() + "p");
			bw2.write("6s: " + jogador2.getT().getSixes() + "p");
			bw2.write("Bônus: " + jogador2.getT().getBonus() + "p");
			bw2.write("Trinca: " + jogador2.getT().getTresIguais() + "p");
			bw2.write("Quadra: " + jogador2.getT().getQuatroIguais() + "p");
			bw2.write("FullHouse: " + jogador2.getT().getFullHouse() + "p");
			bw2.write("Sequência Menor: " + jogador2.getT().getSequenciaMenor() + "p");
			bw2.write("Sequência Maior: " + jogador2.getT().getSequenciaMaior() + "p");
			bw2.write("Soma de Todos: " + jogador2.getT().getSomaDeTodos() + "p");
			bw2.write("Yahtzee: " + jogador2.getT().getYahtzee() + "p");
			bw2.write("Total Final " + jogador2.getT().getTotalFinal() + "p");
		} catch (IOException erroEscrita2) {
			System.out.println("Erro: " + erroEscrita2.getMessage());
		} finally {
			System.out.println("RODOU");

		}
	}

	public void lerJogador2() {
		try (BufferedReader br2 = new BufferedReader(new FileReader("c:\\jogador2.txt"))) {

		} catch (IOException erroLeitura2) {
			System.out.println("Erro: " + erroLeitura2.getMessage());
		} finally {
		}
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
}
