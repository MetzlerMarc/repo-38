package de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.rassen.Mensch;

public class Erzmagier extends Mensch implements Anfuehrer {

	private double bonus = 5.0;
	private String beherrschtesElement = "Wasser";

	@Override
	public int getPreis() {
		return preis;
	}

	@Override
	public double getBonus() {
		return bonus;
	}

	@Override
	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Erzmagier() {
		super();
		super.preis = 220;
	}

}
