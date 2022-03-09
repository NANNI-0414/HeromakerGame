package Model.Map;

public class Map4 extends Map{
	private int monster3;
	private int monster4;
	
	private int countM3;
	private int countM4; 
	
	public Map4() {

		this.countM3 = 0;
		this.countM4 = 0 ;

		this.setMonster3(4);
		this.setMonster4(5);
		
		this.enemyHp = 25;
		this.myHp = 25;
	}
	public int getMyHP() {
		return this.myHp;
	}
	public int getEnemyHP() {
		return this.enemyHp;
	}
	public String Spawn() {
		if(countM3+countM4 <= 9) {
			switch ((randomSpawn++)%2) {
			case 0: // 군사 1
				if(countM3<=4) {
				countM3++;
				return "Monster3";
				}
			case 1: // 군사 2 
				if(countM4<=4) {
				countM4++;
				return "Monster4";
				}
			}
		}
		countM3 = countM4 = 0 ;
		return null;
	}
	public int getMonster3() {
		return monster3;
	}
	public void setMonster3(int monster3) {
		this.monster3 = monster3;
	}
	public int getMonster4() {
		return monster4;
	}
	public void setMonster4(int monster4) {
		this.monster4 = monster4;
	}
		
}
