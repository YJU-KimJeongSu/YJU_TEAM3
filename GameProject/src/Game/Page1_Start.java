package Game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Start extends JFrame{
   public static final int SCREEN_WIDTH = 1280;
   public static final int SCREEN_HEIGHT = 720;
   
   private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();

    
   Start() {
      
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
        Btn test=new Btn();
        MainPanel.add(test.start());
        MainPanel.add(test.quit());
      
    }

   class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(introBackground, 0, 0, null);
        }
    }
}

public class Page1_Start {

   public static void main(String[] args) {
      new Start();
   }

}