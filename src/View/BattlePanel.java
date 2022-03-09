package View;

import javax.swing.JPanel;

import Control.MainController;
import Control.MapController;
import Model.Monster.Monster;
import Model.Player.PlayerInfo;
import Model.Soldier.Soldier;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class BattlePanel extends BasePanel implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	public LinkedList<JLabel> units ;
	public LinkedList<JLabel> units_pre;
	public int num_units;
	public JPanel panel ;

	public JLabel warrior;
	public JLabel archer;
	public JLabel wizard;
	
	public JLabel myHP ;
	public JLabel enemyHP; 
	
	public JButton skill;
	
	private Thread displayTH;
	/**
	 * Create the panel.
	 */
	public BattlePanel(JPanel centerPanel) {

	
		
		super(MainController.getMainController().getPlayerController());
		MainController.getMainController().getPlayerController().add(this);
		this.centerPanel = centerPanel;
//		units = new LinkedList<JLabel>();
//		JLabel temp;
//		for(int i = 0 ; i < 25; i ++) {
//			temp = new JLabel();
//			temp.setText("");
//			temp.setVisible(false);
//			units.add(temp);
//		}

	}
	
	public void display() {
		displayTH = new Thread(this);
		displayTH.start();
	}
	
	
	public void run() {
		MapController mc = MainController.getMainController().getMapController();
		LinkedList<LinkedList<Soldier>> myLine =mc.mapManager.myLine;
		LinkedList<LinkedList<Monster>> enemyLine =mc.mapManager.enemyLine;
		while(mc.mapManager.terminate()!=true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			warrior.setText(String.valueOf(mc.mapManager.getWarrior()));
			archer.setText(String.valueOf( mc.mapManager.getArcher()));
			wizard.setText(String.valueOf(mc.mapManager.getWizard()));
			skill.setText(mc.mapManager.getSkill());
			myHP.setText(String.valueOf(mc.mapManager.getCurrentMap().getMyHP()));
			enemyHP.setText(String.valueOf(mc.mapManager.getCurrentMap().getEnemyHP()));
			
			for(int i =0 ; i <3;i++) {
				for(int j= 0 ; j <myLine.get(i).size();j++) {
					switch (myLine.get(i).get(j).tag) {
					case 1:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uAC80\uC0AC.jpg"));
						break;
					case 2:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uAD81\uC218.jpg"));
						break;
						
					case 3:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uB9C8\uBC95\uC0AC.jpg"));
						break; 

					default:
						break;
					}
					units.get(num_units).setLocation(myLine.get(i).get(j).location,(i)*170+80);
					num_units++;
				}
				
				for(int j= 0 ; j <enemyLine.get(i).size();j++) {
					switch (enemyLine.get(i).get(j).tag) {
					case 1:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uBAAC\uC2A4\uD1301.jpg"));
						break;
					case 2:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uBAAC\uC2A4\uD1302.jpg"));
						
						break;
						
					case 3:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uBAAC\uC2A4\uD1303.jpg"));
						break; 
					case 4:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uBAAC\uC2A4\uD1304.jpg"));
						break;
					case 5:
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uBAAC\uC2A4\uD1305.jpg"));
						break;
					case 6:
						units.get(num_units).setSize(128, 188);
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uC900\uAC04\uBCF4\uC218_125_188.jpg"));
						break;
					case 7:
						units.get(num_units).setSize(150, 195);
						units.get(num_units).setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uC804\uD22C_\uCD5C\uC885\uBCF4\uC2A4_123_195.jpg"));
						break;
					default:
						break;
					}
					units.get(num_units).setLocation(enemyLine.get(i).get(j).location,(i)*170+80);
					num_units++;
				}
			}
			
			for(int i = 0 ; i <units.size();i++) {
				units.get(i).setVisible(false);
			}
			
			for(int i = 0 ; i <num_units;i++) {
				units.get(i).setVisible(true);
			}
			num_units=0;
		}
		
		
		
		MainController.getMainController().getMapController().ClearLine();

		for(JLabel lb : units) {
			lb.setIcon(null);
		}
//		initComponent();

		this.setVisible(false);

		centerPanel.getComponent(0).setVisible(true);
	}

	@Override
	public void update(PlayerInfo playerinfo) {
		// TODO Auto-generated method stub
		
	}
	public void resetLable() {
		
	}
	
	public void initComponent() {
		this.setBounds(30,30,900,900);
		setLayout(null);
		
		if(units!=null) {
		}
		
		panel = new JPanel();
		panel.setBounds(36, 97, 817, 573);
		add(panel);


		units = new LinkedList<JLabel>();
		JLabel temp;
		for(int i = 0 ; i < 25; i ++) {
			temp = new JLabel();
			temp.setText("");
			temp.setVisible(false);
			temp.setSize(50, 75);
			units.add(temp);
			panel.add(temp);
		}

		
		JButton button_1 = new JButton("\uC804\uC0AC");
		button_1.setBounds(12, 64, 83, 34);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().makeSoldier(0,"Warrior");
			}
		});
		panel.setLayout(null);
		button_1.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_1);
		
		JButton button_2 = new JButton("\uB9C8\uBC95\uC0AC");
		button_2.setBounds(12, 151, 83, 34);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(0,"Wizard");
			}
		});
		button_2.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_2);
		
		JButton button_3 = new JButton("\uAD81\uC218");
		button_3.setBounds(12, 107, 83, 34);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(0,"Archer");
			}
		});
		button_3.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_3);
		
		JButton button_4 = new JButton("\uC804\uC0AC");
		button_4.setBounds(12, 233, 83, 34);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(1,"Warrior");
			}
		});
		button_4.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_4);
		
		JButton button_5 = new JButton("\uAD81\uC218");
		button_5.setBounds(12, 280, 83, 34);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(1,"Archer");
			}
		});
		button_5.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_5);
		
		JButton button_6 = new JButton("\uB9C8\uBC95\uC0AC");
		button_6.setBounds(12, 330, 83, 34);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(1,"Wizard");
			}
		});
		button_6.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_6);
		
		JButton button_7 = new JButton("\uC804\uC0AC");
		button_7.setBounds(12, 410, 83, 34);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(2,"Warrior");
			}
		});
		button_7.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_7);
		
		JButton button_8 = new JButton("\uAD81\uC218");
		button_8.setBounds(12, 454, 83, 34);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(2,"Archer");
			}
		});
		button_8.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_8);
		
		JButton button_9 = new JButton("\uB9C8\uBC95\uC0AC");
		button_9.setBounds(12, 498, 83, 34);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainController.getMainController().getMapController().makeSoldier(2,"Wizard");
			}
		});
		button_9.setFont(new Font("경기천년바탕 Bold", Font.PLAIN, 15));
		panel.add(button_9);
		
		JLabel lblMyHp = new JLabel("\uB0B4 HP");
		lblMyHp.setBounds(91, 10, 83, 44);
		lblMyHp.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		lblMyHp.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblMyHp);
		
		myHP = new JLabel("");
		myHP.setBounds(178, 10, 47, 44);
		myHP.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		myHP.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(myHP);
		
		enemyHP = new JLabel("");
		enemyHP.setBounds(676, 10, 47, 44);
		enemyHP.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		enemyHP.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(enemyHP);
		
		JLabel lblHp = new JLabel("\uC801 HP");
		lblHp.setBounds(589, 10, 83, 44);
		lblHp.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		lblHp.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblHp);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 817, 573);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\\uBC30\uD2C0_\uBC30\uACBD1.jpg"));
		
		JLabel label = new JLabel("\uB9C8\uBC95\uC0AC \uC218");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(60, 810, 56, 33);
		add(label);
		
		JButton button_10 = new JButton("\uB0A0\uC528\uBC14\uAFB8\uAE30");
		button_10.setBounds(398, 718, 145, 68);
		add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		wizard = new JLabel("\uC22B\uC790");
		wizard.setHorizontalAlignment(SwingConstants.CENTER);
		wizard.setBounds(140, 810, 56, 33);
		add(wizard);
		
		archer= new JLabel("\uC22B\uC790");
		archer.setHorizontalAlignment(SwingConstants.CENTER);
		archer.setBounds(140, 765, 56, 33);
		add(archer);
		
		JLabel label_3 = new JLabel("\uAD81\uC0AC \uC218");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(60, 765, 56, 33);
		add(label_3);
		
		JLabel label_4 = new JLabel("\uC804\uC0AC \uC218");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(60, 718, 56, 33);
		add(label_4);
		
		warrior = new JLabel("\uC22B\uC790");
		warrior.setHorizontalAlignment(SwingConstants.CENTER);
		warrior.setBounds(140, 718, 56, 33);
		add(warrior);
		
		skill= new JButton("");
		skill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getMainController().getMapController().Skill();
			}
		});
		skill.setBounds(225, 718, 136, 68);
		add(skill);
		
		JLabel label_6 = new JLabel("\uB098\uC758 \uAD70\uC0AC\uC218");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(60, 680, 136, 28);
		add(label_6);
		

		
		JLabel label_9 = new JLabel("\uD604\uC7AC \uB0A0\uC528");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("굴림", Font.PLAIN, 30));
		label_9.setBounds(259, 12, 136, 75);
		add(label_9);
		
		JLabel label_1 = new JLabel("\uC2A4\uD0AC");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(225, 680, 136, 28);
		add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AndrewLee\\Desktop\\Java\\heromaker\\img\\Main.jpg"));
		lblNewLabel.setBounds(0, -30, 929, 955);
		add(lblNewLabel);
	}
}
