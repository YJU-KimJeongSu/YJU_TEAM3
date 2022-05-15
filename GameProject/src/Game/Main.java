package Game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public static void main(String[] args) {	
		new MainJPanel();
	}
}
	// 메인패널 클래스
	class MainJPanel extends JFrame {
		static MyPanel mainPanel = new MyPanel(); 
		
		MainJPanel() {
	       setTitle("2 Weeks");
	       //프레임 설정
	       setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	       setResizable(false);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       setVisible(true);
	        
	       //메인패널
	       add(mainPanel);
	       mainPanel.setLayout(null);  
	       //메인패널에 시작, 종료 버튼 추가
	       //사용법 new 클래스명().함수명();
	       mainPanel.add(new Page1().start()); 
	       mainPanel.add(new Page1().quit()); 
	   }
	 }
		class MyPanel extends JPanel{
			// 패널에 등록될 배경화면
			public static Image pageBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();
		
		    public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(pageBackground, 0, 0, this);
		        this.repaint();
		        this.revalidate();
		    }
	
	}