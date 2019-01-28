package com.quest;

public abstract class Weapon {
	
	protected final int STRENGTH;// (0-100)

	protected Person owner;
	
	
	public Weapon( int strength, Person owner) {
		super();
		if(strength>=0||strength<101) {
	this.STRENGTH = strength;
		}
		else
		{
			STRENGTH=0;
		}
		this.owner = owner;
	
	}
	
	


	

	public int getStrength() {
		return STRENGTH;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
