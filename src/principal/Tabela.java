package principal;

import java.util.Arrays;

public class Tabela {
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int total1;
	private int bonus;

	private int tresIguais;
	private int quatroIguais;
	private int fullHouse;
	private int sequenciaMenor;
	private int sequenciaMaior;
	private int somaDeTodos;
	private int yahtzee;
	private int totalFinal;

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

	public int getTotal1() {
		return total1;
	}

	public void setTotal1(int total1) {
		this.total1 = total1 + ones + twos + threes + fours + fives + sixes + bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTotalFinal() {
		return totalFinal;
	}

	public void setTotalFinal(int totalFinal) {
		this.totalFinal = totalFinal;
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

	public int ones(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 1) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int twos(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 2) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int threes(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 3) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int fours(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 4) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int fives(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 5) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int sixes(Dados[] dados) {
		int total = 0;
		for (Dados d : dados) {
			if (d.getNumFace() == 6) {
				total += d.getNumFace();
			}
		}
		return total;
	}

	public int tresIguais(Dados[] dados) {
		int total = 0;
		int dado1 = dados[0].getNumFace();
		int dado2 = dados[1].getNumFace();
		int dado3 = dados[2].getNumFace();
		int dado4 = dados[3].getNumFace();
		int dado5 = dados[4].getNumFace();

		if ((dado1 == dado2 && dado2 == dado3) || (dado1 == dado2 && dado2 == dado4)
				|| (dado1 == dado2 && dado2 == dado5) || (dado1 == dado3 && dado3 == dado4)
				|| (dado1 == dado3 && dado3 == dado5) || (dado1 == dado4 && dado4 == dado5)
				|| (dado2 == dado3 && dado3 == dado4) || (dado2 == dado3 && dado3 == dado5)
				|| (dado2 == dado4 && dado4 == dado5) || (dado3 == dado4 && dado4 == dado5)) {
			total = dado1 + dado2 + dado3 + dado4 + dado5;
		}

		return total;
	}

	public int quatroIguais(Dados[] dados) {
		int total = 0;
		int dado1 = dados[0].getNumFace();
		int dado2 = dados[1].getNumFace();
		int dado3 = dados[2].getNumFace();
		int dado4 = dados[3].getNumFace();
		int dado5 = dados[4].getNumFace();

		if ((dado1 == dado2 && dado2 == dado3 && dado3 == dado4) || (dado1 == dado2 && dado2 == dado3 && dado3 == dado5)
				|| (dado1 == dado2 && dado2 == dado4 && dado4 == dado5)
				|| (dado1 == dado3 && dado3 == dado4 && dado4 == dado5)
				|| (dado2 == dado3 && dado3 == dado4 && dado4 == dado5)) {
			total = dado1 + dado2 + dado3 + dado4 + dado5;
		}
		return total;
	}

	public int fullHouse(Dados[] dados) {
		int total = 0;
		int dado1 = dados[0].getNumFace();
		int dado2 = dados[1].getNumFace();
		int dado3 = dados[2].getNumFace();
		int dado4 = dados[3].getNumFace();
		int dado5 = dados[4].getNumFace();

		if ((dado1 == dado2 && dado3 != dado1 && dado4 != dado1 && dado5 != dado1)
				|| (dado1 == dado3 && dado2 != dado1 && dado4 != dado1 && dado5 != dado1)
				|| (dado1 == dado4 && dado2 != dado1 && dado3 != dado1 && dado5 != dado1)
				|| (dado1 == dado5 && dado2 != dado1 && dado3 != dado1 && dado4 != dado1)
				|| (dado2 == dado3 && dado1 != dado2 && dado4 != dado2 && dado5 != dado2)
				|| (dado2 == dado4 && dado1 != dado2 && dado3 != dado2 && dado5 != dado2)
				|| (dado2 == dado5 && dado1 != dado2 && dado3 != dado2 && dado4 != dado2)
				|| (dado3 == dado4 && dado1 != dado3 && dado2 != dado3 && dado5 != dado3)
				|| (dado3 == dado5 && dado1 != dado3 && dado2 != dado3 && dado4 != dado3)
				|| (dado4 == dado5 && dado1 != dado4 && dado2 != dado4 && dado3 != dado4)) {

			if ((dado1 == dado2 && dado2 == dado3 && dado4 != dado1 && dado5 != dado1)
					|| (dado1 == dado2 && dado2 == dado4 && dado3 != dado1 && dado5 != dado1)
					|| (dado1 == dado2 && dado2 == dado5 && dado3 != dado1 && dado4 != dado1)
					|| (dado1 == dado3 && dado3 == dado4 && dado2 != dado1 && dado5 != dado1)
					|| (dado1 == dado3 && dado3 == dado5 && dado2 != dado1 && dado4 != dado1)
					|| (dado1 == dado4 && dado4 == dado5 && dado2 != dado1 && dado3 != dado1)
					|| (dado2 == dado3 && dado3 == dado4 && dado1 != dado2 && dado5 != dado2)
					|| (dado2 == dado3 && dado3 == dado5 && dado1 != dado2 && dado4 != dado2)
					|| (dado2 == dado4 && dado4 == dado5 && dado1 != dado2 && dado3 != dado2)
					|| (dado3 == dado4 && dado4 == dado5 && dado1 != dado3 && dado2 != dado3)) {
				total = 25;
			}
		}
		return total;
	}

	public int sequenciaMenor(Dados[] dados) {
		int dado1 = dados[0].getNumFace();
		int dado2 = dados[1].getNumFace();
		int dado3 = dados[2].getNumFace();
		int dado4 = dados[3].getNumFace();
		int dado5 = dados[4].getNumFace();
		int[] listaDados = { dado1, dado2, dado3, dado4, dado5 };

		Arrays.sort(listaDados);
		int total = 0;

		for (int i = 0; i <= listaDados.length - 4; i++) {
			if (listaDados[i + 1] == listaDados[i] + 1 && listaDados[i + 2] == listaDados[i] + 2
					&& listaDados[i + 3] == listaDados[i] + 3) {
				total = 30;
			}
		}

		return total;
	}

	public int sequenciaMaior(Dados[] dados) {
		int total = 0;
		int dado1 = dados[0].getNumFace();
		int dado2 = dados[1].getNumFace();
		int dado3 = dados[2].getNumFace();
		int dado4 = dados[3].getNumFace();
		int dado5 = dados[4].getNumFace();
		int[] listaDados = { dado1, dado2, dado3, dado4, dado5 };
		Arrays.sort(listaDados);

		for (int i = 0; i < listaDados.length - 4; i++) {
			if (listaDados[i] + 1 == listaDados[i + 1] && listaDados[i + 1] + 1 == listaDados[i + 2]
					&& listaDados[i + 2] + 1 == listaDados[i + 3] && listaDados[i + 3] + 1 == listaDados[i + 4]) {
				total = 40;
			}
		}
		return total;
	}

	public int somaDeTodos(Dados[] dados) {
		return (dados[0].getNumFace() + dados[1].getNumFace() + dados[2].getNumFace() + dados[3].getNumFace()
				+ dados[4].getNumFace());
	}

	public int yahtzee(Dados[] dados) {
		int total = 0;
		if (dados[0].getNumFace() == dados[1].getNumFace() && dados[1].getNumFace() == dados[2].getNumFace()
				&& dados[2].getNumFace() == dados[3].getNumFace() && dados[3].getNumFace() == dados[4].getNumFace()) {
			total = 50;
		}
		return total;
	}

	public int bonus() {
		if (getTotal1() >= 63) {
			return (total1 += 35);
		} else {
			return 0;
		}
	}

	public int calcularSoma1() {
		int totalParcial = ones + twos + threes + fours + fives + sixes + bonus;
		setTotal1(totalParcial);
		return totalParcial;
	}

	public int calcularPontosTotal() {
		int totalFinal = ones + twos + threes + fours + fives + sixes + bonus + tresIguais + quatroIguais + fullHouse
				+ sequenciaMenor + sequenciaMaior + somaDeTodos + yahtzee;
		setTotalFinal(totalFinal);
		return totalFinal;
	}

}