
public class EntryExitRoom extends Room 
{
	public EntryExitRoom(boolean isEntrance)
	{
		this.isEntrance = isEntrance;
		this.ContentCode = isEntrance ? 'I' : 'O';
	}

	// (Possibly an) Entrance - only one room will have an entrance and the room that contains the entrance will contain NOTHING else
	// (Possibly an) Exit - only one room will have an exit and the room that contains the exit will contain NOTHING else
	public boolean isEntrance;
}
