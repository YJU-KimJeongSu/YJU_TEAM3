package Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Page2 extends JPanel{

	private ImageIcon nextButtonImage=new ImageIcon(test.class.getResource("/images/nextButton.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	
	public Page2() {
		init();
	}
	
	public void init() {
		JPanel mainPanelPage2 = new JPanel();
		JPanel topPanelPage2 = new JPanel();
		JPanel textPanelPage2 = new JPanel();		
		JPanel nextBtPanelPage2 = new JPanel();
		
		JButton nextButton = new JButton(nextButtonImage);
		
		// page2 ���� �г�
		add(mainPanelPage2);
		mainPanelPage2.setBounds(0, 0,  Main.PANEL_WIDTH, Main.PANEL_HEIGHT);
		mainPanelPage2.setBackground(Color.black);
		mainPanelPage2.add(textPanelPage2);
		
		// ��ܹ� �г�
		topPanelPage2.setBounds(0, 0,  Main.PANEL_WIDTH, 70);
		mainPanelPage2.add(topPanelPage2);
		
		// �ؽ�Ʈ �� �г�
		textPanelPage2.setBounds(204, 70, 839, Main.PANEL_HEIGHT-70);
		mainPanelPage2.add(textPanelPage2);
		
		// �ؽ�Ʈ ��ư �г�
		nextBtPanelPage2.setBounds(1123, 580, 106, 82);
		mainPanelPage2.add(nextBtPanelPage2);
		
		// ��ư �гο� ��ư �߰�
		nextButton.setIcon(nextButtonImage);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextBtPanelPage2.add(nextButton);
		
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				NextButton.setVisible(false);
//				panel = new Page2(); // ���� �������� �̵�
//				frame.getContentPane().add(panel);
//				setVisible(false); 	
//		}
			
		});
	}
	
}
