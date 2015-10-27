package de.hsma.tpe.g38.main.exercise3.wesen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.wesen.Mensch;

public class Erzmagier extends Mensch implements Anfuehrer {

	private final double bonus = 5.0;
	private final double preis = 220.0;
	private String beherrschtesElement;
	
	
	
	public Erzmagier() {
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

