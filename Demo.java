package com.quest;

public class Demo {

	public static void main(String[] args) {

		Dragon drugon = new Dragon("drugon", 8, 200);
		System.out.println(drugon.getName());
		drugon.makeSound();
		SuperMan clarck = new SuperMan("clarck", 90);
		clarck.decreaseSpeed(8);
		System.out.println(clarck.getSpeed());
		clarck.increaseSpeed(5);
		System.out.println(clarck.getSpeed());
		Gun shutGun = new Gun(50, clarck, 90);
		shutGun.addBullets(3);
		System.out.println(shutGun.getBullets());
		shutGun.shoot();
		System.out.println(shutGun.getBullets());
		Weapon w = new Gun(30, clarck, 70);
		Zombie frank = new Zombie("frank", "28.1.19");
		System.out.println(frank.getDeathDate());

		Knight jime = new Knight("jimme", shutGun);
		Knife k = new Knife(9, jime, 100);
		jime.setW(k);
		System.out.println(jime.getW());
		jime.useWeapon();
		Horse pony = new Horse("pony", 3, 30);
		pony.makeSound();
		pony.getName();
		pony.increaseSpeed(3);
		System.out.println(pony.getSpeed());
		pony.decreaseSpeed(4);
		System.out.println(pony.getSpeed());

	}

}
