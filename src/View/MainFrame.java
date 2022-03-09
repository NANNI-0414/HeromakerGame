package View;


import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Control.MainController;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private Container container;
	private BattlePanel battlePanel;
	private EndingPanel endingPanel;
	private InfoPanel infoPanel;
	private MapPanel mapPanel;
	private QuestPanel questPanel;
	private StorePanel storePanel;
	private MainPanel mainPanel;
	
	private MainController mainController;
	
	public MainFrame(MainController mainController) {
		this.setMainController(mainController);
		initComponent();
	}
	
	
	private void initComponent() {
		container = getContentPane();
		centerPanel = new JPanel();
		centerPanel.setLayout(new CardLayout() );
		
		mainPanel = new MainPanel(centerPanel);
		mainPanel.update(MainController.getMainController().getPlayerController().getPlayerInfo());
		centerPanel.add(mainPanel);
		
		battlePanel = new BattlePanel(centerPanel);
		centerPanel.add(battlePanel);
		
		endingPanel = new EndingPanel(centerPanel);
		centerPanel.add(endingPanel);
		
		infoPanel = new InfoPanel(centerPanel);
		centerPanel.add(infoPanel);
		
		mapPanel = new MapPanel(centerPanel);
		centerPanel.add(mapPanel);
		
		questPanel = new QuestPanel(centerPanel);
		centerPanel.add(questPanel);
		
		storePanel = new StorePanel(centerPanel);
		centerPanel.add(storePanel);
		
		container.add(centerPanel);
		
		
		this.setBounds(30,30,900,900);
		this.setResizable(false);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public MainController getMainController() {
		return mainController;
	}


	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
}
