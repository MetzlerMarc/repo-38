package de.hsma.tpe.g38.main.exercise3;

public class Farseer extends Anfuehrer {
	
	private double bonus = 1.2;

	public Farseer(int leben, int schaden, int geschwindigkeit, double ruestung, double bonus) {

		super(leben, schaden, geschwindigkeit, ruestung, bonus);
		this.leben = 140 * bonus;
		this.schaden = 40 * bonus;
		this.geschwindigkeit = 2;
		this.ruestung = 0.40;
	}
}
