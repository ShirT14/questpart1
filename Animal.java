package com.quest;

public abstract class Animal {

	protected final String name;
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public abstract void makeSound();

}
