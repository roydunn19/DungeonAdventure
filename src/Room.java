
public abstract class Room 
{
	// Doors - N, S, E, W
	public boolean nDoor;
	public boolean eDoor;
	public boolean sDoor;
	public boolean wDoor;

	protected char ContentCode;
	
	// Contains default constructor and all methods you deem necessary 
	// -- modular design is CRUCIAL
	public Room(boolean nDoor, boolean eDoor, boolean sDoor, boolean wDoor)
	{
		this.nDoor = nDoor;
		this.eDoor = eDoor;
		this.sDoor = sDoor;
		this.wDoor = wDoor;
	}

	// Must contain a toString method that builds a 2D Graphical representation of the room 
	// (NOTE: you may use any graphical components in Java that you wish).
	// The (command line) representation is as follows:
	public String toString()
	{
		// first row
		String output = "*" + (this.nDoor ? "-" : "*") + "*\n";
		// second row
		output += (this.wDoor ? "|" : "*") + this.ContentCode + (this.eDoor ? "|" : "*") + "\n";
		// third row
		output += "*" + (this.sDoor ? "-" : "*") + "*\n";
		return output;
	}
}
