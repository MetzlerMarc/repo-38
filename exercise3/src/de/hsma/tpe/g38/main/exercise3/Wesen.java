package de.hsma.tpe.g38.main.exercise3;

public abstract class Wesen {

	double leben;
	double schaden;
	double geschwindigkeit;
	double ruestung;

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

		return (double) damage;
	}

	public void isLebendig(double leben) {

		if (leben > 0) {
			System.out.println("Wesen ist lebendig.");
		} else {
			System.out.println("Wesen ist tot.");
		}
	}
}
