package de.hsma.tpe.g38.main.exercise3;

public class Mensch extends Wesen {

	public Mensch(int leben, int schaden, int geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
		this.leben = 140;
		this.schaden = 40;
		this.geschwindigkeit = 2;
		this.ruestung = 0.40;
	}

}
