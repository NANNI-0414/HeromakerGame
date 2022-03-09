package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class StorePanel extends BasePanel  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	JLabel Money ;
	/**
	 * Create the panel.
	 */
	public StorePanel(JPanel centerPanel) {

		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel = centerPanel;
	}
	@Override
	protected void initComponent() {

		this.setLayout(null);
		this.setBounds(30,30,900,900);
		
		JButton btnBuy = new JButton("buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().buyWarrior(
						MainController.getMainController().playerController.getPlayerInfo());
				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		btnBuy.setBounds(251, 104, 63, 56);
		add(btnBuy);
		
		JButton btnSell = new JButton("sell");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().sellWarrior(
						MainController.getMainController().playerController.getPlayerInfo());

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uAE30\uC0AC.jpg"));
		lblNewLabel_1.setBounds(56, 63, 173, 149);
		add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uB9C8\uBC95\uC0AC.jpg"));
		label_1.setBounds(59, 558, 173, 149);
		add(label_1);
		
		JLabel label_7 = new JLabel("1");
		label_7.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uB0A0\uC528.jpg"));
		label_7.setBounds(464, 63, 173, 149);
		add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uC544\uC9C1\uC544\uC774\uD15C.jpg"));
		label_8.setBounds(464, 315, 173, 149);
		add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uC544\uC9C1\uC544\uC774\uD15C.jpg"));
		label_9.setBounds(464, 540, 173, 149);
		add(label_9);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC810_\uAD81\uC218.jpg"));
		label.setBounds(56, 310, 173, 149);
		add(label);
		btnSell.setBounds(326, 104, 63, 56);
		add(btnSell);
		
		JLabel lblDescription = new JLabel("\uC804\uC0AC\uC785\uB2C8\uB2E4 100\uC6D0\uC785\uB2C8\uB2F9");
		lblDescription.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		lblDescription.setBounds(56, 221, 360, 56);
		add(lblDescription);
		
		JLabel label_2 = new JLabel("\uAD81\uC218\uC785\uB2C8\uB2E4 200\uC6D0 \uC785\uB2C8\uB2F9");
		label_2.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		label_2.setBounds(56, 476, 360, 54);
		add(label_2);
		
		JButton button = new JButton("buy");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().buyArcher(
						MainController.getMainController().playerController.getPlayerInfo());

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		button.setBounds(244, 361, 63, 56);
		add(button);
		
		JButton button_1 = new JButton("sell");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().sellArcher(	MainController.getMainController().playerController.getPlayerInfo()	);

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		button_1.setBounds(326, 361, 63, 56);
		add(button_1);
		
		JLabel label_3 = new JLabel("\uB9C8\uBC95\uC0AC\uC785\uB2C8\uB2E4 300\uC6D0 \uC785\uB2C8\uB2F9");
		label_3.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		label_3.setBounds(56, 725, 360, 56);
		add(label_3);
		
		JButton button_2 = new JButton("buy");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().buyWizard(
						MainController.getMainController().playerController.getPlayerInfo());

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		button_2.setBounds(244, 605, 63, 56);
		add(button_2);
		
		JButton button_3 = new JButton("sell");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getStoreController().sellWizard(
						MainController.getMainController().playerController.getPlayerInfo()
				);

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		button_3.setBounds(326, 605, 63, 56);
		add(button_3);
		
		JLabel label_4 = new JLabel("\uC544\uC774\uD15C 2");
		label_4.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		label_4.setBounds(464, 710, 287, 56);
		add(label_4);
		
		JButton button_4 = new JButton("buy");
		button_4.setBounds(667, 589, 63, 56);
		add(button_4);
		
		JButton button_5 = new JButton("sell");
		button_5.setBounds(749, 589, 63, 56);
		add(button_5);
		
		JButton button_6 = new JButton("buy");
		button_6.setBounds(667, 361, 63, 56);
		add(button_6);
		
		JButton button_7 = new JButton("sell");
		button_7.setBounds(749, 361, 63, 56);
		add(button_7);
		
		JLabel label_5 = new JLabel("\uC544\uC774\uD15C 1");
		label_5.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		label_5.setBounds(464, 474, 287, 56);
		add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("\uBCF4\uC720 \uC790\uAE08");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("경기천년제목V Bold", Font.BOLD, 40));
		lblNewLabel_2.setBounds(54, 10, 200, 39);
		add(lblNewLabel_2);
		
		Money = new JLabel("");
		Money.setHorizontalAlignment(SwingConstants.CENTER);
		Money.setFont(new Font("경기천년제목V Bold", Font.BOLD, 40));
		Money.setBounds(260, 10, 244, 39);
		add(Money);
		
		JLabel label_6 = new JLabel("\uB0A0\uC528\uC544\uC774\uD15C\uC785\uB2C8\uB2E4 100\uC6D0 \uC785\uB2C8\uB2F9");
		label_6.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		label_6.setBounds(464, 222, 388, 56);
		add(label_6);
		
		JButton button_8 = new JButton("buy");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getStoreController().buyWeatherItem(
						MainController.getMainController().playerController.getPlayerInfo());

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
		});
		button_8.setBounds(667, 104, 63, 56);
		add(button_8);
		
		JButton button_9 = new JButton("sell");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getStoreController().sellWeather(MainController.getMainController().getPlayerController().getPlayerInfo());

				update(MainController.getMainController().getPlayerController().getPlayerInfo());
			}
			
		});
		button_9.setBounds(749, 104, 63, 56);
		add(button_9);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Back.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				centerPanel.getComponent(0).setVisible(true);
			}
		});
		
		btnNewButton.setBounds(655, 766, 187, 64);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		lblNewLabel.setBounds(0, -15, 912, 925);
		add(lblNewLabel);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		Money.setText(String.valueOf(playerinfo.getMoney()));
		
	}
}
