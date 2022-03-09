package View;

import javax.swing.JPanel;

import Control.MainController;
import Model.Player.PlayerInfo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class EndingPanel extends BasePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	
	
	public EndingPanel(JPanel centerPanel) {

		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.setCenterPanel(centerPanel);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void initComponent() {
		this.setBounds(30,30,900,900);
		setLayout(null);
		
		JLabel label_6 = new JLabel("\uB2F9\uC2E0\uC740 \uC804\uC124\uC758 \uC601\uC6C5\uC785\uB2C8\uB2E4!!! ");
		label_6.setBounds(143, 82, 647, 75);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("경기천년제목V Bold", Font.BOLD, 40));
		add(label_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC5D4\uB529 \uC0AC\uC9C4.jpg"));
		lblNewLabel.setBounds(0, -44, 1030, 978);
		add(lblNewLabel);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

}
