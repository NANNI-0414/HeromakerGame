package Model.Monster;

import Model.Soldier.Soldier;

public abstract class Monster {
	public int hp;
	public int attack;
	public int location;
	public int tag;
	public boolean stopStatus;
	public int distance;
	public  Monster() {
		
	}
	public abstract boolean damage(int damage);
	public abstract boolean attack(Soldier soldier);
	public abstract void init();
}
