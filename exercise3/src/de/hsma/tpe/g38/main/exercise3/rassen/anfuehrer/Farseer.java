package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Ork;

/*
 *Das ist die Klasse Farseer. Diese Klasse zeichnet sich durch spezielle Fähigkeiten aus und ist die
 *Anfuehrerklasse der Orks.
 * 
 * @author Simon Karl und Christopher Troy
 */

public class Farseer extends Ork implements Anfuehrer {

	private double bonus = 1.2;
	private String beherrschtesElement = "Feuer";
	
	/*
     * Liefert den Bonus dieser Klasse
     * 
     * @return Bonus (1.2) des Wesens
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

	public Farseer() {
		super();
		super.preis = 300;
	}

}
