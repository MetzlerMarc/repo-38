package de.hsma.tpe.g38.main.exercise3;

public class Wesen {

	double leben;
	double schaden;
	double geschwindigkeit;
	double ruestung;
	double preis;

	public Wesen(double leben, double schaden, double geschwindigkeit, double ruestung, double preis) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
		this.preis = preis;
	}

	/*
 * Methode attack muss noch bearbeitet werden!!
 */
	public void attack() {

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
