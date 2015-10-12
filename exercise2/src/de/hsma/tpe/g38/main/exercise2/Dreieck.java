package de.hsma.tpe.g38.main.exercise2;

public class Dreieck extends Figur {
	
	/*
	 * die Variablen sind durch die Klassifizierung 'private' nur für diese Klasse sichtbar
	 */
	private double hoehe;
	private double grundseite;
	
	/*
	 * Erstellt ein Dreieck mit einer angegebenen Höhe und Grundseite und errechnet die Fläche daraus
	 */
	protected Dreieck(double hoehe, double grundseite){
		super(hoehe * grundseite * 0.5);
		this.hoehe = hoehe;
		this.grundseite = grundseite;
	}
}
