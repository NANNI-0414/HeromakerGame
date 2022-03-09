package Model.Player;

import Control.Strategy.SkillStrategy;
import Control.Strategy.SkillStrategy1;

public class PlayerInfo {
	private int money; 
	private String title;
	private int archer;
	private int warrior;
	private int wizard; 
	
	private int weatherItem;
	private int questProgress;
	private boolean questSuccess;
	private SkillStrategy skillStrategy;
	
	public PlayerInfo() {
		this.money = 1000; 
		this.archer = 0 ;
		this.warrior = 0 ;
		this.wizard = 0 ; 
		this.weatherItem = 0 ;
		
		this.questProgress = 0 ; 
		this.questSuccess =false;

		this.title= "무명기사";
		skillStrategy = new SkillStrategy1(); 
	}
	
	public boolean changeMoney(int money) {
		if(this.money+money>0) {
			this.money += money;
			return true;
		}
		return false;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setQuestProgree(int questProgress) {
		this.questProgress =  questProgress;
	}

	public int getQuestProgress() {
		return questProgress;
	}
	
	public void setQuestSuccess(boolean check) {
		this.questSuccess = check;
	}
	
	public boolean getQuestSuccess() {
		return questSuccess;
	}
	
	public boolean changeWarrior(int warrior) {
		if(warrior==-1 && this.warrior==0) {
			return false;
		}
		
		this.warrior += warrior;
		return true;
	}
	
	public int getWarrior() {
		return warrior;
	}
	
	public boolean changeWizard(int wizard) {
		if(wizard==-1 && this.wizard==0) {
			return false;
		}
		
		this.wizard += wizard;
		return true;
	}
	
	public int getWizard() {
		return wizard;
	}
	
	public boolean changeArcher(int archer) {
		if(archer==-1 && this.archer==0) {
			return false;
		}
		
		this.archer += archer;
		return true;
	}
	public int getArcher() {
		return archer;
	}
	
	public void setStrategy(SkillStrategy strategy) {
		this.skillStrategy = strategy;
	}
	
	public String getStrategyInfo() {
		return skillStrategy.getSkillname();
	}
	
	public SkillStrategy getStrategy() {
		return skillStrategy;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title; 
	}
	
	public boolean ChangeWeatherItem(int weatherItem) {
		if(this.weatherItem+weatherItem <0 ) return false;
		this.weatherItem +=weatherItem;
		return true;
	}
	
	public int getWeatherItem() {
		return this.weatherItem; 
	}
	
	
	
	
	
}
