package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����page1 extends JFrame {

	public JFrame frame;
	
	// ������ ����
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����page1 window = new ����page1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// �̹��� ��Ƶα�
	private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon titleImage= new ImageIcon(Main.class.getResource("../images/title.png"));
	//private ImageIcon introBackground= new ImageIcon(Main.class.getResource("../images/introBackground.png"));
	//private Image titleImage = new ImageIcon(Main.class.getResource("../images/title.png")).getImage();
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();

	
	// ������
	public ����page1() {
		/*
		 * super("2 Weeks");
		JPanel panel1= new JPanel();
		JButton startBtn = new JButton(startButtonImage);
		JButton quitBtn = new JButton(quitButtonImage);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		panel1.add(startBtn);
		panel1.add(quitBtn);
		add(panel1);
		
		setVisible(true);
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Page2();
				setVisible(false);
			}
		});*/
		
		gameStart();
	}
	
	private void gameStart() {
		frame = new JFrame();
		frame.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);
		frame.setTitle("2 Weeks");
		
		
		JPanel mainPanelPage1 = new JPanel() {
			 public void paint(Graphics g) { // ���ȭ�� ���� �Լ�
				g.drawImage(introBackground, 0, 0, null);//background�� �׷���
				setOpaque(true);
			} 
		};
		frame.setVisible(true);
		JPanel titlePanelPage1 = new JPanel();
		JLabel title = new JLabel(titleImage);
		JPanel selectPanelPage1 = new JPanel();
		
		JButton startButton = new JButton(startButtonImage);
		JButton quitButton = new JButton(quitButtonImage);
		
		
		//������1 ���� �г�
		mainPanelPage1.setBounds(0, 0, Main.PANEL_WIDTH, Main.PANEL_HEIGHT);
		mainPanelPage1.setBackground(new Color(0,0,0)); 
		frame.getContentPane().add(mainPanelPage1);
		
		
//		//������1 �����̹��� �� �κ�
//		titlePanelPage1.setBounds(0, 0, Main.PANEL_WIDTH, 513);
//		mainPanelPage1.add(titlePanelPage1);
//		titlePanelPage1.setOpaque(false); // ��� �����ϰ�
//		titlePanelPage1.setBackground(new Color(0,0,0,0)); // ��� �����ϰ�
//		titlePanelPage1.add(title);
//		
//		
		//������1 ���� ���� ������ �κ�
		selectPanelPage1.setBounds(0, 200,  Main.PANEL_WIDTH, 250);
		selectPanelPage1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); 
		//selectPanelPage1.setOpaque(false); // ��� �����ϰ�
		selectPanelPage1.setBackground(new Color(0,0,0)); // ��� �����ϰ�
		mainPanelPage1.add(selectPanelPage1, BorderLayout.SOUTH); //�� ���̾ƿ��� ��ġ
		

		//���۹�ư
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.setVisible(true);
		mainPanelPage1.add(startButton);
		
		startButton.setIcon(startButtonImage);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);
				quitButton.setVisible(false);
				
			
				testpage2 panel = new testpage2(); // ���� �������� �̵�
				System.out.println(panel);
				frame.getContentPane().add(panel);
			}
		});
		
		//�����ư
		quitButton.setBorderPainted(false); //��ư �ܰ���X
		quitButton.setContentAreaFilled(false); // ���뿵�� ä����X
		quitButton.setFocusPainted(false); // ���õ��� �� �׵θ�X
		quitButton.setOpaque(false);
		
		
		mainPanelPage1.add(quitButton);
		quitButton.setVisible(true);
		quitButton.setIcon(quitButtonImage);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
				
	}
}

