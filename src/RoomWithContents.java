
public class RoomWithContents extends Room 
{
	public RoomWithContents()
	{
		/*
		this.strength = (int)(Math.round(10 * Math.random()) + 5); 

		M - Multiple Items
		P - Pit
		V - Vision Potion
		H - Healing Potion
		E - Empty Room
		X - Monster
		*/
	}
	
	// 10% possibility (this is a constant that you can modify) room will contain a
	// healing potion, vision potion, and pit (each of these are independent of one another)

	// (Possibly a) Healing Potion - heals 5-15 hit points 
	// (this amount will be randomly generated -- you can modify the range)
	public HealingPotion healingPotion; // HP Modifier
	
	// Vision Potion - can be used to allow user to see eight rooms surrounding current
	// room as well as current room (location in maze may cause less than 8 to be displayed). 
	// The Vision Potion allows you to see the rooms that are immediately around you 
	// (this is up to eight rooms depending on your location in the dungeon).
	// This potion only lasts for a single turn.
	public VisionPotion visionPotion;

	// (Possibly a) Pit - damage a pit can cause is from 1-20 hit points 
	// (this amount will be randomly generated - you can modify the range)
	public Pit pit; // HP Modifier
	
	// (Possibly a) Pillar of OO - four pieces in game and they will never be in the same
	// room
	public PillarOfOO pillarOfOO;
	
	// (Possibly a) Monster
	public Monster monster;
}
