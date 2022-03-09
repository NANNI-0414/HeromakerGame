package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MapPanel extends BasePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	/**
	 * Create the panel.
	 */
	public MapPanel(JPanel centerPanel) {

		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel = centerPanel;
	}
	@Override
	protected void initComponent() {

		this.setLayout(null);
		this.setBounds(30,30,900,900);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Back.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				centerPanel.getComponent(0).setVisible(true);
			}
		});
		btnNewButton_1.setBounds(675, 756, 187, 64);
		add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uB9F5\uC120\uD0DD1.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(23, 201, 140, 191);
		add(label);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uC785\uC7A5.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getMainController().getMapController().startGame("map1", MainController.getMainController().getPlayerController().getPlayerInfo());
				setVisible(false);
				((BattlePanel)centerPanel.getComponent(1)).display();
				centerPanel.getComponent(1).setVisible(true);
			}
		});
		btnNewButton.setBounds(34, 589, 129, 76);
		add(btnNewButton);
		
		JLabel label_1 = new JLabel("\uB9F5\uC124\uBA85");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(23, 392, 140, 159);
		add(label_1);
		
		JLabel label_2 = new JLabel("\uB9F5\uC124\uBA85");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(201, 392, 140, 159);
		add(label_2);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uC785\uC7A5.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().startGame("map2", MainController.getMainController().getPlayerController().getPlayerInfo());
				setVisible(false);
				centerPanel.getComponent(1).setVisible(true);
				((BattlePanel)centerPanel.getComponent(1)).display();
			}
		});
		button.setBounds(212, 589, 129, 76);
		add(button);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uB9F5\uC120\uD0DD2.jpg"));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(201, 201, 140, 191);
		add(label_3);
		
		JLabel label_4 = new JLabel("\uB9F5\uC124\uBA85");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(388, 392, 140, 159);
		add(label_4);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uC785\uC7A5.jpg"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().startGame("map3", MainController.getMainController().getPlayerController().getPlayerInfo());
				setVisible(false);
				centerPanel.getComponent(1).setVisible(true);

				((BattlePanel)centerPanel.getComponent(1)).display();
			}
		});
		button_1.setBounds(399, 589, 129, 76);
		add(button_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uB9F5\uC120\uD0DD3.jpg"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(388, 201, 140, 191);
		add(label_5);
		
		JLabel label_6 = new JLabel("\uB9F5\uC124\uBA85");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(575, 392, 140, 159);
		add(label_6);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uC785\uC7A5.jpg"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().startGame("map4", MainController.getMainController().getPlayerController().getPlayerInfo());
				setVisible(false);
				centerPanel.getComponent(1).setVisible(true);

				((BattlePanel)centerPanel.getComponent(1)).display();
			}
		});
		button_2.setBounds(586, 589, 129, 76);
		add(button_2);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uB9F5\uC120\uD0DD4.jpg"));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(575, 201, 140, 191);
		add(label_7);
		
		JLabel label_8 = new JLabel("\uB9F5\uC124\uBA85");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(748, 392, 140, 159);
		add(label_8);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uC785\uC7A5.jpg"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().startGame("map5", MainController.getMainController().getPlayerController().getPlayerInfo());
				setVisible(false);
				centerPanel.getComponent(1).setVisible(true);

				((BattlePanel)centerPanel.getComponent(1)).display();
			}
		});
		
		button_3.setBounds(759, 589, 129, 76);
		add(button_3);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uB9F5\uC120\uD0DD5.jpg"));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(748, 201, 140, 191);
		add(label_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		lblNewLabel_1.setBounds(0, -43, 900, 990);
		add(lblNewLabel_1);
		
	}
	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		
	}

}
