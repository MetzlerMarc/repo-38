package de.hsma.tpe.g38.main.exercise3;

public class Daemonenjaeger extends Nachtelf implements Anfuehrer {

	private double bonus = 3.0;
	private int preis = 290;
	private String beherrschtesElement = "Zauberstab";

	
	public int getPreis() {
		return preis;
	}

	public double getBonus() {
		return bonus;
	}

	public String getBeherrschtesElement() {
		return beherrschtesElement;
	}

	
	public Daemonenjaeger(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
	}
}
