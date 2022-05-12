package Game;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class Page1 extends JFrame {
	private Page2 panel;
	private JFrame frame;
	
	// ������ ����
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1 window = new Page1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// �̹��� ��Ƶα�
	private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon titleImage= new ImageIcon(Main.class.getResource("../images/title.png"));
	//private ImageIcon introBackground= new ImageIcon(Main.class.getResource("../images/introBackground.png"));
	//private Image titleImage = new ImageIcon(Main.class.getResource("../images/title.png")).getImage();
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();

	
	// ������
	public Page1() {
		gameStart();
	}
	

	private void gameStart() {
		frame = new JFrame();
		frame.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("2 Weeks");
		
		JPanel page1MainPanel = new JPanel() {
//			public void paint(Graphics g) { // ���ȭ�� ���� �Լ�
//				g.drawImage(introBackground, 0, 0, null);//background�� �׷���
//				setOpaque(true);
//			}
		};
		JPanel page1TitlePanel = new JPanel();
		JPanel page1SelectPanel = new JPanel();
		
		JLabel title = new JLabel(titleImage);
		JButton startButton = new JButton(startButtonBasicImage);
		JButton quitButton = new JButton(quitButtonBasicImage);
		
		
		//������1 ���� �г�
		page1MainPanel.setBounds(0, 0, 1266, 683);
		page1MainPanel.setBackground(new Color(0,0,0)); 
		frame.getContentPane().add(page1MainPanel);
	
		
		//������1 �����̹��� �� �κ�
		page1TitlePanel.setBounds(0, 0, 1266, 513);
		page1MainPanel.add(page1TitlePanel);
	
		page1TitlePanel.setOpaque(true); // ��� �����ϰ�
		page1TitlePanel.setBackground(new Color(0,0,0,0)); // ��� �����ϰ�
		page1TitlePanel.add(title);
		
		
		//������1 ���� ���� ������ �κ�
		page1SelectPanel.setBounds(0, 200, 1266, 250);
		page1SelectPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); 
		page1SelectPanel.setOpaque(true); // ��� �����ϰ�
		page1SelectPanel.setBackground(new Color(0,0,0)); // ��� �����ϰ�
		page1MainPanel.add(page1SelectPanel, BorderLayout.SOUTH); //�� ���̾ƿ��� ��ġ
		

		//���۹�ư
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		
		page1SelectPanel.add(startButton);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);
				quitButton.setVisible(false);
				panel = new Page2(); // ���� �������� �̵�
				frame.getContentPane().add(panel);
				setVisible(false); 	
		}
			
		});
		
		//�����ư
		
		quitButton.setBorderPainted(false); //��ư �ܰ���X
		quitButton.setContentAreaFilled(false); // ���뿵�� ä����X
		quitButton.setFocusPainted(false); // ���õ��� �� �׵θ�X
		quitButton.setOpaque(false);
		
		page1SelectPanel.add(quitButton);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		frame.setVisible(true);
	}
}

