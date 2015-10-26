package de.hsma.tpe.g38.main.exercise3;

public class Erzmagier extends Mensch implements Anfuehrer {

	private double bonus = 5.0;
	private int preis = 220;
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

	
	public Erzmagier(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
	}

}
