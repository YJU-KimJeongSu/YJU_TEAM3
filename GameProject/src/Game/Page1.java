package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page1 extends JPanel {
	
   private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
   private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
   private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
   private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
   
   private Image aisleBackground = new ImageIcon(Main.class.getResource("../images/aisleBackground.png")).getImage();
   
   JButton startBtn = new JButton(startButtonImage);
   JButton quitBtn = new JButton(quitButtonImage);
   
   Page1(){
	   page1Btn();
   }
   
   public void page1Btn() {
	   //다음장면에 쓸 page2 인스턴스 생성
	   Page2 page2 = new Page2();
	   
	   startBtn.setBounds(200,500,400,100);
       startBtn.setBorderPainted(false);
       startBtn.setContentAreaFilled(false);
       startBtn.setFocusPainted(false);
       startBtn.setVisible(true);
       // 시작버튼 이벤트
       startBtn.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
       	// 버튼에 커서 올렸을 때 이벤트
           startBtn.setIcon(startButtonEnteredImage);
           startBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        @Override
        public void mouseExited(MouseEvent e) {
       	// 버튼에서 나왔을 때 이벤트
           startBtn.setIcon(startButtonImage);
           startBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        @Override
        public void mousePressed(MouseEvent e) {
       	// 시작하기 버튼 눌렀을 때 
       	// 다음 화면으로 전환되어야 하므로 기존 버튼들 숨김
           startBtn.setVisible(false);
           quitBtn.setVisible(false);
           
           // 시작 버튼 누르면 page2 클래스에서 버튼, 텍스트박스 가져오기
           // Game.mainPanel.add(page2인스턴스.JButton이나 JLabel의 변수명)
           Game.mainPanel.add(page2.textBox);
           Game.mainPanel.add(page2.nextBtn);
           // 다음 페이지 배경 화면 변경 Game.mainPanel.pageBackground = 배경변수명;
           Game.mainPanel.pageBackground = aisleBackground;
        }
     });
       
	   	  quitBtn.setBounds(700,500,400,100);
	      quitBtn.setBorderPainted(false); //버튼 외곽선X
	      quitBtn.setContentAreaFilled(false); // 내용영역 채우지X
	      quitBtn.setFocusPainted(false); // 선택됐을 때 테두리X
	      quitBtn.setVisible(true);
	      
	      // 종료버튼 이벤트
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
    
}