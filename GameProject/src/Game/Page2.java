package Game;

import java.awt.Color;

import javax.swing.JPanel;

public class Page2 extends JPanel{

	public Page2() {
		init();
	}
	
	public void init() {
		JPanel page2MainPanel = new JPanel();
		JPanel page2TopPanel = new JPanel();
		JPanel page2BottomPanel = new JPanel();
		page2MainPanel.setBackground(new Color(0,0,0)); 
		add(page2MainPanel);
		page2MainPanel.add(page2TopPanel);
		page2MainPanel.add(page2BottomPanel);
		
	}
	
}
