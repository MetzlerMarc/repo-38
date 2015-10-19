package de.hsma.tpe.g38.main.exercise3;

public class Wesen {

	int leben;
	int schaden;
	int geschwindigkeit;
	double ruestung;

	public Wesen(int leben, int schaden, int geschwindigkeit, double ruestung) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
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
