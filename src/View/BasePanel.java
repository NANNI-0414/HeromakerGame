package View;

import javax.swing.JPanel;

import Control.Observer.Observer;
import Control.Observer.PlayerObserver;

public abstract class BasePanel extends JPanel implements Observer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PlayerObserver playerObserver;
	
	public BasePanel(PlayerObserver playerObserver) {
		this.playerObserver = playerObserver;
		initComponent();
		
	}
	
	protected abstract void initComponent();

	public void update() {
		// TODO Auto-generated method stub
		
	}

}
