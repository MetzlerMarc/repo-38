package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

public class Squad {

	private List<Wesen> wesen;
	private String name;

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

	public void addWesen(Wesen wesen) {
		this.wesen.add(wesen);
	}

	public void deleteWesen(Wesen wesen) {
		this.wesen.remove(wesen);
	}

	public boolean isDead() {

		if (wesen.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Wesen getRandomWesen() {
		Random random = new Random();

		int nummerWesen = random.nextInt(wesen.size());
		return wesen.get(nummerWesen);
	}

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