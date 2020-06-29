package model;

import java.util.Random;
import java.util.UUID;

public class Vampire {

	// Attributes
	private String id = UUID.randomUUID().toString();
	String name;
	int intelligence = new Random().nextInt(11);
	int hunger = 0;
	int bloodDrunk = 0;
	boolean inFight = false;
	int energy = 10;
	boolean finallyDead = false;

	// Constructor
	public Vampire(String name) {
		this.name = name;
	}

	// Methods
	public void attack(Prey p) {
		Random damage = new Random();
		int attack = damage.nextInt(6);
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
			System.out.println("The Vampire is dead!");
		}
	}

	public void drink() {
		bloodDrunk++;
		hunger = 0;
	}

	public void dance() {
		System.out.println("The Vampire is dancing");
		Random text = new Random();
		int bodyparts = text.nextInt();
		//random bodyparts
		System.out.println();

	}

	// Getter & Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getBrainsEaten() {
		return bloodDrunk;
	}

	public void setBrainsEaten(int brainsEaten) {
		this.bloodDrunk = brainsEaten;
	}

	public boolean isInFight() {
		return inFight;
	}

	public void setInFight(boolean inFight) {
		this.inFight = inFight;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFinallyDead() {
		return finallyDead;
	}

	public void setFinallyDead(boolean finallyDead) {
		this.finallyDead = finallyDead;
	}

}

/*
 * A vampire has the following attributes:
 * - id: A unique ID
 * - name: name of the vampire
 * - intelligence: random value between 0 and 10
 * - hunger: When the MegaVampire has eaten, the hunger is 0, but it is explored every round (see task Wandering through the night) it rises by 1. 
 * 			 When it reaches 15, the vampire goes mad.
 * 			 The probability that his behavior will cause a MegaVampire in the next round of exploration is set to 100% (see task Wandering through the night).
 * - bloodDrunk: The number indicates how often the vampire drunk blood in its existence.
 * - inFight: The attribute indicates whether the vampire is in combat
 * - energy: The attribute indicates how many life points the Vampire has. The default is 10.
 * - finallyDead: If this attribute is true, then the vampire is irretrievably dead.
 *
 * A vampire has the following operations:
 * - attack: the vampire attacks its prey. When attacking, he deals damage of a random number between 0 and 5 points to his opponent.
 * 			 With a probability of 10% he lands a critical hit and the damage doubles.
 * - takeDamage: The vampire has been hit and its life points are reduced by the damage caused by the opponent.
 * - drink: The vampire drinks the blood of his prey. His hunger is set to 0, drunkBlood is increased by 1.
 * - dance: The vampire is dancing. Sometimes a part of the body falls off and he has to collect it again after dancing
 *
 */
