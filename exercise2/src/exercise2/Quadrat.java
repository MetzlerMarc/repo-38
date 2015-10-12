package exercise2;

public class Quadrat extends Rechteck {

	private double seite;
	
	protected Quadrat(double seite){
		
		super(seite, seite);
		this.seite = seite;
	}
}