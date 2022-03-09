package Model.Quest;

import java.util.ArrayList;

public class QuestManager {

	private ArrayList<Quest> quests;
	private boolean alreadyHaveQuest;
	
	public QuestManager() {
		quests = new ArrayList<Quest>();
		quests.add(new Quest(1, 100, "견습 기사", "quest1 description"));
		quests.add(new Quest(2, 200, "중급 기사", "quest2 description"));
		quests.add(new Quest(3, 300, "상급 기사", "quest3 description"));
		quests.add(new Quest(4, 400, "최상급 기사", "quest4 description"));
		quests.add(new Quest(5, 500, "전설의 기사", "quest5 description"));
		
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
