package Control.Observer;

import Model.Player.PlayerInfo;

public interface Observer {
	public void update(PlayerInfo playerinfo);

	void update();
}
