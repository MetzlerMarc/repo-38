package exercise2;

public class Dreieck extends Figur {
	protected double hoehe;
	protected double grundseite;
	
	protected Dreieck(double hoehe, double grundseite){
		super(hoehe * grundseite * 0.5);
		this.hoehe = hoehe;
		this.grundseite = grundseite;
	}
}
