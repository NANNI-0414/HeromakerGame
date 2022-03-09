package Control;

import java.util.ArrayList;

import Control.Observer.Observer;
import Control.Observer.PlayerObserver;
import Model.Player.PlayerInfo;

public class PlayerController implements PlayerObserver {
	private PlayerInfo playerinfo;
	private ArrayList<Observer> observers;
	
	public PlayerController() {
		observers = new ArrayList<Observer>();
		playerinfo = new PlayerInfo();
	}
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
	}
	
	public PlayerInfo getPlayerInfo() {
		return playerinfo;
	}
	
	public void setPlayerInfo(PlayerInfo playerinfo) {
		this.playerinfo = playerinfo;
	}
	
	public void updatePlayerInfo() {
		notifyObservers();
	}
	
	
	
}
