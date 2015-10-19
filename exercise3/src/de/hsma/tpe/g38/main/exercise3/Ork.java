package de.hsma.tpe.g38.main.exercise3;

public class Ork extends Wesen {

	public Ork(int leben, int schaden, int geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
		this.leben = 100;
		this.schaden = 33;
		this.geschwindigkeit = 1;
		this.ruestung = 0.30;
	}
}
