package model;

import java.util.Random;

public class MegaVampire extends Vampire {

	// Attributes
	int intelligence = 130;
	int vampirePower;

	// Constructor
	public MegaVampire(String name) {
		super(name);
	}

	// Methods
	public void commandToAttack(Vampire follower, Prey p) {
		System.out.println(follower.getName() + "got chosen to attack!");
		follower.attack(p);

	}

	public void attack(Prey p) {
		Random damage = new Random();
		int attack = damage.nextInt(1);
		if (damage.nextInt(101)<=10) {
			p.takeDamage(attack*2);			
		}else {
			p.takeDamage(attack);
		}		
	}

	public void takeDamage(int damage) {
		this.energy = this.energy - damage;
		if (this.energy <= 0) {
			this.finallyDead = true;
			System.out.println("The MegaVampire is dead!");
		}
	}

	public void flee() {
		Random flee = new Random();
		int number = flee.nextInt();
		if (flee.nextInt(101)>=75) {
			System.out.println("The MegaVampire could flee!");
		}

	}

	public void dance() {

	}

}

/*
 * A MegaVampire is a vampire with the following additional / customized attributes:
 * - intelligence: The intelligence of a MegaVampire is 130.
 * - vampirePower: Indicates the number of vampires that belong to his group and thus shows the thickness of the MegaVampire.
 * 				   The maximum number is 25.
 *
 * A MegaVampire has the following additional / customized operations:
 * - commandToAttack: The MegaVampire sends one of its follower vampire into battle.
 * 					  The follower vampire attacks the Prey.
 * - attack: The MegaVampire attacks its Prey. When attacking, he deals damage of a random number between 0 and 1 points to his opponent.
 * 			 With a probability of 10% he lands a critical hit and the damage doubles.
 * - takeDamage: The MegaVampire has been hit and its life points are reduced by the damage caused by the opponent.
 * - flee: A MegaVampire has a 75% chance of escaping the fight.
 * - dance: The vampire dances and all vampires of his team have to dance automatically.
 */
