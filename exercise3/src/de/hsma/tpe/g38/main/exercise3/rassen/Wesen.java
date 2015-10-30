package de.hsma.tpe.g38.main.exercise3.rassen;

import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

/**
 *Das ist die Klasse Wesen, von der alle Wesen erben. Sie enthaelt Getter fuer die Attribute, die jede Klasse hat. 
 *Ausserdem kann abgefragt werden, ob es sich um ein lebendiges Wesen bzw. einen Anfuehrer handelt.
 *
 *@author Simon Karl und Christopher Troy
 */

public class Wesen {
    
    //Attribute
	protected double leben;
	protected double schaden;
	protected double geschwindigkeit;
	protected double ruestung;
	protected int preis;

	/**
	 * Gibt das Leben eines Wesens aus.
	 * 
	 * @return Leben des Wesens
	 */
	public double getLeben() {
		return leben;
	}

	/**
	 * Gibt den Schaden eines Wesens aus.
	 * 
	 * @return Schaden des Wesens
	 */
	public double getSchaden() {
		return schaden;
	}

	/**
	 * Gibt die Geschwindigkeit eines Wesens aus.
	 * 
	 * @return Geschwindigkeit des Wesens
	 */
	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * Gibt die Ruestung eines Wesens aus.
	 * 
	 * @return Ruestung des Wesens
	 */
	public double getRuestung() {
		return ruestung;
	}

	/**
	 * Gibt den Preis eines Wesens aus.
	 * 
	 * @return Preis
	 */
	public int getPreis() {
		return preis;
	}

	/**
	 * Erstellt ein Wesen mit Leben, Schaden, Geschwindigkeit, Ruestung.
	 * 
	 * @param leben
	 * @param schaden
	 * @param geschwindigkeit
	 * @param ruestung
	 */
	protected Wesen(double leben, double schaden, double geschwindigkeit, double ruestung) {
		this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
	}

	/**
	 * Gibt den Name des Wesens aus.
	 * 
	 * @return Name des Wesens
	 */
	public String getName() {
		return this.getClass().getSimpleName();
	}

	/**
	 * Gibt den Bonus des Wesens aus, falls es sich um einen Anfuehrer handelt, andernfalls wird der Default-Wert 1.0 angenommen.
	 * 
	 * @return Bonus des Wesens
	 */
	public double getBonus() {

		if (this instanceof Anfuehrer) {
			return ((Anfuehrer) this).getBonus();
		}

		return 1.0;
	}

	/**
	 * Diese Methode beschreibt die Schadenserrechnung bei einem Kampf. Erst wird der absolute Schaden des angreifenden Wesens errechnet,
	 * indem der Schaden, die Geschwindigkeit und der Bonus multipliziert werden.
	 * Dann wird der Schaden subtrahiert, den die Ruestung des angegriffenen Wesens abfaengt.
	 * Dieser endgültige Schaden wird vom Leben des angegriffenen Wesens abgezogen.
	 * 
	 * @param wesen Wesen, das angegriffen wird
	 * @return Schaden des angreifenden Wesens
	 */
	public double attack(Wesen wesen) {

		double damage = geschwindigkeit * schaden * getBonus();

		damage = damage - (damage * wesen.ruestung);

		wesen.leben = Math.max(wesen.leben - damage, 0);

		return damage;
	}

	/**
	 * Liefert den Wahrheitswert über die Lebendigkeit des Wesens.
	 * 
	 * @return 'true', wenn das Wesen lebendig ist; 'false', wenn das Wesen tot ist
	 */
	public boolean isLebendig() {

		if (leben > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Liefert den Wahrheitswert, ob es sich um einen Anfuehrer handelt.
	 * 
	 * @return 'true', wenn das Wesen ein Anfuehrer ist; 'false', wenn es sich um ein normales Wesen handelt.
	 */
	public boolean isAnfuehrer() {

		if (this instanceof Anfuehrer) {
			return true;
		} else {
			return false;
		}
	}

}
