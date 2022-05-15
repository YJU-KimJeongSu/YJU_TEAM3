package Game;

import java.awt.*;
import javax.swing.*;

// ���� Ŭ�������� �����Ӱ� ���ε� �г� ����
public class Main {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public static void main(String[] args) {	
		new Game();
	}
}
	// �������� ���ư� ������ Game Ŭ����
	class Game extends JFrame {
		static MyPanel mainPanel = new MyPanel(); 
		
		// �������� ���ư� �������� ������
		Game() {
			// ������ ����   
			setTitle("2 Weeks");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        
	        // �����г�
	        add(mainPanel);
	        mainPanel.setLayout(null);  
	        // �����гο� ����, ���� ��ư �߰�
	        // ���� new Ŭ������().�Լ���();
	        mainPanel.add(new Page1().start()); 
	        mainPanel.add(new Page1().quit()); 
	   }
	 }
		class MyPanel extends JPanel{
			// �гο� ��ϵ� ���ȭ��
			public static Image pageBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();
		
		    public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(pageBackground, 0, 0, this);
		        this.repaint();
		        this.revalidate();
		    }
	
	}