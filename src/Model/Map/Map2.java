package Model.Map;


public class Map2 extends Map{
	private int monster1;
	private int monster2;
	private int countM1;
	private int countM2; 
	
	public Map2() {
		this.countM1 = 0;
		this.countM2 = 0;

		this.randomSpawn = 0;
		
		this.setMonster1(5);
		this.setMonster2(4);
		
		this.enemyHp = 15;
		this.myHp = 15;
	}
	public int getMyHP() {
		return this.myHp;
	}
	public int getEnemyHP() {
		return this.enemyHp;
	}
	public String Spawn() {
		if(countM1+countM2 <= 9) {
			switch ((randomSpawn++)%2) {
			case 0: // 군사 1
				if(countM1<=5) {
				countM1++;
				return "Monster1";
				}
			case 1: // 군사 2 
				if(countM2 <=4) {
				countM2++;
				return "Monster2";
				}
			}
		}
		countM1 = countM2 = 0 ;
		return null;
	}
	public int getMonster2() {
		return monster2;
	}
	public void setMonster2(int monster2) {
		this.monster2 = monster2;
	}
	public int getMonster1() {
		return monster1;
	}
	public void setMonster1(int monster1) {
		this.monster1 = monster1;
	}
		
}
