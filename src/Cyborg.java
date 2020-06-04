
import java.util.Scanner;

public class Cyborg extends Hero
{
	Scanner kb;
	
    protected Cyborg()
    //4. Changed from Public to Protected
	{
		super("Cyborg", 125, 4, .8, 35, 60, .2);

    }//end constructor
    
    

	public void crushingBlow(DungeonCharacter opponent)
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " shoots an energy blast at " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(name + " missed his energy blast!!");
			System.out.println();
		}//blow failed

	}//end crushingBlow method

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " swings a mighty sword at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method



    public void battleChoices(DungeonCharacter opponent)
	{
    	Scanner kb = new Scanner(System.in);
		int choice;

		super.battleChoices(opponent);

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Energy blast");
		    System.out.println("Choose an option: ");
		    choice = kb.nextInt();
		    
		    switch (choice)
		    {
			    case 1: attack(opponent);
			        
			    case 2: crushingBlow(opponent);
			    	
			    default:
			        System.out.println("invalid choice!");
		    }//end switch
		   
			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }//end battleChoices method

}//end Hero class