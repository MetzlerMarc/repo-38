package de.hsma.tpe.g38.main.exercise3;

public class Untoter extends Wesen {

	private int preis = 70;
	
	public int getPreis() {
		return preis;
	}
	
	public Untoter(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(120, 16, 2, 0.30);
		
	}
}
