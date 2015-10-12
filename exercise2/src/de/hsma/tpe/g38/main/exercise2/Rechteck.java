package de.hsma.tpe.g38.main.exercise2;

public class Rechteck extends Figur {

	/*
	 * die Variablen sind durch die Klassifizierung 'private' nur für diese Klasse sichtbar
	 */
	private double hoehe;
	private double breite;
	
	/*
	 * Erstellt ein Rechteck mit einer angegebenen Höhe und Breite und errechnet die Fläche daraus
	 */
	protected Rechteck(double hoehe, double breite){
		super(hoehe * breite);
		this.hoehe = hoehe;
		this.breite = breite;
	}
}
