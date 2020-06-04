
public abstract class Monster extends MonsterFactory
{
	protected double chanceToHeal;
	protected int minHeal, maxHeal;
	
	//-----------------------------------------------------------------
	  protected Monster(String name, int hitPoints, int attackSpeed,
					     double chanceToHit, double chanceToHeal,
						 int damageMin, int damageMax,
						 int minHeal, int maxHeal)
	  {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		this.chanceToHeal = chanceToHeal;
		this.maxHeal = maxHeal;
		this.minHeal = minHeal;
	
	  }//end monster constructor
	
	//-----------------------------------------------------------------
	  public void heal()
	  {
		boolean canHeal;
		int healPoints;
	
		canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);
	
		if (canHeal)
		{
			healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
			addHitPoints(healPoints);
			System.out.println(name + " healed itself for " + healPoints + " points.\n"
								+ "Total hit points remaining are: " + hitPoints);
			System.out.println();
		}//end can heal
	
	
	  }//end heal method
	
	//-----------------------------------------------------------------
	 public void subtractHitPoints(int hitPoints)
	 {
			super.subtractHitPoints(hitPoints);
			heal();
	
	 }//end method
	
}//end Monster class
