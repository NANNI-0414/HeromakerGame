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
			System.out.println("���縦 �Ǹ��մϴ�.");
		}
	}
	
	public void sellArcher(PlayerInfo playerinfo) {
		if(playerinfo.changeArcher(-1)==true) {
			playerinfo.changeMoney(200);	
			System.out.println("�ü��� �Ǹ��մϴ�.");
		}
	}
	
	public void sellWizard(PlayerInfo playerinfo) {
		if(playerinfo.changeWizard(-1)==true) {
			playerinfo.changeMoney(300);	
			System.out.println("�����縦 �Ǹ��մϴ�.");
		}
	}
	public void sellWeather(PlayerInfo playerinfo) {

		if(playerinfo.ChangeWeatherItem(-1)==true) {
			playerinfo.changeMoney(100);	
			System.out.println("���� �������� �Ǹ��մϴ�.");
		}
	}

	public void buyWarrior(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-100)==true) {
			playerinfo.changeWarrior(1);
			System.out.println("���縦 �����մϴ�.");
		}
		
	}

	public void buyArcher(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-200)==true) {
			playerinfo.changeArcher(1);
			System.out.println("�ü��� �����մϴ�.");
		}
	}
	
	public void buyWizard(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-300)==true) {
			playerinfo.changeWizard(1);
			System.out.println("�����縦 �����մϴ�.");
		}
	}
	
	
	
	public void buyWeatherItem(PlayerInfo playerinfo) {
		if(playerinfo.changeMoney(-100)==true) {
			playerinfo.ChangeWeatherItem(1);
			System.out.println("������������ �����մϴ�.");
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
