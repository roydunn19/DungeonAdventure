
public class Dungeon 
{
	public Dungeon(int numRowsInMap, int numColsInMap)
	{
		// create map
		this.Map = new Room[numRowsInMap][numColsInMap];
		
		// choose location of entry and add to map
		// place the hero at the entrance
		this.HeroLocationX = (int) Math.round((numRowsInMap - 1) * Math.random());
		this.HeroLocationY = (int) Math.round((numColsInMap - 1) * Math.random());
		this.Map[this.HeroLocationX][this.HeroLocationY] = new EntryExitRoom(true);

		// choose location of entry and exit rooms and add to map
		int exitLocationX;
		do
		{
			exitLocationX = (int) Math.round((numRowsInMap - 1) * Math.random());
		} while (exitLocationX == this.HeroLocationX);
		int exitLocationY;
		do
		{
			exitLocationY = (int) Math.round((numColsInMap - 1) * Math.random());
		} while (exitLocationY == this.HeroLocationY);
		this.Map[exitLocationX][exitLocationY] = new EntryExitRoom(false);
		
		// the rest are normal rooms with content
		for(int rowNum = 0; rowNum < this.Map.length - 1; rowNum++)
		{
			for(int colNum = 0; colNum < this.Map[colNum].length - 1; colNum++)
			{
				if (this.Map[rowNum][colNum] == null)
				{
					this.Map[rowNum][colNum] = new RoomWithContents();
				}
			}
		}
		// populate map with artifacts and monsters
	}
	
	// Creates/contains a 5 X 5 2D Array of Rooms (you can make this larger if you wish)
	Room[][] Map;
	
	
	// Places the Entrance, the Exit, and the Pillars of OO Pieces. NOTES: the entrance and exit
	// are empty rooms. The Pillar pieces cannot be at the entrance or the exit. Pillar pieces
	// must not occur in the same room.
	
	// Maintains location of the Hero in the Dungeon
	int HeroLocationX;
	int HeroLocationY;
	
	public String heroView(boolean reveal, boolean superVision)
	{
		String output = "";
		for(int rowNum = 0; rowNum < this.Map.length; rowNum++)
		{
			String row1 = "";
			String row2 = "";
			String row3 = "";
			for(int colNum = 0; colNum < this.Map[rowNum].length; colNum++)
			{
				String roomDisplay = "";
				boolean isVisible = reveal ? true 
						: superVision ? Math.abs(rowNum - this.HeroLocationX) < 2 && Math.abs(colNum - this.HeroLocationY) < 2
						: rowNum == this.HeroLocationX && colNum == this.HeroLocationY;
				if (isVisible)
				{
					roomDisplay = this.Map[rowNum][colNum].toString();
					row1 += roomDisplay.substring(0, 2);
					row2 += roomDisplay.substring(4, 6);
					row1 += roomDisplay.substring(8, 10);
				}
				else
				{
					row1 += "   ";
					row2 += "   ";
					row1 += "   ";
				}
			}
			
			output += row1 + "\n" + row2 + "\n" + row3 + "\n";
		}
		return output;
	}

	// Contains a toString method that builds a String containing information about the entire dungeon.
	public String toString()
	{
		return this.heroView(true, false);
	}
}
