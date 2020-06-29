package model;

public class DemoData {

	public void createDemoData() {

		MegaVampire Alucard = new MegaVampire("Alucard");
		Vampire follower1 = new Vampire("Vampire_1");
		Vampire follower2 = new Vampire("Vampire_2");
		Vampire follower3 = new Vampire("Vampire_3");

		Vampire[] vampireTeam = new Vampire[4];
		vampireTeam[0] = Alucard;
		vampireTeam[1] = follower1;
		vampireTeam[2] = follower2;
		vampireTeam[3] = follower3;

		for (int i = 0; i < vampireTeam.length; i++) {
			if (vampireTeam[i] != null) {
				System.out.println(vampireTeam[i].getName());
			}
		}
	}

}
