package Control;

import Model.Map.MapManager;
import Model.Monster.FinalBoss;
import Model.Monster.MidBoss;
import Model.Monster.Monster1;
import Model.Monster.Monster2;
import Model.Monster.Monster3;
import Model.Monster.Monster4;
import Model.Monster.Monster5;
import Model.Player.PlayerInfo;
import Model.Soldier.Archer;
import Model.Soldier.Warrior;
import Model.Soldier.Wizard;

public class MapController extends Thread {
	public MapManager mapManager;
	private Thread enemySapwnThread;
	private Thread moveThread;
	private Thread attackThread;

	public MapController() {
		mapManager = new MapManager();

		// ������Ʈ Ǯ ���� ( ������ ������ �����ڿ��� �̸� ���� )
		mapManager.setMonsterObjPool(MainController.getMainController().getMonsterController().getMonsterObjPool());
		mapManager.setSoldierObjPool(MainController.getMainController().getSoldierController().getSoldierObjPool());
	}

	public void makeEnemyTh() {
		enemySapwnThread = new Thread(() -> {
			while (mapManager.terminate() != true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String temp = mapManager.getCurrentMap().Spawn();
				if (temp != null)
					mapManager.makeEnemy(temp);
				else {
					return;
				}

			}
		});
		enemySapwnThread.start();
	}

	public void makeSoldier(int lineNum, String soldier) {
		mapManager.makeSoldier(lineNum, soldier);
	}

	public void MoveTh() {
		moveThread = new Thread(() -> {
			while (mapManager.terminate() != true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mapManager.move();
			}
		});
		moveThread.start();
	}

	public void ClearLine() {
		int temp;
		for (int i = 0; i < 3; i++) {
			if (mapManager.myLine.get(i).isEmpty() == false) {
				temp =mapManager.myLine.get(i).size();
				for (int j = 0; j < temp; j++) {
					mapManager.myLine.get(i).get(0).init();

					System.out.println( i+"��°���ο�" + "���� ���簡" + mapManager.myLine.get(i).size()+"�� �ֽ��ϴ�");
					switch (mapManager.myLine.get(i).get(0).tag) {
					case 1: // ������ �� ���
						System.out.println("���� ����� ������ �ֽ��ϴ�.");
						mapManager.soldierObjPool.warriorQ.addLast((Warrior) mapManager.myLine.get(i).removeFirst());
						break;
					case 2: // �ü��� ���
						mapManager.soldierObjPool.archerQ.addLast((Archer) mapManager.myLine.get(i).removeFirst());
						break;
					case 3: // ������ �� ���
						mapManager.soldierObjPool.wizardQ.addLast((Wizard) mapManager.myLine.get(i).removeFirst());
						break;

					default:
						break;
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			if (mapManager.enemyLine.get(i).isEmpty() == false) {
				temp= mapManager.enemyLine.get(i).size();
				for (int j = 0; j <temp; j++) {
					mapManager.enemyLine.get(i).get(0).init();
					switch (mapManager.enemyLine.get(i).get(0).tag) {
					case 1: // ���� 1

						System.out.println("���� ���� 1�� ������ �ֽ��ϴ�.");
						mapManager.monsterObjPool.mon1Q.addLast((Monster1) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 2: // ���� 2
						mapManager.monsterObjPool.mon2Q.addLast((Monster2) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 3: // ���� 3
						mapManager.monsterObjPool.mon3Q.addLast((Monster3) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 4: // ���� 4
						mapManager.monsterObjPool.mon4Q.addLast((Monster4) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 5: // ���� 5
						mapManager.monsterObjPool.mon5Q.addLast((Monster5) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 6: // �߰� ����
						mapManager.monsterObjPool.midbossQ.addLast((MidBoss) mapManager.enemyLine.get(i).removeFirst());
						break;
					case 7: // ���� ����
						mapManager.monsterObjPool.finalbossQ
								.addLast((FinalBoss) mapManager.enemyLine.get(i).removeFirst());
						break;
					default:
						break;
					}

				}
			}
		}
	}

	public void attackTh() {
		attackThread = new Thread(() -> {
			while (mapManager.terminate() != true) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mapManager.attack();
			}
		});
		attackThread.start();
	}

	public void Skill() {

		mapManager.skillStrategy.skill(mapManager.enemyLine);
	}

	public void startGame(String mapname, PlayerInfo playerinfo) {
		chooseMap(mapname); // ��, �� ���� ����
		setPlayerInfo(playerinfo); // �÷��̾� ���� ����
		makeEnemyTh();
		MoveTh();
		attackTh();
	}

	private void chooseMap(String mapname) {
		mapManager.setMap(mapname);
	}

	private void setPlayerInfo(PlayerInfo playerinfo) {
		mapManager.updatePlayerInfo(playerinfo);
	}

}
