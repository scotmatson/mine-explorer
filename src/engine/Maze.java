/*
*	Text Based Adventure Game		*
*	Developed by Scot Matson		*
*	Version: 1.0 - 04/25/2013		*
*/



package engine;

import java.util.Scanner;

public class Maze {
	public static void main(String[] args) {
		playGame();
	}
	
	// Accepts user input to begin playing game
	public static void playGame() {
		Scanner keyBoard = new Scanner(System.in);
		char newGame;
		Messages.newGame();
		newGame = keyBoard.next().charAt(0);
		switch(newGame) {
		case 'Y':
		case 'y':
			gameStart();
			break;
		case 'N':
		case 'n':
			Messages.noGame();
			System.exit(0);
		default:
			while (newGame != 'Y' || newGame != 'y' || newGame != 'N' || newGame != 'n') {
				Messages.unknownEntry();
				playGame();
			}
		}
		keyBoard.close();
	}
	//	If user chooses to play game, will be prompted to select character name
	public static void gameStart() {
		Scanner keyBoard = new Scanner(System.in);
		String charName;
		System.out.print("Name your adventurer!\n>> ");
		// Unable to get default constructor to work with nextLine(). Using next() to force input.
		charName = keyBoard.nextLine();
		Character player = new Character(charName);
		System.out.println("Good luck, " + player.getName() + "!\n");
		// Sends user into the mine
		Rooms.entrySlope();
		keyBoard.close();
	}
}