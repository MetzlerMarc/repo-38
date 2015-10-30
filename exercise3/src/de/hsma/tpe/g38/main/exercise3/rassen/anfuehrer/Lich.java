package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Untoter;

public class Lich extends Untoter implements Anfuehrer {

	private double bonus = 2.3;
	private String beherrschtesElement = "Erde";

	@Override
	public double getBonus() {
		return bonus;
	}

	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Lich() {
		super();
		super.preis = 140;
	}
	
}
