package engine;

// TODO Implement randomizer to present user with various lines of text based upon their actions.
public class Messages {
	public static void newGame() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@**MINE*EXPLORER**@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@//=========\\\\@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@////#########\\\\\\@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@||#############||@@@@@@@@@@");
		System.out.println("@@@@@@@@@@||######'######||@@@@@@@@@@");
		System.out.println("@@@@@@@@@@||####'''''####||@@@@@@@@@@");
		System.out.println("@@@@@@@@@@||##'''''''''##||@@@@@@@@@@");
		System.out.println("@@@@@@@@@@||#'''''''''''#||@@@@@@@@@@");
		System.out.println("@@@@@@@@@@|_______________|@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\nNew Game? (Y)es to play, (N)o to quit.");
		System.out.print(">> ");
	}
	public static void noGame() {
		System.out.println("Too bad, maybe next time.");
	}
	public static void unknownEntry() {
		System.out.println("Invalid selection, please try again.\n");
	}
	public static void noExit() {
		System.out.println("You can't go that way!");
	}
}
