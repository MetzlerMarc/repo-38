package exercise2;

public class Quadrat extends Figur {

	protected double seite;
	
	protected Quadrat(double seite){
		super(seite * seite);
		this.seite = seite;
	}
}