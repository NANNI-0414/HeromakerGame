package Model.Quest;

import java.util.ArrayList;

public class QuestManager {

	private ArrayList<Quest> quests;
	private boolean alreadyHaveQuest;
	
	public QuestManager() {
		quests = new ArrayList<Quest>();
		quests.add(new Quest(1, 100, "�߽� ���", "quest1 description"));
		quests.add(new Quest(2, 200, "�߱� ���", "quest2 description"));
		quests.add(new Quest(3, 300, "��� ���", "quest3 description"));
		quests.add(new Quest(4, 400, "�ֻ�� ���", "quest4 description"));
		quests.add(new Quest(5, 500, "������ ���", "quest5 description"));
		
		setAlreadyHaveQuest(false);
	}
	
	public Quest getQuest(int quest) {
		return quests.get(quest-1);
	}

	public boolean isAlreadyHaveQuest() {
		return alreadyHaveQuest;
	}

	public void setAlreadyHaveQuest(boolean alreadyHaveQuest) {
		this.alreadyHaveQuest = alreadyHaveQuest;
	}
}
