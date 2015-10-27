package de.hsma.tpe.g38.main.exercise3.wesen.anfuehrer;

import de.hsma.tpe.g38.main.exercise3.wesen.Nachtelf;

public class Daemonenjaeger extends Nachtelf implements Anfuehrer {

	private final double bonus = 3.0;
	private final double preis = 290.0;
	private String beherrschtesElement;

	public Daemonenjaeger() {
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
