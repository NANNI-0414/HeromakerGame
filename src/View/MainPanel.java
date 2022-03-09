package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainPanel extends BasePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	JLabel myTitle;
	JLabel myStatus ;
	/**
	 * Create the panel.
	 */
	public MainPanel(JPanel centerPanel) {
		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel =centerPanel;
	}


	public void initComponent() {
		this.setBounds(30, 30, 900, 900);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(164, 171, 98, 147);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\NPC.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				centerPanel.getComponent(5).setVisible(true);
			}
		});
		setLayout(null);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC0C1\uC8101.jpg"));
		btnNewButton_1.setBounds(380, 171, 98, 147);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				((StorePanel)(centerPanel.getComponent(6))).update(MainController.getMainController().getPlayerController().getPlayerInfo());
				centerPanel.getComponent(6).setVisible(true);
			}
		});
		add(btnNewButton_1);

		JButton btnMap = new JButton("");
		btnMap.setBounds(576, 171, 106, 147);
		btnMap.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uBC30\uD2C01.jpg"));
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				centerPanel.getComponent(4).setVisible(true);
			}
		});
		add(btnMap);

		JButton btnInfomationm = new JButton("");
		btnInfomationm.setBounds(380, 368, 98, 147);
		btnInfomationm.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC815\uBCF41.jpg"));
		btnInfomationm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				((InfoPanel) centerPanel.getComponent(3))
						.update(MainController.getMainController().getPlayerController().getPlayerInfo());
				centerPanel.getComponent(3).setVisible(true);
			}
		});
		add(btnInfomationm);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(454, 171, 1, 1);
		add(verticalBox);
		
		myTitle = new JLabel("\uACAC\uC2B5\uAE30\uC0AC");
		myTitle.setForeground(Color.BLACK);
		myTitle.setBackground(Color.WHITE);
		myTitle.setHorizontalAlignment(SwingConstants.CENTER);
		myTitle.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 45));
		myTitle.setBounds(105, 554, 663, 93);
		add(myTitle);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uD0C0\uC774\uD2C0.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 50));
		label.setBackground(Color.WHITE);
		label.setBounds(50, 45, 718, 93);
		add(label);
		
		myStatus = new JLabel("New label");
		myStatus.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\myPosition.jpg"));
		myStatus.setBounds(130, 717, 56, 73);
		add(myStatus);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Progress.jpg"));
		lblNewLabel.setBounds(134, 751, 561, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uBAA9\uC801\uC9C011.jpg"));
		lblNewLabel_1.setBounds(694, 717, 61, 73);
		add(lblNewLabel_1);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 959, 900);
		add(background);
		background.setHorizontalAlignment(SwingConstants.LEFT);
		background.setBackground(Color.WHITE);
		background.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		this.setVisible(true);
	}

	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		myTitle.setText("당신은 " + playerinfo.getTitle()+ " 입니다.");
		switch (playerinfo.getTitle()) {
		case "견습 기사":
			myStatus.setLocation(130+114*1, 717);
			break;
		case "중급 기사":
			myStatus.setLocation(130+114*2, 717);
			break;
		case "상급 기사":
			myStatus.setLocation(130+114*3, 717);
			break;
		case "최상급 기사":
			myStatus.setLocation(130+114*4, 717);
			break;
		default:
			break;
		}

	}
}
