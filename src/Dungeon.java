
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
		
		// the rest are normal rooms with content
		for(int rowNum = 0; rowNum < numRowsInMap; rowNum++)
		{
			for(int colNum = 0; colNum < numColsInMap; colNum++)
			{
				boolean nDoor = rowNum != 0;
				boolean eDoor = colNum != numColsInMap - 1;
				boolean sDoor = rowNum != numRowsInMap - 1;
				boolean wDoor = colNum != 0;
				if(this.HeroLocationX == rowNum && this.HeroLocationY == colNum)
				{
					this.Map[rowNum][colNum] = new EntryExitRoom(true, nDoor, eDoor, sDoor, wDoor);
				}
				else if(exitLocationX == rowNum && exitLocationY == colNum)
				{
					this.Map[rowNum][colNum] = new EntryExitRoom(false, nDoor, eDoor, sDoor, wDoor);
				}
				else
				{
					this.Map[rowNum][colNum] = new RoomWithContents(nDoor, eDoor, sDoor, wDoor);
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
					row1 += roomDisplay.substring(0, 3);
					row2 += roomDisplay.substring(4, 7);
					row3 += roomDisplay.substring(8, 11);
				}
				else
				{
					row1 += "   ";
					row2 += "   ";
					row3 += "   ";
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
