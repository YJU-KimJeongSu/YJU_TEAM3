package Game;

import java.awt.*;
import javax.swing.*;

// 메인 클래스에서 프레임과 메인될 패널 생성
public class Main {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public static void main(String[] args) {	
		new Game();
	}
}
	// 메인으로 돌아갈 프레임 Game 클래스
	class Game extends JFrame {
		static MyPanel mainPanel = new MyPanel(); 
		
		// 메인으로 돌아갈 프레임의 생성자
		Game() {
			// 프레임 설정   
			setTitle("2 Weeks");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        
	        // 메인패널
	        add(mainPanel);
	        mainPanel.setLayout(null);  
	        // 메인패널에 시작, 종료 버튼 추가
	        // 사용법 new 클래스명().함수명();
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