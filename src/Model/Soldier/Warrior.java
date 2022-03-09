package Model.Soldier;

import Model.Monster.Monster;

public class Warrior extends Soldier {
	
	public Warrior() {
		hp = 5; 
		attack = 2; 
		location =100 ;
		tag =1;
		stopStatus=false;
		distance = 3;
	}

	public boolean damage(int damage) {
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
//	public boolean attack(Soldier soldier) {
//		
//		return soldier.damage(attack);
//	}
	public boolean attack(Monster monster) {

		System.out.println("전사가 공격합니다");
		return monster.damage(attack);
	}
	
	public void skill() {
		System.out.println("warrior skill");
	}
	

	public void init() {
		this.hp = 5;
		this.location = 100 ;
		stopStatus=false;
		
	}
}
