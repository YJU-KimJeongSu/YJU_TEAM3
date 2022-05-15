package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page2 extends JPanel{
	 private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	 private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	 private ImageIcon textBoxImage = new ImageIcon(Main.class.getResource("../images/textBox.png"));

	 JButton nextBtn = new JButton(nextButtonImage);
	 JLabel textBox = new JLabel();
	 
	 
	 Page2(){
		 page2Btn();
		 page2Text();
	 }
	 
	//다음 버튼
	 public void page2Btn() {
		 nextBtn.setVisible(true);
		 nextBtn.setBounds(1000,500,200,100);
	     nextBtn.setBorderPainted(false); 
	     nextBtn.setContentAreaFilled(false); 
	     nextBtn.setFocusPainted(false); 
	      
	     nextBtn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 nextBtn.setIcon(nextButtonEnteredImage);
	        	 nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	nextBtn.setIcon(nextButtonImage);
	            nextBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	nextBtn.setVisible(false);
	        	textBox.setVisible(false);
	           /* 다음 화면 전환 추가 예정 */
	         }
	      });
	 }
	 
	 // 텍스트박스
	 public void page2Text() {
		// 폰트 속성 추가 변수
		 Font myFont1 = new Font("Serif", Font.BOLD, 18);
		 
		 // html처럼 사용해서 줄바꿈, 중앙정렬 가능
		 String test = "<html><body style='text-align:center;'>글자 잘나오는 지 테스트 중"
		 		+ "<br> html 구문 써야 줄바꿈 되는군!"
		 		+ "<br> JAVA Team3 game project </body></html>";
		 
		 textBox.setVisible(true);
		 textBox.setBounds(300,100,700,500);
		 textBox.setIcon(textBoxImage); // 텍스트 박스의 이미지
		 textBox.setText(test); // 텍스트 박스에 들어갈 내용
		 textBox.setFont(myFont1); // 텍스트 폰트 변경
		 
		 // 텍스트 위치 조정
		 textBox.setHorizontalTextPosition(JLabel.CENTER);
		 textBox.setVerticalTextPosition(JLabel.CENTER);
	 }
	 
}
