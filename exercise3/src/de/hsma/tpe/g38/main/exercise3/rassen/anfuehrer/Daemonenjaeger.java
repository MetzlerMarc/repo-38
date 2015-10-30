package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Nachtelf;

/*
 *Das ist die Klasse Daemonenjaeger. Diese Klasse zeichnet sich durch spezielle Fähigkeiten aus und ist die
 *Anfuehrerklasse der Nachtelfen.
 * 
 * @author Simon Karl und Christopher Troy
 */

public class Daemonenjaeger extends Nachtelf implements Anfuehrer {

	private double bonus = 3.0;
	private String beherrschtesElement = "Wind";

	/*
     * Liefert den Bonus dieser Klasse
     * 
     * @return Bonus (3.0) des Wesens
     */
	
	@Override
	public double getBonus() {
		return bonus;
	}

	/*
	 * Liefert das beherrschte Element dieser Klasse
	 * 
	 * @return beherrschtes Element Elemnt () dieser Klasse
	 */
	
	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Daemonenjaeger() {
		super();
		super.preis = 290;
	}

}