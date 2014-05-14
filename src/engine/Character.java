package engine;

//	TODO Debug constructor, default value is not returning
//	TODO Implement name randomizer
//	TODO Create room Array and implement player location
public class Character {
	private String name;
//	private int[][] location;
//	private static final char[] MOVE = {'N', 'n', 'E', 'e', 'S', 's', 'W', 'w'};
	public Character() {
		name = "Guybrush Threepwood";
	}
	public Character(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	public int[][] getLocation() {
//		return location;
//	}
//	public void setLocation(int[][] location) {
//		this.location = location;
//	}
}
