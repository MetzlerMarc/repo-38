package exercise2;

public class Dreieck extends Figur {
	private double hoehe;
	private double grundseite;
	
	protected Dreieck(double hoehe, double grundseite){
		super(hoehe * grundseite * 0.5);
		this.hoehe = hoehe;
		this.grundseite = grundseite;
	}
}
