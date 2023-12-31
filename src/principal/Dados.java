package principal;

import java.util.Random;

public class Dados implements Comparable<Dados> {
	private int numFace;
	private int posVetor;

	public int getNumFace() {
		return numFace;
	}

	public void setNumFace(int numFace) {
		this.numFace = numFace;
	}

	public void rolar() {
		Random face = new Random();
		setNumFace(face.nextInt(6) + 1);
	}

	public int getPosVetor() {
		return posVetor;
	}

	public void setPosVetor(int posVetor) {
		this.posVetor = posVetor;
	}

	@Override
	public int compareTo(Dados outro) {
		return Integer.compare(this.numFace, outro.numFace);
	}
}