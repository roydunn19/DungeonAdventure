
public class Dungeon 
{
	public Dungeon(int numRowsinMap, int numColsinMap, int difficulty)
	{
		// create map
		// populate map with artifacts and monsters according to difficulty
		// place the hero at the entrance
	}
	
	// Creates/contains a 5 X 5 2D Array of Rooms (you can make this larger if you wish)
	Room[][] Map;
	
	
	// Places the Entrance, the Exit, and the Pillars of OO Pieces. NOTES: the entrance and exit
	// are empty rooms. The Pillar pieces cannot be at the entrance or the exit. Pillar pieces
	// must not occur in the same room.
	
	// Maintains location of the Hero in the Dungeon
	int HeroLocationX;
	int HeroLocationY;
	
	// Contains a toString method that builds a String containing information about the entire dungeon.
	public String toString()
	{
		// takes the location of the hero and displays the room(s) around him according to his visionRange
		return "";
	}

}
