package Model.Map;


public class Map3 extends Map{
	private int monster2;
	private int monster3; 
	private int midboss;

	private int countM2;
	private int countM3; 
	private int countMB;
	
	public Map3() {
		this.countM2 = 0;
		this.countM3 = 0 ;
		this.countMB = 0 ;
		

		this.randomSpawn = 0;
		
		this.setMonster2(4);
		this.setMonster3(4);
		this.setMidboss(1);
		
		this.enemyHp = 20;
		this.myHp = 20;
	}
	public int getMyHP() {
		return this.myHp;
	}
	public int getEnemyHP() {
		return this.enemyHp;
	}
	public String Spawn() {
		if(countM3+countM2+countMB <= 9) {
			switch ((randomSpawn++)%3) {
			case 2: // 군사 1=
				if(countMB<1) {
				countMB++;
				return "MidBoss";
				}
			case 0: // 군사 2
				if(countM2<=4) {
				countM2++;
				return "Monster2";
				}
			case 1:
				if(countM3 <= 4) {
				countM3++;
				return "Monster3";
				}
					
			}
		}
		countM2 = countM3 = countMB=  0 ;
		return null;
	}
	public int getMonster2() {
		return monster2;
	}
	public void setMonster2(int monster2) {
		this.monster2 = monster2;
	}
	public int getMonster3() {
		return monster3;
	}
	public void setMonster3(int monster3) {
		this.monster3 = monster3;
	}
	public int getMidboss() {
		return midboss;
	}
	public void setMidboss(int midboss) {
		this.midboss = midboss;
	}
		
		
}
