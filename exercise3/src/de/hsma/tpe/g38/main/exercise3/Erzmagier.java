package de.hsma.tpe.g38.main.exercise3;

public class Erzmagier extends Mensch implements Anfuehrer {

	private double bonus = 5.0;
	private int preis = 220;
	private String beherrschtesElement = "Wasser";

	public int getPreis() {
		return preis;
	}

	public double getBonus() {
		return bonus;
	}

	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Erzmagier() {

		super();
	}

}
