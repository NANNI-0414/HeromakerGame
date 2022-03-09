package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class QuestPanel extends BasePanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	/**
	 * Create the panel.
	 */
	public QuestPanel(JPanel centerPanel) {

		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel = centerPanel;
	}
	@Override
	protected void initComponent() {
		this.setLayout(null);
		this.setBounds(30,30,900,900);
		
		JLabel lblQuest = new JLabel("\uD018\uC2A4\uD2B8 1");
		lblQuest.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuest.setBounds(279, 144, 261, 76);
		add(lblQuest);
		
		JButton button = new JButton("\uC120\uD0DD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.acceptQuest
				(
						1,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button.setBounds(580, 144, 97, 71);
		add(button);
		
		JButton button_1 = new JButton("\uBCF4\uC0C1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.rewardQuest
				(
						1,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_1.setBounds(687, 144, 97, 71);
		add(button_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uBAAC\uC2A4\uD1301.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label.setBounds(115, 105, 128, 116);
		add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(825, 867, -71, -16);
		add(btnNewButton);
		
		JButton button_2 = new JButton("\uBCF4\uC0C1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.rewardQuest
				(
						2,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_2.setBounds(694, 273, 97, 71);
		add(button_2);
		
		JButton button_3 = new JButton("\uC120\uD0DD");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.acceptQuest
				(
						2,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_3.setBounds(580, 273, 97, 71);
		add(button_3);
		
		JLabel label_1 = new JLabel("\uD018\uC2A4\uD2B8 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(279, 291, 261, 76);
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uBAAC\uC2A4\uD1302 (2).jpg"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label_2.setBounds(115, 243, 128, 116);
		add(label_2);
		
		JButton button_4 = new JButton("\uBCF4\uC0C1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.rewardQuest
				(
						3,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_4.setBounds(694, 418, 97, 71);
		add(button_4);
		
		JButton button_5 = new JButton("\uC120\uD0DD");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.acceptQuest
				(
						3,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_5.setBounds(580, 418, 97, 71);
		add(button_5);
		
		JLabel label_3 = new JLabel("\uD018\uC2A4\uD2B8 3");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(279, 430, 261, 76);
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uBAAC\uC2A4\uD1303 (2).jpg"));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label_4.setBounds(115, 380, 128, 116);
		add(label_4);
		
		JButton button_6 = new JButton("\uBCF4\uC0C1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.rewardQuest
				(
						4,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_6.setBounds(694, 560, 97, 71);
		add(button_6);
		
		JButton button_7 = new JButton("\uC120\uD0DD");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.acceptQuest
				(
						4,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_7.setBounds(580, 560, 97, 71);
		add(button_7);
		
		JLabel label_5 = new JLabel("\uD018\uC2A4\uD2B8 4");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(279, 570, 261, 76);
		add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uBAAC\uC2A4\uD1304.jpg"));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label_6.setBounds(115, 517, 128, 116);
		add(label_6);
		
		JButton button_8 = new JButton("\uBCF4\uC0C1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.rewardQuest
				(
						5,
						MainController.getMainController().playerController.getPlayerInfo()
				);
				setVisible(false);
				centerPanel.getComponent(2).setVisible(true);
				
			}
		});
		button_8.setBounds(694, 690, 97, 71);
		add(button_8);
		
		JButton button_9 = new JButton("\uC120\uD0DD");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().questController.acceptQuest
				(
						5,
						MainController.getMainController().playerController.getPlayerInfo()
				);
			}
		});
		button_9.setBounds(580, 690, 97, 71);
		add(button_9);
		
		JLabel label_7 = new JLabel("\uD018\uC2A4\uD2B8 5");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(279, 696, 261, 76);
		add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD018\uC2A4\uD2B8_\uBAAC\uC2A4\uD1305.jpg"));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label_8.setBounds(115, 656, 128, 116);
		add(label_8);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Back.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				((MainPanel)(centerPanel.getComponent(0))).update(MainController.getMainController().getPlayerController().getPlayerInfo());
				centerPanel.getComponent(0).setVisible(true);
			}
		});
		btnNewButton_1.setBounds(599, 787, 187, 64);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		lblNewLabel.setBounds(0, -15, 900, 931);
		add(lblNewLabel);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		
	}

}
