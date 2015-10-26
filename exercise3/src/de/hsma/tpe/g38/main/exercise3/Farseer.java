package de.hsma.tpe.g38.main.exercise3;

public class Farseer extends Ork implements Anfuehrer {

	private double bonus = 1.2;
	private int preis = 300;
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

	
	public Farseer(double leben, double schaden, double geschwindigkeit, double ruestung) {

		super(leben, schaden, geschwindigkeit, ruestung);
	}
}
