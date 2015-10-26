package de.hsma.tpe.g38.main.exercise3;

public class Lich extends Untoter implements Anfuehrer {

	private double bonus = 2.3;
	private int preis = 140;
	private String beherrschtesElement = "Erde";

	public int getPreis() {
		return preis;
	}

	public double getBonus() {
		return bonus;
	}

	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Lich() {

		super();
	}
}
