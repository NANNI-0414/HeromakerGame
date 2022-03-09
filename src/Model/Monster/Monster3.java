package Model.Monster;

import Model.Soldier.Soldier;

public class Monster3 extends Monster {
	public Monster3() {
		hp =3;
		attack = 2;
		this.tag = 3;
		this.location=650;
		this.stopStatus=false;
		this.distance = 2;
	}
	
	public boolean attack(Soldier soldier) {

		System.out.println("몬스터 3이 공격합니다");
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
