package com.quest;

public class SuperMan extends Person {
	private int speed;

	public SuperMan(String name, int speed) {
		super(name);
		this.speed = speed;

	}

	public void increaseSpeed(int speed) {
		this.speed+=speed;
	}

	public void decreaseSpeed(int speed) {
		this.speed=-speed;
	}

	public int getSpeed() {
		return speed;
	}

}
