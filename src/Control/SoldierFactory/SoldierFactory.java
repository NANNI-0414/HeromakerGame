package Control.SoldierFactory;

import java.util.LinkedList;

import Model.Soldier.Archer;
import Model.Soldier.Warrior;
import Model.Soldier.Wizard;

public class SoldierFactory {
	public LinkedList<Warrior> warriorQ;
	public LinkedList<Wizard> wizardQ;
	public LinkedList<Archer> archerQ;
	
	public SoldierFactory() {
		warriorQ = new LinkedList<Warrior>();
		wizardQ = new LinkedList<Wizard>();
		archerQ = new LinkedList<Archer>();
	}
	public void makeObjPool() {
		for(int i = 0 ; i < 10 ; i++) {
			warriorQ.add(new Warrior());
			wizardQ.add(new Wizard());
			archerQ.add(new Archer());
		}
	}
	
	public void makeSoldier(String name) {
		switch(name) {
		case "Warrior":
			warriorQ.add(new Warrior());
			break;			
			
		case "Wizard":
			wizardQ.add(new Wizard());
			break;
			
		case "Archer":
			archerQ.add(new Archer());
			break;
			
		default:
			break;
		}
	}
}
