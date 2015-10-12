package exercise2;

public class Quadrat extends Rechteck {

	/*
	 * die Variabl ist durch die Klassifizierung 'private' nur für diese Klasse sichtbar
	 */
	private double seite;
	
	/*
	 * Erstellt ein Quadrat mit einer angegebenen Seitenlänge und errechnet die Fläche daraus
	 */
	protected Quadrat(double seite){
		
		super(seite, seite);
		this.seite = seite;
	}
}