package com.quest;

public class Zombie extends Person {

	private final String deathDate;

	public Zombie(String name, String deathDate) {
		super(name);
		this.deathDate = deathDate;

	}

	public String getDeathDate() {
		return deathDate;
	}

}
