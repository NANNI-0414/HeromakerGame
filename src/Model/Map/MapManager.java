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

	// �ʿ� ���� ����
	private Map currentMap;

	// �÷��̾� ���� ��
	private int warrior;
	private int archer;
	private int wizard;
	public SkillStrategy skillStrategy;

	// ������Ʈ Ǯ ��
	public SoldierFactory soldierObjPool;
	public MonsterObjectPool monsterObjPool;

	// ���� ���� ���� ��
	public LinkedList<LinkedList<Soldier>> myLine;
	public LinkedList<LinkedList<Monster>> enemyLine;

	// ������ġ
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
				System.out.println("���� ����");
				return;
			}
		case "Archer":
			if(archer>0){
				myLine.get(lineNum).addLast(soldierObjPool.archerQ.removeFirst());
				archer--;
				break;
			}else {
				System.out.println("�û� ����");
				return; 
			}
		case "Wizard":
			if(wizard>0) {
				myLine.get(lineNum).addLast(soldierObjPool.wizardQ.removeFirst());
				wizard--;
				break;
			}else {
				System.out.println("������ ����");

				return;
			}
		}
	}

	public void moveEnemy(int i) { // ���� ���� ���� 
		if (enemyLine.get(i).isEmpty() == false) {
			for (int j = 0; j < enemyLine.get(i).size(); j++) { 
				if (myLine.get(i).isEmpty() == false) { // �� ����� �ִ°�

					if (j == 0) { // ù ������ ���
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
							System.out.println("���� " + j+"��°"+(enemyLine.get(i).get(j).location - myLine.get(i).get(0).location));
							enemyLine.get(i).get(j).stopStatus = true;
						} else {

							System.out.println("���� " + j+"��°"+(enemyLine.get(i).get(j).location - myLine.get(i).get(0).location));
							enemyLine.get(i).get(j).stopStatus = false;
							enemyLine.get(i).get(j).location -= 30;
						}
					}
				} else { // �� ����� ����.
					if(enemyLine.get(i).get(j).location >=200)enemyLine.get(i).get(j).location -= 30;
					
				}
			}
		}
	}

	public void moveMe(int i) {
		if (myLine.get(i).isEmpty() == false) {
			for (int j = 0; j < myLine.get(i).size(); j++) { // ���� �Ļ�
				if (enemyLine.get(i).isEmpty() == false) {
					if (j == 0) { // ù ����
						if ((enemyLine.get(i).get(0).location - myLine.get(i).get(j).location) <= myLine.get(i)
								.get(j).distance) {
							myLine.get(i).get(j).stopStatus = true;

						} else {

							myLine.get(i).get(j).stopStatus = false;
							myLine.get(i).get(j).location += 30;
						}
					} 
					else { // ù �����ƴ� ���
						if ((enemyLine.get(i).get(0).location- myLine.get(i).get(j).location <= myLine.get(i).get(j).distance
								)) {
//							 (myLine.get(i).get(j).location - myLine.get(i).get(j - 1).location) <= 30)
							System.out.println("���� �� . ���� " + j+"��°"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
//							System.out.println("���� " + j+"��°"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
							myLine.get(i).get(j).stopStatus = true;
						} else {

							System.out.println("���� ��. ���� " + j+"��°"+(enemyLine.get(i).get(0).location - myLine.get(i).get(j).location));
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
			for (int j = 0; j < myLine.get(i).size(); j++) { // ���� ����
				if (myLine.get(i).get(j).stopStatus) {// ������ �� �ִٸ�
					if (enemyLine.get(i).isEmpty()==false&& myLine.get(i).get(j).attack(enemyLine.get(i).get(0)) == true  ) { // �����ߴµ� �׾��ٸ�
						enemyLine.get(i).get(0).init();
						switch (enemyLine.get(i).get(0).tag) {
						case 1: // ���� 1
							monsterObjPool.mon1Q.addLast((Monster1) enemyLine.get(i).removeFirst());
							break;
						case 2: // ���� 2
							monsterObjPool.mon2Q.addLast((Monster2) enemyLine.get(i).removeFirst());
							break;
						case 3: // ���� 3
							monsterObjPool.mon3Q.addLast((Monster3) enemyLine.get(i).removeFirst());
							break;
						case 4: // ���� 4
							monsterObjPool.mon4Q.addLast((Monster4) enemyLine.get(i).removeFirst());
							break;
						case 5: // ���� 5
							monsterObjPool.mon5Q.addLast((Monster5) enemyLine.get(i).removeFirst());
							break;
						case 6: // �߰� ����
							monsterObjPool.midbossQ.addLast((MidBoss) enemyLine.get(i).removeFirst());
							break;
						case 7: // ���� ����
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
			for (int j = 0; j < enemyLine.get(i).size(); j++) { // ���� ����
				if (enemyLine.get(i).get(j).stopStatus) { // ������ �� �ִٸ� (��ġ������� �Ǵ��ؾ� ��..)
					try {
						if (enemyLine.get(i).get(j).attack(myLine.get(i).get(0)) == true) { // �������� ����ߴٸ�

							myLine.get(i).get(0).init();

							switch (myLine.get(i).get(0).tag) {
							case 1: // ������ �� ���
								soldierObjPool.warriorQ.addLast((Warrior) myLine.get(i).removeFirst());
								break;
							case 2: // �ü��� ���
								soldierObjPool.archerQ.addLast((Archer) myLine.get(i).removeFirst());
								break;
							case 3: // ������ �� ���
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

			System.out.println("������2");
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

				System.out.print("�̰��");
			}
			if(currentMap.getMyHP() <= 0) {
				MainController.getMainController().getPlayerController().getPlayerInfo().setQuestSuccess(false);
				System.out.print("����");
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
			System.out.println("���� �����ϴ�.");
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
