package de.hsma.tpe.g38.main.exercise3.rassen;

import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

public class Wesen {

	protected double leben;
	protected double schaden;
	protected double geschwindigkeit;
	protected double ruestung;
	protected int preis;

	public double getLeben() {
		return leben;
	}

	public double getSchaden() {
		return schaden;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public double getRuestung() {
		return ruestung;
	}

	public int getPreis() {
		return preis;
	}

	protected Wesen(double leben, double schaden, double geschwindigkeit, double ruestung) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
	}

	public String getName() {
		return this.getClass().getSimpleName();
	}

	public double getBonus() {

		if (this instanceof Anfuehrer) {
			return ((Anfuehrer) this).getBonus();
		}

		return 1.0;
	}

	public double attack(Wesen wesen) {

		double damage = geschwindigkeit * schaden * getBonus();

		damage = damage - (damage * wesen.ruestung);

		wesen.leben = Math.max(wesen.leben - damage, 0);

		return damage;
	}

	public boolean isLebendig() {

		if (leben > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAnfuehrer() {

		if (this instanceof Anfuehrer) {
			return true;
		} else {
			return false;
		}
	}

}
