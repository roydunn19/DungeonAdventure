
public class Gremlin extends Monster
{
    protected Gremlin()
    //4. Changed from Public to Protected
	{
		super("Gnarltooth the Gremlin", 70, 5, .8, .4, 15, 30, 20, 40);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Gremlin