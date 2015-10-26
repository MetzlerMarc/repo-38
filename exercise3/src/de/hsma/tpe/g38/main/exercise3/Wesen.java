package de.hsma.tpe.g38.main.exercise3;

public class Wesen {

	double leben;
	double schaden;
	double geschwindigkeit;
	double ruestung;
	double preis;

	public Wesen(double leben, double schaden, double geschwindigkeit, double ruestung) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
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

	/*
	 * Methode zur Überprüfung der Lebendigkeit des Wesens.
	 */
	public void isLebendig(int leben) {

		if (leben > 0) {
			System.out.println("Wesen ist lebendig.");
		} else {
			System.out.println("Wesen ist tot.");
		}
	}
}
