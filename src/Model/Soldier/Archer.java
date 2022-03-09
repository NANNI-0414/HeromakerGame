package Model.Soldier;

import Model.Monster.Monster;

public class Archer extends Soldier{
	public Archer() {
		hp = 3; 
		attack = 3; 
		location =100 ;
		tag= 2;
		stopStatus=false;
		distance = 200;
	}
	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	

	public boolean attack(Monster monster) {

		System.out.println("궁수가 공격합니다");
		return monster.damage(attack);
	}
	
	public void skill() {
		System.out.println("Archer skill");
	}
	public void init() {
		this.hp = 3;
		this.location = 100 ;

		stopStatus=false;
	}
}
