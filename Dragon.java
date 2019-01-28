package com.quest;

public class Dragon extends Animal {
	private int hight;

	public Dragon(String name, int age, int hight) {
		super(name, age);
		this.hight = hight;

	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	@Override
	public void makeSound() {
		System.out.println("fire fire fire");

	}

}
