
public class MonsterFactory extends DungeonCharacter {
	

	public MonsterFactory(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin,
			int damageMax) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		// TODO Auto-generated constructor stub
	}

	public static Monster createOgre() {
		return new Ogre();
	}
	
	public static Monster createSkeleton() {
		return new Skeleton();
	}
	
	public static Monster createGremlin() {
		return new Gremlin();
	}
	
	public static Monster createShadow() {
		return new Shadow();
	}
	
	public static Monster createGuardian() {
		return new Guardian();
	}
	public static Monster getRandomMonster() {
		// randomly picks a monster to return
		return null;
	}
}
