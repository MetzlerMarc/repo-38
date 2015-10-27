package de.hsma.tpe.g38.main.exercise3.wesen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.wesen.Untoter;

public class Lich extends Untoter implements Anfuehrer {

	private final double bonus = 2.3;
	private final double preis = 140;
	private String beherrschtesElement;
	
	
	public Lich() {
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
