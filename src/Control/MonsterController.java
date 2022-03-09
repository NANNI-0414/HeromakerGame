package Control;

import Model.Monster.MonsterObjectPool;

public class MonsterController {
	private MonsterObjectPool monsterObjPool;
	
	public MonsterController() {
		monsterObjPool = new MonsterObjectPool();
	}
	public MonsterObjectPool getMonsterObjPool() {
		return this.monsterObjPool;
	}
}
