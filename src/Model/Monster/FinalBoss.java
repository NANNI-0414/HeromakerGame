package Model.Monster;

import Model.Soldier.Soldier;

public class FinalBoss extends Boss{

	public FinalBoss() {
		hp=1;
		attack = 10;
		this.tag = 7;
		this.location=650;
		this.stopStatus=false;
		this.distance = 5;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("우어어엉어엌!!");
		return soldier.damage(attack);
	}
	public void init() {
		this.hp = 15;
		this.location = 700 ;
		this.stopStatus=false;
		
	}
	
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
	public void skill() {
		System.out.println("최종보스 스킬");
	}
}
