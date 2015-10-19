package de.hsma.tpe.g38.main.exercise3;

public class Anfuehrer extends Wesen {

	protected double bonus;

	public Anfuehrer(double leben, double schaden, double geschwindigkeit, double ruestung, double preis, double bonus) {
		super(leben, schaden, geschwindigkeit, ruestung, preis);
		this.bonus = bonus;
	}

	
}
