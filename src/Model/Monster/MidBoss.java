package Model.Monster;

import Model.Soldier.Soldier;

public class MidBoss  extends Boss {

	public MidBoss() {
		hp= 10; 
		attack =4;
		this.tag = 6;
		this.location=650;
		this.stopStatus=false;
		this.distance = 4;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("중간 보스가 공격합니다");
		return soldier.damage(attack);
	}
	public void init() {
		this.hp = 10;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	public void skill() {
		System.out.println("중간보스 스킬");
	}

	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
}
