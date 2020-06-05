import java.util.ArrayList;
import java.util.Scanner;

public abstract class Hero extends DungeonCharacter
{
	
	Scanner kb = new Scanner(System.in);
	protected double chanceToBlock;
	protected int numTurns;

//-----------------------------------------------------------------
//calls base constructor and gets name of hero from user
		  protected Hero(String name, int hitPoints, int attackSpeed,
						     double chanceToHit, int damageMin, int damageMax,
							 double chanceToBlock)
		  {
			super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
			this.chanceToBlock = chanceToBlock;
			readName();
		  }
		
		/*-------------------------------------------------------
		readName obtains a name for the hero from the user
		
		Receives: nothing
		Returns: nothing
		
		This method calls: nothing
		This method is called by: hero constructor
		---------------------------------------------------------*/
		  public void readName()
		  {	  
			  System.out.print("Enter character name: ");
			  name = kb.nextLine();
		  }//end readName method
		  
		  
		/*-------------------------------------------------------
		subtractHitPoints checks to see if hero blocked attack, if so a message
		is displayed, otherwise base version of this method is invoked to
		perform the subtraction operation.  This method overrides the method
		inherited from DungeonCharacter promoting polymorphic behavior
		
		Receives: hit points to subtract
		Returns: nothing
		
		This method calls: defend() or base version of method
		This method is called by: attack() from base class
		---------------------------------------------------------*/
		public void subtractHitPoints(int hitPoints)
			{

				if (Math.random() <= chanceToBlock)
				{
					System.out.println(name + " BLOCKED the attack!");
				}
				else
				{
					super.subtractHitPoints(hitPoints);
				}
		
		
			}//end method
		
		/*-------------------------------------------------------
		battleChoices will be overridden in derived classes.  It computes the
		number of turns a hero will get per round based on the opponent that is
		being fought.  The number of turns is reported to the user.  This stuff might
		go better in another method that is invoked from this one...
		
		Receives: opponent
		Returns: nothing
		
		This method calls: getAttackSpeed()
		This method is called by: external sources
		---------------------------------------------------------*/
			public void battleChoices(DungeonCharacter opponent)
			{
			    numTurns = attackSpeed/opponent.getAttackSpeed();
		
				if (numTurns == 0)
					numTurns++;
		
				System.out.println("Number of turns this round is: " + numTurns);
		
			}//end battleChoices
		
			public boolean isAlive()
			{
				return true;
			}

			public int numPillarOfOOFound()
			{
				return 0;
			}
			
			public boolean drinkVisionPotion()
			{
				// make sure we have that potion if not return false
				// apply the potion like this: potion.applyToHero(this);
				// remove potion from inventory
				return true;
			}
			
			public boolean drinkHealingPotion()
			{
				// make sure we have that potion if not return false
				// apply the potion like this: potion.applyToHero(this);
				// remove potion from inventory
				return true;
			}
			
			public String inventoryView()
			{
				// return string about how many healing potions and how many vision potions 
				String output = "Hero Inventory\n";
				return output;
			}
	}//end Hero class