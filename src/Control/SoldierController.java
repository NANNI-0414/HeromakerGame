package Control;

import Control.SoldierFactory.SoldierFactory;

public class SoldierController {
	private SoldierFactory soldierFactory;
	
	public SoldierController() {
		soldierFactory = new SoldierFactory();
		
		soldierFactory.makeObjPool();
	}
	
	public SoldierFactory getSoldierObjPool() {
		return this.soldierFactory;
	}
	
	public void makeSoldier(String name) {
//		soldierFactory.makeSoldier("Warrior");
//		soldierFactory.makeSoldier("Wizard");
//		soldierFactory.makeSoldier("Archer");
	}
}
