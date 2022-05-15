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
   
   public JButton quit() {
	      // �����ϱ� ��ư
	      quitBtn.setBounds(700,500,400,100);
	      quitBtn.setBorderPainted(false); //��ư �ܰ���X
	      quitBtn.setContentAreaFilled(false); // ���뿵�� ä����X
	      quitBtn.setFocusPainted(false); // ���õ��� �� �׵θ�X
	      quitBtn.setVisible(true);
	      
	      // �����ư �̺�Ʈ
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
	        return quitBtn;
	   }
   
   public JButton start() {
        // �����ϱ� ��ư
        startBtn.setBounds(200,500,400,100);
        startBtn.setBorderPainted(false);
        startBtn.setContentAreaFilled(false);
        startBtn.setFocusPainted(false);
        startBtn.setVisible(true);
        // ���۹�ư �̺�Ʈ
        startBtn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
        	// ��ư�� Ŀ�� �÷��� �� �̺�Ʈ
            startBtn.setIcon(startButtonEnteredImage);
            startBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         }
         @Override
         public void mouseExited(MouseEvent e) {
        	// ��ư���� ������ �� �̺�Ʈ
            startBtn.setIcon(startButtonImage);
            startBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         @Override
         public void mousePressed(MouseEvent e) {
        	// �����ϱ� ��ư ������ �� 
        	// ���� ȭ������ ��ȯ�Ǿ�� �ϹǷ� ���� ��ư�� ����
            startBtn.setVisible(false);
            quitBtn.setVisible(false);
            
            // ���� ��ư ������ next Ŭ�������� ��ư ��������
            // ���� new Ŭ������(). �Լ���();
            Game.mainPanel.add(new Page2().next());
            Game.mainPanel.add(new Page2().text());
            // ���� ������ ��� ȭ�� ���� Game.mainPanel.pageBackground = ��溯����;
            Game.mainPanel.pageBackground = aisleBackground;
         }
      });
        return startBtn;
       
   }
   
   
}