# vampire
project from school

Instructions for the following tasks: 
	 * - You can add further attributes and methods (in addition to the defined ones) in the required classes 
	 * - The list of classes to be created is not exhaustive, which means that you can create further classes (as you need this) for your project 
	 * - you will receive an initial solution provided for you to orientate yourself 
	 * - Test your code step by step. Make it your goal to always have executable code. Do one step at a time, not all at once. 
	 * - Remember that user input can also be incorrect. 
	 * - The task is a console game. Make sure that the statements on the console are meaningful for you and possible other players and show what is happening.
	 * - Be creative! You should implement the required functionality, but how you decorate it and design it in detail is up to you.
	 * - Have fun playing!!!
	 * 
	 * 
	 * Task 1: Data types  
	 * Vampire data type
	 * Create a new data type vampire with the attributes and operations mentioned. 
	 * Create the id in the class as an attribute as follows: private String id = UUID.randomUUID (). ToString ();
	 * a) Create additional getters and setters for the attributes. b) Create a constructor. You should be able to set the name of the vampire in the constructor.
	 * 
	 * MegaVampire data type
	 * Create a new MegaVampire data type that inherits from the vampire data type.
	 * a) Add the attributes / operations that apply only to the MegaVampire and adjust them accordingly.
	 * 
	 * Prey, HumanPrey and VanHelsing data types
	 * Proceed analogously to the definition of vampire and megavampire.
	 * 
	 * Task 2: Create demo data
	 * Create a class DemoData with the method createDemoData, in which you at least create yourself as a MegaVampire and create 3 vampires that are your followers.
	 * 
	 * Task 3: console interaction
	 * Develop the following standard console dialog for the game (e.g. using the scanner class for user input and the console output).
	 * (1) You can create exactly one MegaVampire. Think about which attributes you can already set when creating. 
	 * 	   Possibly. you have to reconcile this with your class. Make sure that the console dialog with the player is meaningful.
	 * (2) If this menu item is selected, 3 random vampire should be generated, which will then form your team.
	 * 	   You can only run this option if you don't have vampire followers yet. 
	 * (3) If this menu item is selected, the attributes name, intelligence, hunger, bloodDrunk and vampirePower should be displayed on the console.
	 * 	   To do this, think of a clear and meaningful representation of how you output the data on the console.
	 * (4) If this menu item is selected, an overview (similar to 3) should be displayed for all of your vampire followers. 
	 *     Note the attributes of the vampire followers.
	 * (5) This menu item starts the Expedition through the night. (see task 4) 
	 * (6) This menu item ends the game
	 * 
	 * 
	 * Task 4: roam the night
	 * When the menu item (5) is selected, you start an expedition through the night as a MegaVampire. 
	 * To do this, implement the expedition console dialog: (1) Explore, (2) Dance, (3) End Expedition
	 * (1) Explore: There is a 80% chance you will encounter prey with your vampire group. With a probability of 20% it is a human being and with 80% it is another prey. 
	 * 				There is a 20% chance of encountering VanHelsing. (Realize the console dialog Action)
	 * (2) Dance: Select who should dance from your group. 
	 * (3) End expedition: The menu item leads back to the selection menu.
	 * 
	 * Explanation of menu item (1) Explore: There are two different scenarios that can now occur:
	 * (1) You encounter a prey. In this case, the MegaVampire can attack by itself or send one of its vampire followers to overwhelm the prey.
	 * The attacker attacks until the prey is dead. Before each attack by the attacker, the prey can try to escape. If the prey flees, further exploration is required. 
	 * When the prey is dead, the MegaVampire decides who gets to drink the blood (note the preys intellect). 
	 * (2) You meet VanHelsing. VanHelsing attacks you. You cannot attempt to escape in the first round. 
	 * You can send a follower vampire into battle for yourself. When the vampire follower is done (finallyDead), VanHelsing has a 30% chance to attack again.
	 * From the second round, you can choose to send a vampire again or try to escape. If VanHelsing kills the MegaVampire, the game is over and the MegaVampire is wiped out.
	 * To do this, implement the following console dialog:
	 * Action (similar to the other menus) Select vampire for the fight
	 * (1) Try to escape (only available from the second round)
	 * If the preys blood has been drunk or the MegaVampire has successfully escaped, you will end up again at the console dialog Expedition. 
