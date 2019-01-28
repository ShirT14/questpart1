package com.quest;

public class Horse extends Animal {
	private int speed;

	public Horse(String name, int age, int speed) {
		super(name, age);
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int v) {

		this.speed += v;
	}

	public void decreaseSpeed(int v) {
		this.speed -= v;
	}

	public String getName() {
		return super.getName();
	}

	@Override
	public void makeSound() {
		System.out.println("im a horse");

	}

}
