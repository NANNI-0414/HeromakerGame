package Model.Map;

public abstract class Map {

	protected int myHp;
	protected int enemyHp;
	protected int movePeriod;
	protected String result;
	protected int randomSpawn;
	
	public abstract int getMyHP() ;
	public abstract int getEnemyHP() ;
	public abstract String Spawn();
//	public abstract void SpawnEnemy();
}
