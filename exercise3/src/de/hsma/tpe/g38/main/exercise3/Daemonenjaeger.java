package de.hsma.tpe.g38.main.exercise3;

public class Daemonenjaeger extends Nachtelf implements Anfuehrer {

	private double bonus = 3.0;
	private int preis = 290;
	private String beherrschtesElement = "Wind";

	public int getPreis() {
		return preis;
	}

	public double getBonus() {
		return bonus;
	}

	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	public Daemonenjaeger() {

		super();
	}
}
