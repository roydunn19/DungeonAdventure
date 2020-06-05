
public class HealingPotion  extends Potion
{
	private int strength;
	
	public HealingPotion()
	{
		// heals 5-15 hit points (this amount will be randomly generated -- you can modify the range)
		this.strength = (int)(Math.round(10 * Math.random()) + 5); 
		this.name = "Healing potion +" + this.strength + " hp";
	}
	
	@Override
	public void applyToHero(Hero hero) 
	{
		hero.addHitPoints(this.strength);
		this.strength = 0;
	}
}
