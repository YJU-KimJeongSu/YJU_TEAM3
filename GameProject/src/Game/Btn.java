package Game;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Btn extends JPanel{
   private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
   private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
   private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
   private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
   
   
   JButton startBtn = new JButton(startButtonImage);
   JButton quitBtn = new JButton(quitButtonImage);
   
   public JButton start() {
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
        return startBtn;
        
   }public JButton quit() {
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
      
        return quitBtn;
   }
}