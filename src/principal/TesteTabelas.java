package principal;

import java.util.ArrayList;
import java.util.List;

public class TesteTabelas {

	public static void main(String[] args) {
		Dados d1 = new Dados();
		Dados d2 = new Dados();
		Dados d3 = new Dados();
		Dados d4 = new Dados();
		Dados d5 = new Dados();
		List<Dados> d = new ArrayList<Dados>();

		d1.rolar();
		d2.rolar();
		d3.rolar();
		d4.rolar();
		d5.rolar();

		System.out.println("d1 = " + d1.getNumFace());
		System.out.println("d2 = " + d2.getNumFace());
		System.out.println("d3 = " + d3.getNumFace());
		System.out.println("d4 = " + d4.getNumFace());
		System.out.println("d5 = " + d5.getNumFace());

		d.add(d1);
		d.add(d2);
		d.add(d3);
		d.add(d4);
		d.add(d5);

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

}
