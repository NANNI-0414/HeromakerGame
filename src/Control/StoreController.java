package Control;

import Model.Player.PlayerInfo;
import Model.Store.Store;

public class StoreController {
	private Store store;
	
	public StoreController() {
		this.store =new Store();
	}

	
	public void sellWarrior(PlayerInfo playerinfo) {
		if(playerinfo.changeWarrior(-1)==true) {
			playerinfo.changeMoney(100);	
			System.out.println("전사를 판매합니다.");
		}
	}
	
	public void sellArcher(PlayerInfo playerinfo) {
		if(playerinfo.changeArcher(-1)==true) {
			playerinfo.changeMoney(200);	
			System.out.println("궁수를 판매합니다.");
		}
	}
	
	public void sellWizard(PlayerInfo playerinfo) {
		if(playerinfo.changeWizard(-1)==true) {
			playerinfo.changeMoney(300);	
			System.out.println("마법사를 판매합니다.");
		}
	}
	public void sellWeather(PlayerInfo playerinfo) {

		if(playerinfo.ChangeWeatherItem(-1)==true) {
			playerinfo.changeMoney(100);	
			System.out.println("날씨 아이템을 판매합니다.");
		}
	}

	public void buyWarrior(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-100)==true) {
			playerinfo.changeWarrior(1);
			System.out.println("전사를 구매합니다.");
		}
		
	}

	public void buyArcher(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-200)==true) {
			playerinfo.changeArcher(1);
			System.out.println("궁수를 구매합니다.");
		}
	}
	
	public void buyWizard(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-300)==true) {
			playerinfo.changeWizard(1);
			System.out.println("마법사를 구매합니다.");
		}
	}
	
	
	
	public void buyWeatherItem(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-100)==true) {
			playerinfo.ChangeWeatherItem(1);
			System.out.println("날씨아이템을 구매합니다.");
		}
	}
	
	public void buyItem1(PlayerInfo playerinfo) {
		
	}
	
	public void buyItem2(PlayerInfo playerinfo) {
		
	}


	public Store getStore() {
		return store;
	}


}
