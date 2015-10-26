package de.hsma.tpe.g38.main.exercise3;

public class Mensch extends Wesen {

	private int preis = 110;
	
	public int getPreis() {
		return preis;
	}
	
	public Mensch(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(140, 40, 2, 0.40);

	}

}
