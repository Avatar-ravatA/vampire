package app;

import java.util.Scanner;
import java.util.Set;

import model.Vampire;

/**
 * @author pete
 *
 */
public class VampireApp {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args mainklasse
	 */
	public static void main(String[] args) {

		while (true) {
			showMenu();
			int choice = readUserInput();
			handle(choice);
			System.out.println("\n\n====================");
		}
	}

	/**
	 * 
	 * @return
	 */
	private static int readUserInput() {
		System.out.print("\nPlease choose a number from the menu entry:\t");
		int choiceInternal = scanner.nextInt();

		return choiceInternal;
	}

	/**
	 * 
	 * @param choice
	 */
	private static void handle(int choice) {
		switch (choice) {
		case 1:
			System.out.println("You chose the number 1.");
			createMegaVampire();
			break;
		case 2:
			System.out.println("You chose the number 2.");
			break;
		case 3:
			System.out.println("You chose the number 3.");
			break;
		case 4:
			System.out.println("You chose the number 4.");
			break;
		case 5:
			System.out.println("You chose the number 5.");

			break;
		case 6:
			System.out.println("You chose the number 6.");
			break;
		default: {
			System.out.println("Invalid entry. Please check your input.");
			showMenu();
		}
			break;

		}
	}

	/**
	 * 
	 */
	private static void showMenu() {
		
		String menuItems[] = { "", "(1)\t Create MegaVampire", "(2)\t Generate three Vampire-Followers",
				"(3)\t Show data of MegaVampire", "(4)\t Show data of all Vampire-Followers",
				"(5)\t Roam the night", "(6)\t End Game" };

		System.out.println("\nVampire Version 1.0\n");
		for (int i = 1; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}

	}

	private static void createMegaVampire() {
		System.out.println(
				"\nUnfortunately, your method got no code. You can surely comprehend how the procedure works. You should create a MegeVampire here.\n");
	}

}
