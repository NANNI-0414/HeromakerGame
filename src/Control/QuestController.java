package Control;

import Model.Player.PlayerInfo;
import Model.Quest.QuestManager;

public class QuestController {
	private QuestManager questManager;
	private boolean onlyOneQuest =false;
	
	public QuestController() {
		questManager = new QuestManager();
		
	}
	
	public void acceptQuest(int quest,PlayerInfo playerInfo) {
		if(onlyOneQuest==false) {
		questManager.getQuest(quest).setIsRunning(true);
		playerInfo.setQuestProgree(quest);
		playerInfo.setQuestSuccess(false);
		System.out.println("����Ʈ " + quest+" �³� �Ϸ�");
		onlyOneQuest =true;
		
		}
		else {
			System.out.println("����Ʈ �̹� ���ڳ�");
		}
	}
	
	public void rewardQuest(int quest,PlayerInfo playerInfo) {
		if(	questManager.getQuest(quest).getIsRunning()==true& 
			playerInfo.getQuestProgress()==quest&
			playerInfo.getQuestSuccess()==true)
		{
			System.out.println("����Ʈ ���� �Ϸ�!! ");
			playerInfo.changeMoney(questManager.getQuest(quest).getReward());
			playerInfo.setTitle(questManager.getQuest(quest).getTitle());
			onlyOneQuest=false;
		}
		else 
		{
			System.out.println("����Ʈ �Ϸ��ϰ� ����");
		}
		
	}
}
