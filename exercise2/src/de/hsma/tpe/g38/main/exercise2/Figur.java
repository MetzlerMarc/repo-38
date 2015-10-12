package de.hsma.tpe.g38.main.exercise2;

public class Figur {
	
	/*
	 * Mit der Klassifizierung protected ist der Wert nur für diese Klasse und ihre Vererbungen sichtbar
	 */
	protected double flaeche;
	
	/*
	 * Weist der Fläche einen beliebigen Wert mit Nachkommestellen zu
	 */
	protected Figur(double flaeche){
		this.flaeche = flaeche;
	}
	 
	 
	/*
	 * Gibt den Wert der Fläche zurück
	 */
	protected double getFlaeche(){
		return flaeche;
	}
}
