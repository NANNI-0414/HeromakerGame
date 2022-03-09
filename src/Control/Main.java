package Control;

import View.MainFrame;

public class Main {
	public static void main(String[] args) {
		MainController maincontroller= new MainController();
		new MainFrame(maincontroller);
	}
}
