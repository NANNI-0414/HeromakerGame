package Model.Map;

public class Map1 extends Map{
	
	private int countM1; 
	public Map1() {
		this.countM1 = 0;
		this.enemyHp = 10;
		this.myHp = 10;
		
	}
	public int getMyHP() {
		return this.myHp;
	}
	public int getEnemyHP() {
		return this.enemyHp;
	}
		
	public String Spawn() {
		if(this.countM1!=7) {
			countM1++;
			return "Monster1";
		}
		this.countM1 = 0 ;
		return null;
	}
}
