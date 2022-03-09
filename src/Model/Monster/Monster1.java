package Model.Monster;

import Model.Soldier.Soldier;

public class Monster1 extends Monster{
	
	public Monster1() {
		this.hp = 1;
		this.attack = 1;
		this.tag = 1;
		this.location =650;
		this.stopStatus=false;
		this.distance = 100;
	}
	
	public boolean attack(Soldier soldier) {
		System.out.println("몬스터 1이 공격합니다");
		return soldier.damage(attack);
	}
	public void init() {
		this.hp = 2;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
}
