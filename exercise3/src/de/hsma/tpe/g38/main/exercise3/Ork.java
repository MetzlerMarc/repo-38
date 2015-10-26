package de.hsma.tpe.g38.main.exercise3;

public class Ork extends Wesen {
	
	private int preis = 150;

	public int getPreis() {
		return preis;
	}
	
	public Ork(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(100, 33, 1, 0.30);

	}
}
