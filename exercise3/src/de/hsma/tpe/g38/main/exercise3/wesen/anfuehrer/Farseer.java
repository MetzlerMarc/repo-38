package de.hsma.tpe.g38.main.exercise3.wesen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.wesen.Ork;

public class Farseer extends Ork implements Anfuehrer {
	
	private final double bonus = 1.2;
	private final double preis = 300.0;
	private String beherrschtesElement;

	public Farseer() {
	    super();
	    super.preis = preis;
	}

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public String getBeherrschtesElement() {
        return beherrschtesElement;
    }
}
