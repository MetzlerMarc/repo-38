package de.hsma.tpe.g38.main.exercise3;

public class Nachtelf extends Wesen {

	public Nachtelf(int leben, int schaden, int geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
		this.leben = 120;
		this.schaden = 15;
		this.geschwindigkeit = 3;
		this.ruestung = 0.20;
	}
}
