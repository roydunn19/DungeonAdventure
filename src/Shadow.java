
public class Shadow extends Monster
{

    protected Shadow()
	{
		super("A Shadow", 200, 2, .6, .1, 30, 50, 30, 50);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " strikes " +
							opponent.getName() + " with a darkness sword: ");
		super.attack(opponent);

	}//end override of attack
}
