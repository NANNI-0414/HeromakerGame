package Model.Soldier;

import Model.Monster.Monster;

public class Wizard extends Soldier{
	public Wizard() {
		hp = 3; 
		attack = 4; 
		location =100 ;
		tag =3;
		stopStatus=false;
		distance = 300;
	}
	

	public boolean damage(int damage) {
		skill();
		hp -=damage;
		if(hp<=0) return true;
		return false;
	}
	
	
	public void skill() {
		hp -= 2;
		System.out.println("Wizard skill");
	}
	

	public boolean attack(Monster monster) {

		System.out.println("마법사가 공격합니다");
		return monster.damage(attack);
	}
	public void init() {
		this.hp = 3;
		this.location = 100 ;
		stopStatus=false;
		
	}
}
