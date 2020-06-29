package model;

import java.util.Random;
import java.util.UUID;

public class VanHelsing {

	// Attribute
	private String id = UUID.randomUUID().toString();
	String name;
	int experiencePoints;
	int healthPointsCurrent = 1000;
	boolean alive = true;

	// Methode
	public void attack(Vampire v) {
		Random damage = new Random();
		int attack = damage.nextInt();
		if (damage.nextInt(101)<=50) {
			v.takeDamage(attack);			
		}else {
			v.takeDamage(0);
		}	
	}

	public void takeDamage(int damage) {
		this.healthPointsCurrent = this.healthPointsCurrent - damage;
		System.out.println("VanHelsing got attacked! He lost " + damage + "HP!");
		if (this.healthPointsCurrent <= 0) {
			this.alive = false;
			System.out.println("VanHelsing is dead!");
		}
	}

	public void flee() {
		System.out.println("VanHelsing does not flee!");
	}

	public boolean alive() {
		if (this.healthPointsCurrent == 0) {
			this.alive = false;
			System.out.println("VanHelsing is dead");
		} else {
			return alive;
		}
		return alive;
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

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public int getHealthPointsCurrent() {
		return healthPointsCurrent;
	}

	public void setHealthPointsCurrent(int healthPointsCurrent) {
		this.healthPointsCurrent = healthPointsCurrent;
	}

}

/*
 * VanHelsing has three attributes:
 * - id: A unique ID
 * - name: name of VanHelsing
 * - experiencePoints: An integer value that indicates how many vampires VanHelsing has already killed.
 * - healthPointsCurrent: VanHelsing is a supernatural being and initially has 1000 life points.
 *
 * VanHelsing has the following operations:
 * attack: VanHelsing attacks with a super power. It hits with a 50% chance and deals 5 damage if hit.
 * takeDamage: VanHelsing has been hit and its life points are reduced by the number of damage the vampire has caused.
 * flee: VanHelsing never flees!
 * alive: The attribute indicates whether VanHelsing is still alive. If the healthpointsCurrent <= 0 points, VanHelsing is dead.
 * 
 */

