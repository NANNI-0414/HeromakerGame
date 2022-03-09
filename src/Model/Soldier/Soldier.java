package Model.Soldier;

import Model.Monster.Monster;

public abstract class Soldier {
	public int hp ;
	public int attack; 
	public int location;
	public int tag;
	public boolean stopStatus;
	public int distance;
	

	public abstract boolean attack(Monster monster);
	public abstract boolean damage(int damage);
	public abstract void skill();
	public abstract void init();
}
