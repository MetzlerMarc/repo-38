package de.hsma.tpe.g38.main.exercise3;

public class Erzmagier extends Anfuehrer {

	private double bonus = 5.0;
	
	public Erzmagier(double leben, double schaden, double geschwindigkeit, double ruestung, double preis, double bonus) {

		super(leben, schaden, geschwindigkeit, ruestung, preis, bonus);
		this.leben = 140 * bonus;
		this.schaden = 40 * bonus;
		this.geschwindigkeit = 2 * bonus;
		this.ruestung = 0.40 * bonus;
		this.preis = 290;
	}

}

