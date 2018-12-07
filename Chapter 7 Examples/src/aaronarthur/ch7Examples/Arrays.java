package aaronarthur.ch7Examples;

public class Arrays {

	public static void main(String[] args) {
		
		String[] gameList = {"League of Legends",
				"Dominion",
				"Super Mario Odyssey",
				"Minecraft",
				"Crypt of the Necrodancer",
				"I wanna run the marathon",
				"Hollow Knight",
				"Dragon Ball FigherZ",
				"D&D",
				"Undertale"};
		
		// First 3
		for (int i = 0; i < 3; i++) {
			System.out.println(gameList[i]);
		}
		
		System.out.println("");
		
		// Last 3
		for (int i = 7; i < 10; i++) {
			System.out.println(gameList[i]);
		}
		
		System.out.println("");
		// Middle 5
		for (int i = 3; i < 8; i++) {
			System.out.println(gameList[i]);
		}
		
		
	}

}
