package principal;

import java.util.Random;

public class Dados {
	private int numFace;

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

}
