package Model.Monster;

import Model.Soldier.Soldier;

public class Monster5 extends Monster {
	public Monster5() {
		hp =5;
		attack = 2;
		this.tag = 5;
		this.location=650;
		this.stopStatus=false;
		this.distance = 3;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("몬스터 5이 공격합니다");
		return soldier.damage(attack);
	}
	
	public void init() {
		this.hp = 5;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
}
