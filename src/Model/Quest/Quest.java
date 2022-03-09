package Model.Quest;

public class Quest {
	private int stage;
	private int money ;
	private String title;
	private String Description;
	private boolean isRunning;
	
	public  Quest(int stage,int money, String title, String Description) {
		this.setStage(stage);
		this.money = money;
		this.title = title; 
		this.setDescription(Description);
		this.isRunning = false;
	}
	
	public void setIsRunning(boolean check) {
		isRunning = check;
	}
	
	public boolean getIsRunning() {
		return isRunning;
	}
	
	public int getReward() {
		return money;
	}
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}
	
}
