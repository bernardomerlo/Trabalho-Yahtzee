package principal;

import java.util.List;

public class Tabela {
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;

	private int tresIguais;
	private int quatroIguais;
	private int fullHouse;
	private int sequenciaMenor;
	private int sequenciaMaior;
	private int somaDeTodos;
	private int yahtzee;

	public int getOnes() {
		return ones;
	}

	public void setOnes(int ones) {
		this.ones = ones;
	}

	public int getTwos() {
		return twos;
	}

	public void setTwos(int twos) {
		this.twos = twos;
	}

	public int getThrees() {
		return threes;
	}

	public void setThrees(int threes) {
		this.threes = threes;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getFives() {
		return fives;
	}

	public void setFives(int fives) {
		this.fives = fives;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getTresIguais() {
		return tresIguais;
	}

	public void setTresIguais(int tresIguais) {
		this.tresIguais = tresIguais;
	}

	public int getQuatroIguais() {
		return quatroIguais;
	}

	public void setQuatroIguais(int quatroIguais) {
		this.quatroIguais = quatroIguais;
	}

	public int getFullHouse() {
		return fullHouse;
	}

	public void setFullHouse(int fullHouse) {
		this.fullHouse = fullHouse;
	}

	public int getSequenciaMenor() {
		return sequenciaMenor;
	}

	public void setSequenciaMenor(int sequenciaMenor) {
		this.sequenciaMenor = sequenciaMenor;
	}

	public int getSequenciaMaior() {
		return sequenciaMaior;
	}

	public void setSequenciaMaior(int sequenciaMaior) {
		this.sequenciaMaior = sequenciaMaior;
	}

	public int getSomaDeTodos() {
		return somaDeTodos;
	}

	public void setSomaDeTodos(int somaDeTodos) {
		this.somaDeTodos = somaDeTodos;
	}

	public int getYahtzee() {
		return yahtzee;
	}

	public void setYahtzee(int yahtzee) {
		this.yahtzee = yahtzee;
	}

	public void mostrarTabela() {
		System.out.println("Ones: " + getOnes());
		System.out.println("Twos: " + getTwos());
		System.out.println("Threes: " + getThrees());
		System.out.println("Fours: " + getFours());
		System.out.println("Fives: " + getFives());
		System.out.println("Sixes: " + getSixes());
		System.out.println("Three of a Kind: " + getTresIguais());
		System.out.println("Four of a Kind: " + getQuatroIguais());
		System.out.println("Full House: " + getFullHouse());
		System.out.println("Small straight: " + getSequenciaMenor());
		System.out.println("Large straight: " + getSequenciaMaior());
		System.out.println("Chance: " + getSomaDeTodos());
		System.out.println("Yahtzee: " + getYahtzee());
	}

	public void ones(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 1) {
				total += d.getNumFace();
			}
		}
		setOnes(total);
	}

	public void twos(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 2) {
				total += d.getNumFace();
			}
		}
		setTwos(total);
	}

	public void threes(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 3) {
				total += d.getNumFace();
			}
		}
		setThrees(total);
	}

	public void fours(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 4) {
				total += d.getNumFace();
			}
		}
		setFours(total);
	}

	public void fives(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 5) {
				total += d.getNumFace();
			}
		}
		setFives(total);
	}

	public void sixes(List<Dados> dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 6) {
				total += d.getNumFace();
			}
		}
		setSixes(total);
	}

	public void tresIguais(List<Dados> dados) {
		int total = 0;
		int dado1 = dados.indexOf(0);
		int dado2 = dados.indexOf(1);
		int dado3 = dados.indexOf(2);
		int dado4 = dados.indexOf(3);
		int dado5 = dados.indexOf(4);

		if (dado1 == dado2 || dado2 == dado3) {
			total = dado1 + dado2 + dado3 + dado4 + dado5;
		}else if()

		setTresIguais(total);
	}
}
