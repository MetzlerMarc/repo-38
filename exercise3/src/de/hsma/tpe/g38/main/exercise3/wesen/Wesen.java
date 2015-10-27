package de.hsma.tpe.g38.main.exercise3.wesen;

import de.hsma.tpe.g38.main.exercise3.wesen.anfuehrer.Anfuehrer;

public abstract class Wesen {

	protected double leben;
	protected final double schaden;
	protected final double geschwindigkeit;
	protected final double ruestung;
	protected double preis;

	public double getLeben() {
	    return leben;
	}
	
	public double getSchaden() {
        return schaden;
    }
	
	public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

	public double getRuestung() {
        return ruestung;
    }
	
	public double getpreis() {
        return preis;
    }
	
	protected Wesen(double leben, double schaden, double geschwindigkeit, double ruestung, double preis) {
		super();
	    this.leben = leben;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
		this.preis = preis;
	}
	
	public double getBonus() {

        double bonus = 1.0;

        if (this instanceof Anfuehrer) {
            bonus = ((Anfuehrer) this).getBonus();
        }

        return bonus;
    }

	/*
 * attack-Methode
 */
	public double attack(final Wesen wesen) {

        double damage = geschwindigkeit * schaden * getBonus();
        damage = damage - (damage * (ruestung / 100));

        wesen.leben = wesen.leben - damage;

        return damage;
    }

/*
 * Methode zur Überprüfung der Lebendigkeit des Wesens.
 */
	public boolean isLebendig() {
		
	    if (leben > 0) {
			return true;
	    } else {
	        return false;
	    }
	    
	}
	
	
	/*
	 * Ueberschreiben der toString-Methode
	 */
	@Override
	public String toString() {
	    StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getSimpleName() + "\n");
        sb.append("Lebenspunkte: \t\t" + leben + "\n");
        sb.append("Schaden: \t\t" + schaden + "\n");
        sb.append("Geschwindigkeit: \t" + geschwindigkeit + "\n");
        sb.append("Ruestung: \t\t" + ruestung + "\n");

        return sb.toString();
	    
	}
}
