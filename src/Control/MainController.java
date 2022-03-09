package Control;

public class MainController {
	public static MainController instance; 
	public MapController mapController;
	public MonsterController monsterController;
	public PlayerController playerController;
	public QuestController questController;
	public SoldierController soldierController;
	public StoreController storeController;
	
	
	public static MainController getMainController() {
		if(instance ==null) {
			instance = new MainController();
		}
		return instance;
	}
	
	public MainController() {
		instance = this; 

		this.monsterController= new MonsterController();
		this.playerController = new PlayerController();
		this.questController = new QuestController();
		this.soldierController = new SoldierController();

		this.storeController = new StoreController();
		this.mapController = new MapController();
	}
	
	public MapController getMapController() {
		return this.mapController;
	}
	public MonsterController getMonsterController() {
		return this.monsterController;
	}
	public PlayerController getPlayerController() {
		return this.playerController;
	}
	public QuestController getQuestController() {
		return this.questController;
	}

	public SoldierController getSoldierController() {
		return this.soldierController;
	}

	public StoreController getStoreController() {
		return this.storeController;
	}
}
