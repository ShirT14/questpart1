package com.quest;

public class Gun extends Weapon {
	private int bullets;

	public Gun(int strength, Person owner, int bullets) {
		super(strength, owner);
		this.bullets = bullets;

	}

	public void addBullets(int b) {

		this.bullets = this.bullets + b;

	}

	public void shoot() {

		this.bullets = this.bullets - 1;
	}

	public int getBullets() {
		return bullets;
	}

}
