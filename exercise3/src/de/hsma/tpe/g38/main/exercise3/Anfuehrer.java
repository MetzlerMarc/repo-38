package de.hsma.tpe.g38.main.exercise3;

public class Anfuehrer extends Wesen {

	protected double bonus;

	public Anfuehrer(int leben, int schaden, int geschwindigkeit, double ruestung, double bonus) {
		super(leben, schaden, geschwindigkeit, ruestung);
		this.bonus = bonus;
	}
}
