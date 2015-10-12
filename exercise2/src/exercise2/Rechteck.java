package exercise2;

public class Rechteck extends Figur {

	private double hoehe;
	private double breite;
	
	protected Rechteck(double hoehe, double breite){
		super(hoehe * breite);
		this.hoehe = hoehe;
		this.breite = breite;
	}

}
