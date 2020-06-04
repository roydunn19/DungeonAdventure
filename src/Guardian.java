public class Guardian extends Monster
{

    protected Guardian()
	{
		super("Guardian", 200, 2, .6, .1, 30, 50, 30, 50);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		double attack = randomAttack();
		if(attack == 0)
			System.out.println(name + " summons a void bomb and hits " +
					opponent.getName() + ":");
			super.attack(opponent);
			
		if(attack == 1)
			System.out.println(name + " flies up and divebombs on top of " +
					opponent.getName() + ":");
		
		else if(attack == 2)
			System.out.print(name + "surges with arc energy and rockets himself into " + 
					opponent.getName() + ":");

	}//end override of attack

	public double randomAttack() {
		double choice = Math.random();
		return choice % 3;
		}
	
}