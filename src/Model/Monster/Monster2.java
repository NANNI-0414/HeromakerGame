package Model.Monster;

import Model.Soldier.Soldier;

public class Monster2 extends Monster{
	public Monster2() {
		hp = 3;
		attack = 1;
		this.tag = 2;
		this.location =650;
		this.stopStatus=false;
		this.distance = 2;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("���� 2�� �����մϴ�");
		return soldier.damage(attack);
	}
	
	public void init() {
		this.hp = 3;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
}
