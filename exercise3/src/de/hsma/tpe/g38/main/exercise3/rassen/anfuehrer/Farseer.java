package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Ork;

public class Farseer extends Ork implements Anfuehrer {

	private double bonus = 1.2;
	private String beherrschtesElement = "Feuer";

	@Override
	public double getBonus() {
		return bonus;
	}

	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Farseer() {
		super();
		super.preis = 300;
	}

}
