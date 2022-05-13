package Game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import test.Main;


class Start extends JFrame{
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();

    
	Start() {
		JButton startBtn = new JButton(startButtonImage);
		JButton quitBtn = new JButton(quitButtonImage);
        MyPanel MainPanel = new MyPanel();
		
        setTitle("2 Weeks");
        //������ ����
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setLocationRelativeTo(null); //�������� ȭ�� �߰��� ���� ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //�����г�
        add(MainPanel);
        MainPanel.setLayout(null);
        MainPanel.add(startBtn);
        MainPanel.add(quitBtn);
        
        // �����ϱ� ��ư
        startBtn.setBounds(200,500,400,100);
        startBtn.setBorderPainted(false);
        startBtn.setContentAreaFilled(false);
        startBtn.setFocusPainted(false);
        startBtn.setVisible(true);
        startBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startBtn.setIcon(startButtonEnteredImage);
				startBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startBtn.setIcon(startButtonImage);
				startBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startBtn.setVisible(false);
				quitBtn.setVisible(false);
				/* ���� ȭ�� ��ȯ */
			}
		});
		
		//�����ϱ� ��ư
		quitBtn.setBounds(700,500,400,100);
		quitBtn.setBorderPainted(false); //��ư �ܰ���X
		quitBtn.setContentAreaFilled(false); // ���뿵�� ä����X
		quitBtn.setFocusPainted(false); // ���õ��� �� �׵θ�X
		quitBtn.setOpaque(false);
		
		quitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitBtn.setIcon(quitButtonEnteredImage);
				quitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitBtn.setIcon(quitButtonImage);
				quitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
        
    }

	class MyPanel extends JPanel{
     
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(introBackground, 0, 0, null);
        }
    }
}

public class Page1_Strat {

	public static void main(String[] args) {
		new Start();
	}

}
