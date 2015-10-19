package de.hsma.tpe.g38.main.exercise3;

public class Lich extends Anfuehrer {

	private double bonus = 2.3;

	public Lich(double leben, double schaden, double geschwindigkeit, double ruestung, double preis, double bonus) {

		super(leben, schaden, geschwindigkeit, ruestung, preis, bonus);
		this.leben = 140;
		this.schaden = 40;
		this.geschwindigkeit = 2;
		this.ruestung = 0.40;
		this.preis = 140;
	}
}
