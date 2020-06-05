
public class Pit
{
	private int damage;
	
	public Pit()
	{
		//  1-20 hit points (this amount will be randomly generated - you can modify the range)
		this.damage = (int)(Math.round(19 * Math.random()) + 1); 
	}
	
	public void applyToHero(Hero hero) 
	{
		hero.subtractHitPoints(this.damage);
		this.damage = 0;
	}	
}
