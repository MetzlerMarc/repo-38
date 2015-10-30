package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Nachtelf;

public class Daemonenjaeger extends Nachtelf implements Anfuehrer {

	private double bonus = 3.0;
	private String beherrschtesElement = "Wind";

	@Override
	public double getBonus() {
		return bonus;
	}

	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Daemonenjaeger() {
		super();
		super.preis = 290;
	}

}