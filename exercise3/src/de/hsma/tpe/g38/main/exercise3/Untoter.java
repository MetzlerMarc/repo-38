package de.hsma.tpe.g38.main.exercise3;

public class Untoter extends Wesen {

	public Untoter(int leben, int schaden, int geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
		this.leben = 120;
		this.schaden = 16;
		this.geschwindigkeit = 2;
		this.ruestung = 0.30;
	}
}
