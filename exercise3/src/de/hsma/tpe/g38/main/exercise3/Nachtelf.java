package de.hsma.tpe.g38.main.exercise3;

public class Nachtelf extends Wesen {

	private int preis = 145;
	
	public int getPreis() {
		return preis;
	}
	
	public Nachtelf(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(120, 15, 3, 0.20);

	}
}
