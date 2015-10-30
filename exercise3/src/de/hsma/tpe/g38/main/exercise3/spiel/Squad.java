package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

/**
 * Das ist die Klasse Squad. Sie verfügt über die Liste der im Squad enthaltenen
 * Wesen. Die Liste wird als Array dargestellt.
 * 
 * @author Simon Karl und Christopher Troy
 */

public class Squad {

	private List<Wesen> wesen;
	private String name;

	/**
	 * Getter zur Abfrage des Array-Elements des Wesens und des Namens.
	 */

	public List<Wesen> getWesen() {
		return this.wesen;
	}

	public String getName() {
		return this.name;
	}

	public Squad(String name) {
		this.name = name;
		wesen = new ArrayList<Wesen>();
	}

	/**
	 * Fügt Wesen hinzu.
	 */

	public void addWesen(Wesen wesen) {
		this.wesen.add(wesen);
	}

	/**
	 * Löscht Wesen.
	 */

	public void deleteWesen(Wesen wesen) {
		this.wesen.remove(wesen);
	}

	/**
	 * Fragt ab, ob alle Wesen aus Liste tot sind.
	 */

	public boolean isDead() {

		if (wesen.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Wählt zufälliges Wesen und gibt die Stelle im Array zurück.
	 */

	public Wesen getRandomWesen() {
		Random random = new Random();

		int nummerWesen = random.nextInt(wesen.size());
		return wesen.get(nummerWesen);
	}

	/**
	 * Prüft, ob bereits ein Anführer im Team ist.
	 */

	public boolean isAnfuehrerInSquad(Wesen wesen) {
		if (wesen instanceof Anfuehrer) {
			for (Wesen w : this.wesen) {
				if (w.getClass() == wesen.getClass()) {
					return true;
				}
			}
		}
		return false;

	}
}