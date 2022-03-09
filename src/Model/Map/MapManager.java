package Model.Map;

import java.util.LinkedList;

import Control.MainController;
import Control.SoldierFactory.SoldierFactory;
import Control.Strategy.SkillStrategy;
import Model.Monster.FinalBoss;
import Model.Monster.MidBoss;
import Model.Monster.Monster;
import Model.Monster.Monster1;
import Model.Monster.Monster2;
import Model.Monster.Monster3;
import Model.Monster.Monster4;
import Model.Monster.Monster5;
import Model.Monster.MonsterObjectPool;
import Model.Player.PlayerInfo;
import Model.Soldier.Archer;
import Model.Soldier.Soldier;
import Model.Soldier.Warrior;
import Model.Soldier.Wizard;

public class MapManager {

	// 맵에 대한 정보
	private Map currentMap;

	// 플레이어 정보 를
	private int warrior;
	private int archer;
	private int wizard;
	public SkillStrategy skillStrategy;

	// 오브젝트 풀 들
	public SoldierFactory soldierObjPool;
	public MonsterObjectPool monsterObjPool;

	// 실제 공격 라인 들
	public LinkedList<LinkedList<Soldier>> myLine;
	public LinkedList<LinkedList<Monster>> enemyLine;

	// 랜덤배치
	private int random = 0;
	private int randomMove = 0;
	private int randomAttack = 0;
	public String getSkill() {
		return skillStrategy.getSkillname();
	}
	
	public int getWarrior() {
		return this.warrior;
	}
	public int getArcher() {
		return this.archer;
	}
	
	public int getWizard() {
		return wizard;
	}

	public void makeEnemy(String enemy) {
		System.out.println(enemy);
		switch (enemy) {
		case "Monster1":
			enemyLine.get(random % 3).addLast(monsterObjPool.mon1Q.removeFirst());
			break;

		case "Monster2":
			enemyLine.get(random % 3).addLast(monsterObjPool.mon2Q.removeFirst());
			break;

		case "Monster3":
			enemyLine.get(random % 3).addLast(monsterObjPool.mon3Q.removeFirst());
			break;

		case "Monster4":
			enemyLine.get(random % 3).addLast(monsterObjPool.mon4Q.removeFirst());
			break;

		case "Monster5":
			enemyLine.get(random % 3).addLast(monsterObjPool.mon5Q.removeFirst());
			break;

		case "MidBoss":
			enemyLine.get(random % 3).addLast(monsterObjPool.midbossQ.removeFirst());
			break;

		case "FinalBoss":
			enemyLine.get(random % 3).addLast(monsterObjPool.finalbossQ.removeFirst());
			break;
		default:
			break;
		}
		random++;
	}

	public void makeSoldier(int lineNum, String Soldier) {
		
		switch (Soldier) {
		case "Warrior":
			if(warrior>0) {
				myLine.get(lineNum).addLast(soldierObjPool.warriorQ.removeFirst());
				warrior--;
				break;
			}else {
				System.out.println("전사 없음");
				return;
			}
		case "Archer":
			if(archer>0){
				myLine.get(lineNum).addLast(soldierObjPool.archerQ.removeFirst());
				archer--;
				break;
			}else {
				System.out.println("궁사 없음");
				return; 
			}
		case "Wizard":
			if(wizard>0) {
				myLine.get(lineNum).addLast(soldierObjPool.wizardQ.removeFirst());
				wizard--;
				break;
			}else {
				System.out.println("마법사 없음");

				return;
			}
		}
	}

	public void moveEnemy(int i) { // 적이 나를 공격 
		if (enemyLine.get(i).isEmpty() == false) {
			for (int j = 0; j < enemyLine.get(i).size(); j++) { 
				if (myLine.get(i).isEmpty() == false) { // 비교 대상이 있는가

					if (j == 0) { // 첫 빠따인 경우
						if ((enemyLine.get(i).get(j).location - myLine.get(i).get(0).location) <= enemyLine.get(i)
								.get(j).distance) {
							enemyLine.get(i).get(j).stopStatus = true;
						} else {

							enemyLine.get(i).get(j).stopStatus = false;
							enemyLine.get(i).get(j).location -= 30;
						}
					} else {
						if ((enemyLine.get(i).get(j).location - myLine.get(i).get(0).location) <= enemyLine.get(i)
								.get(j).distance
								
								&& (enemyLine.get(i).get(j).location - enemyLine.get(i).get(j - 1).location) <= 1) {
							System.out.println("나는 " + j+"번째"+(enemyLine.get(i).get(j).location - myLine.get(i).get(0).location));
							enemyLine.get(i).get(j).stopStatus = true;
						} else {

							System.out.println("나는 " + j+"번째"+(enemyLine.get(i).get(j).location - myLine.get(i).get(0).location));
							enemyLine.get(i).get(j).stopStatus = false;
							enemyLine.get(i).get(j).location -= 30;
						}
					}
				} else { // 비교 대상이 없다.
					if(enemyLine.get(i).get(j).location >=200)enemyLine.get(i).get(j).location -= 30;
					
				}
			}
		}
	}

	public void moveMe(int i) {
		if (myLine.get(i).isEmpty() == false) {
			for (int j = 0; j < myLine.get(i).size(); j++) { // 내가 후빵
				if (enemyLine.get(i).isEmpty() == false) {
					if (j == 0) { // 첫 빠따
						if ((enemyLine.get(i).get(0).location - myLine.get(i).get(j).location) <= myLine.get(i)
								.get(j).distance) {
							myLine.get(i).get(j).stopStatus = true;

						} else {

							myLine.get(i).get(j).stopStatus = false;
							myLine.get(i).get(j).location += 30;
						}
					} 
					else { // 첫 빠따아닌 경우
						if ((enemyLine.get(i).get(0).location- myLine.get(i).get(j).location <= myLine.get(i).get(j).distance
								)) {
//							 (myLine.get(i).get(j).location - myLine.get(i).get(j - 1).location) <= 30)
							System.out.println("여긴 안 . 나는 " + j+"번째"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
//							System.out.println("나는 " + j+"번째"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
							myLine.get(i).get(j).stopStatus = true;
						} else {

							System.out.println("여긴 밖. 나는 " + j+"번째"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
							myLine.get(i).get(j).stopStatus = false;
							myLine.get(i).get(j).location += 30;
						}
					}
				} else {
					myLine.get(i).get(j).stopStatus=false;
					if(myLine.get(i).get(j).location<=600) {
						myLine.get(i).get(j).location += 30;
					}
				}
			}
		}
	}

	public void move() {
		for (int i = 0; i < 3; i++) {
			if (randomMove++ % 2 == 0) {
				moveMe(i);
				moveEnemy(i);
			} else {
				moveEnemy(i);
				moveMe(i);
			}
		}
	}

	
	public void attackEnemyCattle(int i ) {
		for(int j = 0 ; j <myLine.get(i).size();j++) {
			if(myLine.get(i).get(j).location>=600) {
				currentMap.enemyHp -= myLine.get(i).get(j).attack;
			}
		}
	}

	
	public void attackMeCattle(int i ) {
		for(int j = 0 ; j <enemyLine.get(i).size();j++) {
			if(enemyLine.get(i).get(j).location<=200) {
				currentMap.myHp -= enemyLine.get(i).get(j).attack;
			}
		}
	}
	
	public void attackEnemy(int i) {
		if (enemyLine.get(i).isEmpty() == false) {
			for (int j = 0; j < myLine.get(i).size(); j++) { // 나의 공격
				if (myLine.get(i).get(j).stopStatus) {// 공격할 수 있다면
					if (enemyLine.get(i).isEmpty()==false&& myLine.get(i).get(j).attack(enemyLine.get(i).get(0)) == true  ) { // 공격했는데 죽었다면
						enemyLine.get(i).get(0).init();
						switch (enemyLine.get(i).get(0).tag) {
						case 1: // 몬스터 1
							monsterObjPool.mon1Q.addLast((Monster1) enemyLine.get(i).removeFirst());
							break;
						case 2: // 몬스터 2
							monsterObjPool.mon2Q.addLast((Monster2) enemyLine.get(i).removeFirst());
							break;
						case 3: // 몬스터 3
							monsterObjPool.mon3Q.addLast((Monster3) enemyLine.get(i).removeFirst());
							break;
						case 4: // 몬스터 4
							monsterObjPool.mon4Q.addLast((Monster4) enemyLine.get(i).removeFirst());
							break;
						case 5: // 몬스터 5
							monsterObjPool.mon5Q.addLast((Monster5) enemyLine.get(i).removeFirst());
							break;
						case 6: // 중간 보스
							monsterObjPool.midbossQ.addLast((MidBoss) enemyLine.get(i).removeFirst());
							break;
						case 7: // 최종 보스
							monsterObjPool.finalbossQ.addLast((FinalBoss) enemyLine.get(i).removeFirst());
							break;
						default:
							break;
						}
					}
				}
			}
		}else {
			attackEnemyCattle(i);
		}

	}
	public void attackMe(int i) {
		if (myLine.get(i).isEmpty() == false) {
			for (int j = 0; j < enemyLine.get(i).size(); j++) { // 적의 공격
				if (enemyLine.get(i).get(j).stopStatus) { // 공격할 수 있다면 (위치기반으로 판단해야 함..)
					try {
						if (enemyLine.get(i).get(j).attack(myLine.get(i).get(0)) == true) { // 공격으로 사망했다면

							myLine.get(i).get(0).init();

							switch (myLine.get(i).get(0).tag) {
							case 1: // 워리어 일 경우
								soldierObjPool.warriorQ.addLast((Warrior) myLine.get(i).removeFirst());
								break;
							case 2: // 궁수일 경우
								soldierObjPool.archerQ.addLast((Archer) myLine.get(i).removeFirst());
								break;
							case 3: // 마법사 일 경우
								soldierObjPool.wizardQ.addLast((Wizard) myLine.get(i).removeFirst());
								break;

							default:
								break;
							}
						}
					} catch (Exception e) {
						System.out.println(e.getStackTrace());
						
						return;
					}
				}
			}
		}else {

			System.out.println("공격중2");
			attackMeCattle(i);
		}
	}

	public void attack() {
		for (int i = 0; i < 3; i++) {
			if (randomAttack++ % 2 == 0) {
				attackMe(i);
				attackEnemy(i);
			} else {
				attackEnemy(i);
				attackMe(i);
			}
		}

	}

	public MapManager() {

		myLine = new LinkedList<LinkedList<Soldier>>();
		enemyLine = new LinkedList<LinkedList<Monster>>();

		for (int i = 0; i < 3; i++) {
			myLine.add(new LinkedList<Soldier>());
			enemyLine.add(new LinkedList<Monster>());
		}
	}

	public boolean terminate() {
		if (currentMap.getEnemyHP() <= 0 || currentMap.getMyHP() <= 0) {
			if(currentMap.getEnemyHP() <= 0 ) {
				MainController.getMainController().getPlayerController().getPlayerInfo().setQuestSuccess(true);

				System.out.print("이겼네");
			}
			if(currentMap.getMyHP() <= 0) {
				MainController.getMainController().getPlayerController().getPlayerInfo().setQuestSuccess(false);
				System.out.print("졋네");
			}
			
			return true;
		}
		return false;
	}
	
	public void orrangePool() {
		
	}

	public void setMap(String map) {
		switch (map) {
		case "map1":
			currentMap = new Map1();
			break;

		case "map2":
			currentMap = new Map2();
			break;

		case "map3":
			currentMap = new Map3();
			break;

		case "map4":
			currentMap = new Map4();
			break;

		case "map5":
			currentMap = new Map5();
			break;
		default:
			System.out.println("맵이 없습니다.");
			break;
		}
	}

	public void updatePlayerInfo(PlayerInfo playerinfo) {
		this.warrior = playerinfo.getWarrior();
		this.wizard = playerinfo.getWizard();
		this.archer = playerinfo.getArcher();
		this.skillStrategy = playerinfo.getStrategy();
	}

	public void setSoldierObjPool(SoldierFactory sObjPool) {
		this.soldierObjPool = sObjPool;
	}

	public void setMonsterObjPool(MonsterObjectPool mObjPool) {
		this.monsterObjPool = mObjPool;
	}

	public Map getCurrentMap() {
		return this.currentMap;
	}

}
