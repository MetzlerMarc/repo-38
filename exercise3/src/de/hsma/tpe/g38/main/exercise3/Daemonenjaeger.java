package de.hsma.tpe.g38.main.exercise3;

public class Daemonenjaeger extends Anfuehrer {

	private double bonus = 3.0;

	public Daemonenjaeger(double leben, double schaden, double geschwindigkeit, double ruestung, double preis, double bonus) {

		super(leben, schaden, geschwindigkeit, ruestung, preis, bonus);
		this.leben = 140 * bonus;
		this.schaden = 40;
		this.geschwindigkeit = 2;
		this.ruestung = 0.40;
		this.preis = 290;
	}
}
