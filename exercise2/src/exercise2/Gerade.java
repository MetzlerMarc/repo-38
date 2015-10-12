package exercise2;

public class Gerade extends Figur {
	
	/*
	 * die Variabl ist durch die Klassifizierung 'private' nur für diese Klasse sichtbar
	 */
	private double laenge;
	
	/*
	 * Erstellt eine Gerade mit der angegebenen Länge und multipliziert mit 0, da keine Fläche vorhanden ist.
	 */
	protected Gerade(double laenge) {
		super(laenge * 0);		
	}
	
}
