package Model.Monster;

import Model.Soldier.Soldier;

public class Monster4 extends Monster {
	public Monster4() {
		hp =4;
		attack = 2;
		this.tag = 4;
		this.location=650;
		this.stopStatus=false;
		this.distance = 3;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("몬스터 4이 공격합니다");
		return soldier.damage(attack);
	}
	
	public void init() {
		this.hp = 4;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
}
