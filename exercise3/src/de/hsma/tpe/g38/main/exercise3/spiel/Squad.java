package de.hsma.tpe.g38.main.exercise3.spiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import de.hsma.tpe.g38.main.exercise3.rassen.Wesen;
import de.hsma.tpe.g38.main.exercise3.rassen.anfuehrer.Anfuehrer;

public final class Squad {

	private static final Scanner scanner = Scan.getInstance();

	private String name;
	private List<Wesen> wesen;

	public String getName() {
		return name;
	}

	public List<Wesen> getWesen() {
		return wesen;
	}

	public Squad() {

		super();
		System.out.println("Dein Squadname lautet: ");

		this.name = scanner.nextLine();

		wesen = new ArrayList<Wesen>();
	}

	public Squad(final String squadname) {
		this(squadname, new ArrayList<Wesen>());
	}

	public Squad(final String squadname, final List<Wesen> wesen) {

		super();

		if (squadname == null) {
			throw new IllegalArgumentException("Squadname must not be null.");
		}

		if (wesen == null) {
			throw new IllegalArgumentException("List must not be null.");
		}

		this.name = squadname;
		this.wesen = wesen;
	}

	public void addWesen(Wesen wesen) {
		this.wesen.add(wesen);
	}

	public void removeWesen(Wesen wesen) {
		this.wesen.remove(wesen);
	}

	public boolean hasWesen() {

		if (wesen.size() == 0) {
			return false;
		}

		return true;
	}

	public Wesen getRandomWesen() {

		int nummer = new Random().nextInt(wesen.size());

		return wesen.get(nummer);
	}

	public boolean exists(Anfuehrer anfuehrer) {

		if (containsInstance(wesen, anfuehrer.getClass())) {
			return true;
		}

		return false;
	}

	private <E> boolean containsInstance(List<Wesen> list, Class<? extends Anfuehrer> clazz) {

		for (Wesen e : list) {
			if (clazz.isInstance(e)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {

		int durchlauf = 1;

		System.out.println("Name: " + name + "\n-------------------\n");
		for (Wesen wesenInList : wesen) {
			System.out.println(durchlauf + ". " + wesenInList.getClass().getSimpleName() + "\n");
			durchlauf++;
		}
		return toString();
	}

}
