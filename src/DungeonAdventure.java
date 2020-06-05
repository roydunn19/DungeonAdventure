import java.io.IOException;

public class DungeonAdventure {
	// Contains the main method
	public static void main(String[] args) throws IOException
	{
		DungeonAdventure game = new DungeonAdventure();
		game.Run();
	}
	
	private Hero hero; 
	
	private Dungeon dungeon;
	
	private void displayIntro()
	{
		System.out.println("this is the intro");
	}
	
	private void displayHeroMenu()
	{
		System.out.println("this is the hero menu");
		System.out.println("Press a key");
	}

	private void setupGame()
	{
		System.out.println("this is the game setup");
		this.dungeon = new Dungeon(5, 5);
		this.hero = HeroFactory.createWarrior();
	}
	
	private void Run() throws IOException
	{
		// Provides an introduction to the game describing what the game is about and how to play
		this.displayIntro();
		
		// Creates a Dungeon Object and a Hero Object (based on user choice)
		this.setupGame();
		
		// do the main game loop
		System.out.println("entering the loop");
		char command = ' ';
		boolean reveal = false;
		boolean superVision = false;
		boolean quit = false;
		do
		{
			// Prints the current room (this is based on the Hero's current location)
			System.out.println(this.dungeon.heroView(reveal, superVision));
			
			reveal = false;
			superVision = false;
			
			System.out.println("Hero is at " + this.dungeon.HeroLocationX + "," + this.dungeon.HeroLocationY);
			System.out.println(this.hero.inventoryView());

			// Determines the Hero's options (Move, Use a Potion)
			this.displayHeroMenu();
			
			// NOTE: Include a hidden menu option for testing that prints out the entire Dungeon
			//  -- specify what the menu option is in your documentation for the DungeonAdventure class

			// get key press
			command = this.GetKeyPress();
			switch(command)
			{
				case 'r':
					reveal = true;
					break;
				case 'h':
					this.hero.drinkHealingPotion();
					break;
				case 'v':
					superVision = this.hero.drinkVisionPotion();
					break;
				case 'q':
					quit = true;
				case 'n':
					// hero moving to room north
					// if he moved then apply pit or monster attack
					// if he died then quit
					quit = !this.hero.isAlive();
				default:
					break;
			}
	
			
			System.out.println("key pressed: " + command);
			
			// Continues this process until the Hero wins or dies
		} while(!quit);

		System.out.println("exiting the loop");
		// Does the following repetitively:
		// At the end of the game, display the entire Dungeon
		
	}
	
	// this is not working
	private char GetKeyPress() throws IOException
	{
		// block until we have something in the input
		while (System.in.available() == 0)
		{}
		
		// read a single char
		return (char)System.in.read(); 
	}
}
