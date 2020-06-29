package model;

import java.util.Random;
import java.util.UUID;

public class Prey {

	// Attributes
	private String id = UUID.randomUUID().toString();
	String type;
	int intelligence = new Random().nextInt(81);;
	int healthPointsCurrent = 10;
	boolean alive = true;

	// Methods
	public void defend(Vampire v) {
		Random defend = new Random();
		int number = defend.nextInt();
		if (defend.nextInt(101)>=25) {
			//this.v.attack(p) = null;
			System.out.println("The Prey succesfully defended the attack!");
		}
	}

	public void takeDamage(int damage) {
		this.healthPointsCurrent = this.healthPointsCurrent - damage;
		System.out.println("The Prey got attacked and lost" + damage + " HP!");
		System.out.println("The current HP is: " + healthPointsCurrent);
		if (this.healthPointsCurrent <= 0) {
			this.alive = false;
			System.out.println("The Prey is dead!");
		}
	}

	public void flee() {
		Random flee = new Random();
		int number = flee.nextInt();
		if (flee.nextInt(101)>=20) {
			System.out.println("The Prey could flee!");
		}
	}

	// Getter & Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealthPointsCurrent() {
		return healthPointsCurrent;
	}

	public void setHealthPointsCurrent(int healthPointsCurrent) {
		this.healthPointsCurrent = healthPointsCurrent;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}

/*
The Prey has the following attributes:
 * - id: A unique ID
 * - type: type of prey (wolf, rat, spider etc., come up with something and note that humans have their own class)
 * - intelligence: The preys intellect is a random number between 0 and 80.
 * - healthPointsCurrent: An opponent always has 10 life points at the beginning, if he is damaged, the life points are reduced.
 * - If the life points <= 0 points, the opponent dies.
 * - alive: Indicates whether the prey is alive.
 *
 * The Prey has the following operations:
 * - defend: With a probability of 25%, the prey can fend off a vampire attack.
 * - takeDamage: The prey was injured and his life points are reduced by the number of damage the vampire has caused.
 * - flee: There is a 20% chance of the enemy fleeing.
 */
