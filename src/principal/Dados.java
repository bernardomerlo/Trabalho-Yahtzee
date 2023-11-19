package principal;

import java.util.Random;

public class Dados {
	private int numFace;

	public Dados() {
	}

	public int getNumFace() {
		return numFace;
	}


	public int rolar() {
		Random face = new Random();
		return face.nextInt(6) + 1;
	}

}
