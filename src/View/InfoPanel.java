package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class InfoPanel extends BasePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private JPanel centerPanel;
	
	private JLabel title;
	private JLabel money;
	private JLabel warrior;
	private JLabel wizard;
	private JLabel archer;
	private JLabel quest;
	private JLabel skill;

	private JLabel weather;
	
	/**
	 * Create the panel.
	 */
	public InfoPanel(JPanel centerPanel) {

		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel = centerPanel;
	}
	
	
	@Override
	public void update(PlayerInfo playerinfo) {
		title.setText(playerinfo.getTitle());
		money.setText(String.valueOf(playerinfo.getMoney()));
		warrior.setText(String.valueOf(playerinfo.getWarrior()));
		archer.setText(String.valueOf(playerinfo.getArcher()));
		wizard.setText(String.valueOf(playerinfo.getWizard()));
		quest.setText(String.valueOf(playerinfo.getQuestProgress()));
		weather.setText(String.valueOf(playerinfo.getWeatherItem() ));
		skill.setText((playerinfo.getStrategyInfo()));
	}
	
	
	@Override
	protected void initComponent() {
		
		this.setLayout(null);
		this.setBounds(30,30,900,900);

		title = new JLabel("Contents");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("±º∏≤", Font.BOLD, 20));
		title.setBounds(483, 206, 105, 40);
		add(title);

		money = new JLabel("Contents");
		money.setHorizontalAlignment(SwingConstants.CENTER);
		money.setFont(new Font("±º∏≤", Font.BOLD, 20));
		money.setBounds(483, 275, 105, 40);
		add(money);
		
		warrior = new JLabel("Contents");
		warrior.setHorizontalAlignment(SwingConstants.CENTER);
		warrior.setFont(new Font("±º∏≤", Font.BOLD, 20));
		warrior.setBounds(483, 344, 105, 40);
		add(warrior);
		
		archer = new JLabel("Contents");
		archer.setHorizontalAlignment(SwingConstants.CENTER);
		archer.setFont(new Font("±º∏≤", Font.BOLD, 20));
		archer.setBounds(483, 407, 105, 40);
		add(archer);
		
		wizard = new JLabel("Contents");
		wizard.setHorizontalAlignment(SwingConstants.CENTER);
		wizard.setFont(new Font("±º∏≤", Font.BOLD, 20));
		wizard.setBounds(483, 470, 105, 40);
		add(wizard);
		

		quest = new JLabel("Contents");
		quest.setHorizontalAlignment(SwingConstants.CENTER);
		quest.setFont(new Font("±º∏≤", Font.BOLD, 20));
		quest.setBounds(483, 651, 105, 40);
		add(quest);
		
		skill = new JLabel("Contents");
		skill.setHorizontalAlignment(SwingConstants.LEFT);
		skill.setFont(new Font("±º∏≤", Font.BOLD, 20));
		skill.setBounds(483, 588, 207, 40);
		add(skill);

		weather = new JLabel("Contents");
		weather.setHorizontalAlignment(SwingConstants.CENTER);
		weather.setFont(new Font("±º∏≤", Font.BOLD, 20));
		weather.setBounds(483, 526, 105, 40);
		add(weather);
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9\uC790 \uC815\uBCF4");
		lblNewLabel.setFont(new Font("∞Ê±‚√µ≥‚¡¶∏ÒV Bold", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 50, 715, 110);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCE6D\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lblNewLabel_1.setBounds(235, 206, 215, 40);
		add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uB3C8");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label.setBounds(235, 275, 215, 40);
		add(label);
		
		JLabel label_2 = new JLabel("\uC804\uC0AC \uC218");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_2.setBounds(235, 344, 215, 40);
		add(label_2);

		JLabel label_4 = new JLabel("\uAD81\uC218 \uC218");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_4.setBounds(235, 407, 215, 40);
		add(label_4);

		JLabel label_6 = new JLabel("\uB9C8\uBC95\uC0AC \uC218");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_6.setBounds(235, 470, 215, 40);
		add(label_6);
		
		JLabel label_8 = new JLabel("\uD604\uC7AC \uD018\uC2A4\uD2B8");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_8.setBounds(235, 651, 215, 40);
		add(label_8);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Back.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				centerPanel.getComponent(0).setVisible(true);
			}
		});
		btnNewButton.setBounds(648, 755, 187, 64);
		add(btnNewButton);
		
		JLabel label_3 = new JLabel("\uB0A0\uC528 \uC544\uC774\uD15C");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_3.setBounds(235, 526, 215, 40);
		add(label_3);
		
		JLabel label_9 = new JLabel("\uD604\uC7AC \uC2A4\uD0AC");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("±º∏≤", Font.BOLD, 30));
		label_9.setBounds(235, 588, 215, 40);
		add(label_9);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		lblNewLabel_2.setBounds(0, 0, 900, 900);
		add(lblNewLabel_2);
	}
}
