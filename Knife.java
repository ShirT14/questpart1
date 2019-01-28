package com.quest;

public class Knife extends Weapon {
	private final int sharpness;// 0-10

	public Knife(int strength, Person owner, int sharpness) {
		super(strength, owner);

		if (sharpness >= 0 && sharpness < 11) {
			this.sharpness = sharpness;
		} else {
			this.sharpness = 0;
		}
	}

	public int getSharpness() {
		return sharpness;
	}

}
