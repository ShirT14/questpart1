package com.quest;

public class Knight extends Person {

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	private Weapon w;

	public Knight(String name, Weapon w) {
		super(name);
		this.w = w;
		// TODO Auto-generated constructor stub
	}

	public void useWeapon() {
		System.out.println("im using weapon");
	}

}
