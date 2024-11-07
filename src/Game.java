import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		runGame();
	}
	
	private static ArrayList<Item> inventory = new ArrayList<Item>();
	
	
	public static void runGame() {
		Room currentRoom = World.buildWorld();
		Scanner input = new Scanner(System.in);
		
		String command;
		do {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? ");
			command = input.nextLine();
			String [] words = command.split(" ");
			
			switch(words[0]) {
			case "e":
			case "w":
			case "s":
			case "n":
			case "u":
			case "d":
				currentRoom = currentRoom.getExit(command.charAt(0));
				break;
			case "x":
				System.out.println("Bye, thanks for playing.");
				break;
			case "take":
				Item i = currentRoom.getItem();
				System.out.println("You want to take the " + words[1]);
				if(i == null) {
					System.out.println("There's nothing to take.");
				}
				else {
					currentRoom.removeItem();
					inventory.add(i);
					System.out.println("You pick up the" + i.getName());
				}
				break;
			case "i":
				System.out.println("You are carrying: ");
				for(Item it : inventory)
						System.out.println(it);
				break;
			default:
				System.out.println("Unsure what you meant.");
			}
			
		} while(!command.equals("x"));
		
		input.close();
	}
}