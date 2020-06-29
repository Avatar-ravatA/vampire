package model;

import java.util.Random;

public class HumanPrey extends Prey {

	// Attribute
	int intelligence  = new Random(70).nextInt(140);;

	// Methode
	public void flee() {
		Random flee = new Random();
		int number = flee.nextInt();
		if (flee.nextInt(101)>=40) {
			System.out.println("The HumanPrey could flee!");
		}
	}

	// Getter & Setter
	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

}

/*
 *The HumanPrey is a Prey and has the following additional / adapted attributes:
 * - intelligence: The victim's intellect is a random number between 70 and 140.
 *
 * 
 * The HumanPrey has the following operations:
 * - flee: There is a 40% chance of the enemy fleeing. 
 *
 */