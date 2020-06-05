
public class HeroFactory extends DungeonCharacter{
	
	public HeroFactory(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		// TODO Auto-generated constructor stub
	}

	public static Hero createWarrior() {
		return new Warrior();
	}
	
	public static Hero createThief() {
		return new Thief();
	}
	
	public static Hero createSorceress() {
		return new Sorceress();
	}
	
	public static Hero createCyborg() {
		return new Cyborg();
	}
	
	public static Hero createWitcher() {
		return new Witcher();
	}
}
