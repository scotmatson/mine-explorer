package engine;

import java.util.Scanner;

public class Rooms {
	public static void tramwayWest() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [0][0]
		System.out.println("\n[Collapsed Mine - Western Tramway]");
		System.out.println("A system of arial tramways supported by guy wires have all but collapsed under the");
		System.out.println("weakened infrastructure of this chamber while the rail lines appear to be heavily");
		System.out.println("damaged. Multiple dig sites beneath the underground transport system have now become");
		System.out.println("a stratification of earth, mineral, and flesh. The silence feels unbearable.");
		System.out.println("\nObvious paths: (e)ast, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			tramwayWest();
			break;
		case 'E':
		case 'e':
			railTrestle();
			break;
		case 'S':
		case 's':
			railFork();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			tramwayWest();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			tramwayWest();
			break;
			}
		}
		keyBoard.close();
	}

	public static void railTrestle() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [0][1]
		System.out.println("\n[Collapsed Mine - Steel Trestle]");
		System.out.println("Leaping high above this chasm mounted upon the crest of two opposing ridges,");
		System.out.println("this arial masterpiece has proven itself to be of sound craftsmanship.");
		System.out.println("The surrounding panaroma portrays nothing but devastation shrouded by the");
		System.out.println("abscence of light.");
		System.out.println("\nObvious paths: (e)ast, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			railTrestle();
			break;
		case 'E':
		case 'e':
			tramwayEast();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			railTrestle();
			break;
		case 'W':
		case 'w':
			tramwayWest();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			railTrestle();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void tramwayEast() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [0][2]
		System.out.println("\n[Collapsed Mine - Eastern Tramway]");
		System.out.println("The darkness stays by your side as you step lightly across uncertain terrain.");
		System.out.println("Following your hands along the perimiter provides little reassurance while you");
		System.out.println("attempt to create a mental image of this room. Quickly locating possible routes of");
		System.out.println("travel, you cease any further efforts to map this chamber.");
		System.out.println("\nObvious paths: (s)outh, (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			tramwayEast();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			tramwayEast();
			break;
		case 'S':
		case 's':
			blastSite();
			break;
		case 'W':
		case 'w':
			railTrestle();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			tramwayEast();
			break;
			}
		}
		keyBoard.close();
	}
	
	// This is a trapped room. Reaching this room will kill the player and prompt them for a new game.
	public static void northernDig() {
		Scanner keyBoard = new Scanner(System.in);
		char newGame;
		// mapGrid [0][3]
		System.out.println("\n[Collapsed Mine - Northern Blast Expansion]");
		System.out.println("Having not yet installed the reinforced steel pillars, the mine-induced");
		System.out.println("seismicity seems to have been incapable of supporting your explorations.");
		System.out.println("As you merrily carry-on your way an enourmous kettle bottom decides to inconveniently");
		System.out.println("relocate to your position, crushing you in the process.");
//		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.println("\nYou Are Dead. Play again? (Y)es or (N)o.");
		System.out.print(">> ");
		newGame = keyBoard.next().charAt(0);
		switch (newGame) {
		case 'Y':
		case 'y':
			Maze.gameStart();
			break;
		case 'N':
		case 'n':
			Messages.noGame();
			System.exit(0);
		default:
			while (newGame != 'Y' || newGame != 'y' || newGame != 'N' || newGame != 'n') {
				Messages.unknownEntry();
				northernDig();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void dryRoom() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [0][4]
		System.out.println("\n[Antechamber - Dry Room]");
		System.out.println("The arid smell of death escapes the passages of your nasal cavities as you");
		System.out.println("find yourself standing amidst a collection of coveralls and miners lamps");
		System.out.println("located at the mouth this tomb. For those foolish enough to plunder the");
		System.out.println("riches which lie beneath the earth, a price in blood serves as payment.");
		System.out.println("\nObvious paths: (e)ast, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			dryRoom();
			break;
		case 'E':
		case 'e':
			easternPortal();
			break;
		case 'S':
		case 's':
			conveyorNorth();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			dryRoom();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			dryRoom();
			break;
			}
		}
		keyBoard.close();
	}
	
	// This is the final room in the Maze. Reaching this will end the game.
	public static void easternPortal() {
		// mapGrid [0][5]
		System.out.println("\n[Western Planes - Drift Mine]");
		System.out.println("Daylight pours over the tops of the dense forest splayed beneath the");
		System.out.println("entrance to the mine. The sky has finally revealed itself to you,");
		System.out.println("to behold a magnificant sapphire blue stratosphere. The distant sounds of");
		System.out.println("wildlife fill your ears, much to your dismay. As tears begin to stream down");
		System.out.println("your cheeks you fall to your knees and cry out in relief. You are alive.");
//		System.out.println("\nObvious paths: (w)est.");
		System.out.print("\nYou Win! Game Over.");
		System.exit(0);
	}
	
	public static void railFork() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [1][0]
		System.out.println("\n[Collapsed Mine - Rail Fork]");
		System.out.println("The brilliant display of light only becomes exacerbated as you delve further");
		System.out.println("along the recesses of this tunnel. The quartz has been joined by layers of sapphire");
		System.out.println("and pyrite creating a burst of color amongst an otherwise lifeless granite wall.");
		System.out.println("Fissures along the wall have torn open this canvas, small enough to crawl through");
		System.out.println("it may seem.");
		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			tramwayWest();
			break;
		case 'C':
		case 'c':
			System.out.println("\nIf you say so...");
			crawlspace();
			break;
		case 'S':
		case 's':
			railTunnel();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			railFork();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			railFork();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void crawlspace() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [1][1]
		System.out.println("\n[Collapsed Mine - Crawlspace]");
		System.out.println("The walls of this dark passage squeeze tightly around the frame of your body");
		System.out.println("as you make your way through. Having been reduced to laying flat and worming your");
		System.out.println("way along, you realize that there is no longer any chance to turn back");
		System.out.println("Anxiety sinks in as the expanse of this tunnel suddenly become more obvious.");
		System.out.println("\nObvious paths: (s)outh.");
		System.out.print(">> ");
		
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			crawlspace();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			crawlspace();
			break;
		case 'S':
		case 's':
			narrowPassage();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			crawlspace();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			crawlspace();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void blastSite() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [1][2]
		System.out.println("\n[Collapsed Mine - Blast Site]");
		System.out.println("The air becomes stifling as you venture into this room, the venilation is");
		System.out.println("nearly non-existent and an overpowering sweet odor overtakes your senses.");
		System.out.println("A crate-lined path leads you to the center of the room where light from");
		System.out.println("the east has managed to make its home. You can visably make out the letters");
		System.out.println("T.N.T. painted in bold red type-face along the surface of the crates.");
		System.out.println("\nObvious paths: (n)orth, and (e)ast.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			tramwayEast();
			break;
		case 'E':
		case 'e':
			clearing();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			blastSite();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			blastSite();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			blastSite();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void clearing() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [1][3]
		System.out.println("\n[Collapsed Mine - Clearing]");
		System.out.println("Embers from a dying fire illuminate this room and provide little comfort");
		System.out.println("from the inescapable cold and poor air quality. It appears as if a natural");
		System.out.println("cave was discovered during the excavation of this room. Stalactites stare");
		System.out.println("down ominously from the ceiling as a reminder of your mortality.");
		System.out.println("\nObvious paths: (n)orth, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			northernDig();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			clearing();
		case 'S':
		case 's':
			Messages.noExit();
			clearing();
			break;
		case 'W':
		case 'w':
			blastSite();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			clearing();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void conveyorNorth() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [1][4]
		System.out.println("\n[Processing Plant - Conveyor North]");
		System.out.println("Once refined the minerals make their way down this gathering belt");
		System.out.println("towards a working station. Here they will receive a final inspection");
		System.out.println("before being loaded into a cart and transfered to an off-site");
		System.out.println("processing plant.");
		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			dryRoom();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			conveyorNorth();
			break;
		case 'S':
		case 's':
			controlRoom();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			conveyorNorth();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			conveyorNorth();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void railTunnel() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [2][0]
		System.out.println("\n[Collapsed Mine - Rail Tunnel]");
		System.out.println("Paralell rail beams direct your descent towards a void of unknown casualty.");
		System.out.println("The only thing saving your humanity is the inbound breeze flowing through a");
		System.out.println("collection of ventilation circuits which climb up to the surface. Stray rays");
		System.out.println("of sunlight cascade through like bullet holes from the heavens");
		System.out.println("to eerily illuminate the quartz deposits sprayed into the rock face.");
		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			railFork();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			railTunnel();
			break;
		case 'S':
		case 's':
			railStation();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			railTunnel();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			railTunnel();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void narrowPassage() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [2][1]
		System.out.println("\n[Collapsed Mine - Narrow Passage]");
		System.out.println("The slope of this passage begins to swiftly descend causing the blood to rush");
		System.out.println("to your brain. Somehow you muster the will to continue on, inching your way");
		System.out.println("towards an unknown destination. As you begin to succumb to losing your sanity,");
		System.out.println("the nightmarish embrace of the rocky walls begin to give way. With renewed vigor");
		System.out.println("your efforts appear to have finally paid off when you notice a light in the distance.");
		System.out.println("\nObvious paths: (e)ast.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			narrowPassage();
			break;
		case 'E':
		case 'e':
			rockHeap();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			narrowPassage();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			narrowPassage();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			narrowPassage();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void rockHeap() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [2][2]
		System.out.println("\n[Abandoned Mine - Rock Heap]");
		System.out.println("The displaced stones at your feet give off a hollowed sound as you struggle");
		System.out.println("to steady your footing. Piles of rock and gravel have been formed from an");
		System.out.println("ongoing excavation to the west where the opening of an uncomfortably small");
		System.out.println("looking fissure is embedded into the rockface adjacent a narrow shelf.");
		System.out.println("\nObvious paths: (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			rockHeap();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			rockHeap();
			break;
		case 'S':
		case 's':
			wideLedge();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			rockHeap();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			rockHeap();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void launderChute() {
		// mapGrid [2][3]
		System.out.println("[Collapsed Mine - Launder]");
		System.out.println("The poor lighting appears to have caused you to misplace your footing upon");
		System.out.println("entering this room. As you step forward you find yourself defying gravity");
		System.out.println("as your body plunges lengthwise through a barrier of sludge which has left a large");
		System.out.println("cylindrical sink hole in the center of this room. In your last attempt to understand");
		System.out.println("the situa... \n\n***Schlllwaaoopp!!***");
//		System.out.println("\nObvious paths: (s)outh.");
		spring();
	}
	
	public static void controlRoom() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [2][4]
		System.out.println("\n[Processing Plant - Control Room]");
		System.out.println("An enclosed facility accessible by opposing reinforced doors houses an operational");
		System.out.println("control unit littered with unmarked switches and pressure gauges. A brightly");
		System.out.println("red handled panic lever is the only obvious feature. At eye level");
		System.out.println("is a narrow pane of safety glass which allows visualization of the");
		System.out.println("two-stage mineral extractor where communution and filtration take place.");
		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			conveyorNorth();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			controlRoom();
			break;
		case 'S':
		case 's':
			conveyorSouth();
			break;
		case 'W':
		case 'w':
			launderChute();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			controlRoom();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void railStation() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [3][0]
		System.out.println("\n[Collapsed Mine - Rail Station]");
		System.out.println("An interlocking plant weaves tracks about this room like the threads of a spiders");
		System.out.println("silk, redirecting any inbound carts towards one of the many entombed storage yards.");
		System.out.println("On any given day this location would serve as one of the primary modes of access");
		System.out.println("for the transport of employees and storage of equipment. A single drasine now");
		System.out.println("remains seated upon the tracks, resting against a reinforced wooden end plate.");
		System.out.println("\nObvious paths: (n)orth, (e)ast, (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			railTunnel();
			break;
		case 'E':
		case 'e':
			baseCamp();
			break;
		case 'S':
		case 's':
			spring();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			railStation();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			railStation();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void baseCamp() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [3][1]
		System.out.println("\n[Collapsed Mine - Base Camp]");
		System.out.println("This room served as a checkpoint for the exchange incoming and outgoing workers.");
		System.out.println("Despite its intact appearance, the hurried egress of its former occupants have left");
		System.out.println("quite a disordly mess. Soiled file folders lay strewn about the feet of a makeshift work table");
		System.out.println("which proudly displays an upright percolator weighted down by a foul smelling liquid.");
		System.out.println("\nObvious paths: (s)outh, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			baseCamp();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			baseCamp();
			break;
		case 'S':
		case 's':
			entrySlope();
			break;
		case 'W':
		case 'w':
			railStation();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			baseCamp();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void wideLedge() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [3][2]
		System.out.println("\n[Abandoned Mine - Wide Ledge]");
		System.out.println("This wide embankment which once served as a direct route for foot traffic");
		System.out.println("for resident miners, displays a panoramic view of the northern excavation");
		System.out.println("sites and the camps below. Work appears to have abrupty ceased no sooner");
		System.out.println("than it had begun.");
		System.out.println("\nObvious paths: (n)orth, and (e)ast.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			rockHeap();
			break;
		case 'E':
		case 'e':
			feederRamp();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			wideLedge();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			wideLedge();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			wideLedge();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void feederRamp() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [3][3]
		System.out.println("\n[Abandoned Mine - Feeder Ramp]");
		System.out.println("A large portion of this room is occupied by an iron-clad container which feeds the");
		System.out.println("first stage of a refinery. Hand driven carts lined up to offload their contents");
		System.out.println("to the feeder eagerly await their turn. Whatever had prematurely ended this");
		System.out.println("mining operation surely isn't worth sticking around to investigate.");
		System.out.println("\nObvious paths: (n)orth, (e)ast, (s)outh, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			launderChute();
			break;
		case 'E':
		case 'e':
			conveyorSouth();
			break;
		case 'S':
		case 's':
			commonRoom();
			break;
		case 'W':
		case 'w':
			wideLedge();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			feederRamp();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void conveyorSouth() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [3][4]
		System.out.println("\n[Processing Plant - Conveyor South]");
		System.out.println("A feeder from the west carries unprocessed mineral deposits to this belt");
		System.out.println("conveyor which runs along the walkway. It is here where operational staff");
		System.out.println("spend their days keeping the machinary clear of debris and foreign materials.");
		System.out.println("An intense amount of energy is required to haul the tons of earthen crust");
		System.out.println("towards a breaker to the north, it is not uncommon to sustain degloving injuries");
		System.out.println("or partial amputations when maintaining this caliber of machinery.");
		System.out.println("\nObvious paths: (n)orth, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			controlRoom();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			conveyorSouth();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			conveyorSouth();
			break;
		case 'W':
		case 'w':
			feederRamp();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			conveyorSouth();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void spring() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [4][0]
		System.out.println("\n[Collapsed Mine - Underground Spring]");
		System.out.println("A coppery red pool of water dominates the landscape of this room. At its edge");
		System.out.println("lies an overturned mining cart with a fishing pole resting against it. Water continues");
		System.out.println("to trickle in from a narrow clay aven located on the eastern wall. The acoustics");
		System.out.println("of this chamber create a lively symphony for its audience as the water plunges");
		System.out.println("through the surface of the pool.");
		System.out.println("\nObvious paths: (n)orth.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			railStation();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			spring();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			spring();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			spring();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			spring();
			break;
			}
		}
		keyBoard.close();
	}
	
	//	Player starts the game in this room.
	public static void entrySlope() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [4][1]
		System.out.println("\n[Collapsed Mine - Narrow Passage]");
		System.out.println("This narrow passage is heavily reinforced by the unadorned granite from which it was");
		System.out.println("carved. Used for nothing other than an expressway for personnel to come and go throughout");
		System.out.println("the day, the dimensions barely support the width of two broad shouldered men. A row of");
		System.out.println("light bulbs hang dormant within their protective cages from the ceiling.");
		System.out.println("\nObvious paths: (n)orth, and (s)outh.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			baseCamp();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			entrySlope();
			break;
		case 'S':
		case 's':
			ascendingRoom();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			entrySlope();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			entrySlope();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void newQuarters() {
		Scanner keyBoard = new Scanner(System.in);
		char newGame;
		// mapGrid [4][3]
		System.out.println("\n[Living Quarters - Expansion]");
		System.out.println("A drill whirls idly upon the ground kicking itself around furiously as if it");
		System.out.println("had a life of its own. Nearby, a cage housing a dead yellow canary");
		System.out.println("appears to be guarding a freshly carved incision through the rock.");
		System.out.println("As you meandor about attempting to understand the significance of it all,");
		System.out.println("a sudden flash becomes your only warning of the events that are");
		System.out.println("to transpire. You barely have enough time to react as your appendages ");
		System.out.println("carelessly rip away from your body along with your consciousness.");
//		System.out.println("\nObvious paths: (e)ast.");
		System.out.println("\nYou Are Dead. Play again? (Y)es or (N)o.");
		System.out.print(">> ");
		newGame = keyBoard.next().charAt(0);
		switch (newGame) {
		case 'Y':
		case 'y':
			Maze.gameStart();
			break;
		case 'N':
		case 'n':
			Messages.noGame();
			System.exit(0);
		default:
			while (newGame != 'Y' || newGame != 'y' || newGame != 'N' || newGame != 'n') {
				Messages.unknownEntry();
				newQuarters();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void commonRoom() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [4][3]
		System.out.println("\n[Living Quarters - Common Room]");
		System.out.println("Long-term inhabitants of the mine find little solace within these walls. Despite");
		System.out.println("all the comforts of home, these cold unadorned passages give no perception of");
		System.out.println("family. Excavated rock has been brought it and carved down to provide areas to sit");
		System.out.println("and dine between shifts.");
		System.out.println("\nObvious paths: (n)orth, (e)ast, and (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			feederRamp();
			break;
		case 'E':
		case 'e':
			sleepingArea();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			commonRoom();
			break;
		case 'W':
		case 'w':
			newQuarters();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			commonRoom();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void sleepingArea() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [4][4]
		System.out.println("\n[Living Quarters - Sleeping Area]");
		System.out.println("Layers of tattered clothes provide special privilages for a select few");
		System.out.println("that have been here long enough to have collected enough fabric to protect");
		System.out.println("them from the rocky floor. Never ment for long term accomodations, this");
		System.out.println("corner of the mine has required miners to instutite more creative solutions");
		System.out.println("when it comes to getting a good nights sleep.");
		System.out.println("\nObvious paths: (w)est.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			Messages.noExit();
			sleepingArea();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			sleepingArea();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			sleepingArea();
			break;
		case 'W':
		case 'w':
			commonRoom();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			sleepingArea();
			break;
			}
		}
		keyBoard.close();
	}
	
	public static void ascendingRoom() {
		Scanner keyBoard = new Scanner(System.in);
		char exit;
		// mapGrid [5][1]
		System.out.println("\n[Collapsed Mine - Ascending Room]");
		System.out.println("The darkness of this room is interrupted by trace amounts of sunlight scattering");
		System.out.println("itself through the veins of bedrock above. As your eyes begin to adjust, the");
		System.out.println("remnants of a mechanical lift come into view; the shadows of its former passengers");
		System.out.println("cast against failing support beams proudly display their departure from life.");
		System.out.println("\nObvious paths: (n)orth.");
		System.out.print(">> ");
		exit = keyBoard.next().charAt(0);
		switch (exit) {
		case 'N':
		case 'n':
			entrySlope();
			break;
		case 'E':
		case 'e':
			Messages.noExit();
			ascendingRoom();
			break;
		case 'S':
		case 's':
			Messages.noExit();
			ascendingRoom();
			break;
		case 'W':
		case 'w':
			Messages.noExit();
			ascendingRoom();
			break;
		default:
			while(exit != 'N' || exit != 'n' || exit != 'E' || exit != 'e' ||
				  exit != 'S' || exit != 's' || exit != 'W' || exit != 'w')	{
			Messages.unknownEntry();
			ascendingRoom();
			break;
			}
		}
		keyBoard.close();
	}
}
