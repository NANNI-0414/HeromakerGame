package Model.Map;

public class Map5 extends Map{
	private int monster4;
	private int monster5;
	private int finalboss;
	

	private int countM4;
	private int countM5; 
	private int countFB;
	
	public Map5() {

		this.countM4 = 0;
		this.countM5 = 0 ;
		this.countFB = 0 ;
		
		this.setMonster4(4);
		this.setMonster5(4) ;
		this.setFinalboss(1);
		
		this.enemyHp =30;
		this.myHp = 30;
	}
	public int getMyHP() {
		return this.myHp;
	}
	public int getEnemyHP() {
		return this.enemyHp;
	}
	public String Spawn() {
		if(countM4+countM5+countFB <= 9) {
			switch ((randomSpawn++)%3) {
			case 2: // 군사 1

				if(countFB<1) {
				countFB++;
				return "FinalBoss";
				}
			case 0: // 군사 2 
				if(countM4<=4) {
				countM4++;
				return "Monster4";
				}
			case 1:
				if(countM5<=4) {
				countM5++;
				return "Monster5";
				}
			}
		}
		countM4 = countM5 = countFB= 0 ;
		return null;
	}
	public int getMonster4() {
		return monster4;
	}
	public void setMonster4(int monster4) {
		this.monster4 = monster4;
	}
	public int getMonster5() {
		return monster5;
	}
	public void setMonster5(int monster5) {
		this.monster5 = monster5;
	}
	public int getFinalboss() {
		return finalboss;
	}
	public void setFinalboss(int finalboss) {
		this.finalboss = finalboss;
	}
		
}
