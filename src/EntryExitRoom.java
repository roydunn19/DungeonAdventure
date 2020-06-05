
public class EntryExitRoom extends Room 
{
	public EntryExitRoom()
	{
	}

	// (Possibly an) Entrance - only one room will have an entrance and the room that
	// contains the entrance will contain NOTHING else
	public boolean isEntrance;
	
	// (Possibly an) Exit - only one room will have an exit and the room that contains
	// the exit will contain NOTHING else
	public boolean isExit;
}
