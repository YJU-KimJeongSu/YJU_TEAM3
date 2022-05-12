package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page1 extends JFrame {
	private Page2 panel;
	private JFrame frame;
	
	// 윈도우 빌더
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
	
	// 이미지 모아두기
	private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon titleImage= new ImageIcon(Main.class.getResource("../images/title.png"));
	//private ImageIcon introBackground= new ImageIcon(Main.class.getResource("../images/introBackground.png"));
	//private Image titleImage = new ImageIcon(Main.class.getResource("../images/title.png")).getImage();
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();

	
	// 생성자
	public Page1() {
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
//			public void paint(Graphics g) { // 배경화면 설정 함수
//				g.drawImage(introBackground, 0, 0, null);//background를 그려줌
//				setOpaque(true);
//			}
		};
		JPanel titlePanelPage1 = new JPanel();
		JPanel selectPanelPage1 = new JPanel();
		
		JLabel title = new JLabel(titleImage);
		JButton startButton = new JButton(startButtonImage);
		JButton quitButton = new JButton(quitButtonImage);
		
		
		//페이지1 메인 패널
		mainPanelPage1.setBounds(0, 0, Main.PANEL_WIDTH, Main.PANEL_HEIGHT);
		mainPanelPage1.setBackground(new Color(0,0,0)); 
		frame.getContentPane().add(mainPanelPage1);
	
		
		//페이지1 제목이미지 들어갈 부분
		titlePanelPage1.setBounds(0, 0, Main.PANEL_WIDTH, 513);
		mainPanelPage1.add(titlePanelPage1);
	
		titlePanelPage1.setOpaque(true); // 배경 투명하게
		titlePanelPage1.setBackground(new Color(0,0,0,0)); // 배경 투명하게
		titlePanelPage1.add(title);
		
		
		//페이지1 시작 종료 선택할 부분
		selectPanelPage1.setBounds(0, 200,  Main.PANEL_WIDTH, 250);
		selectPanelPage1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); 
		selectPanelPage1.setOpaque(true); // 배경 투명하게
		selectPanelPage1.setBackground(new Color(0,0,0)); // 배경 투명하게
		mainPanelPage1.add(selectPanelPage1, BorderLayout.SOUTH); //밑 레이아웃에 위치
		

		//시작버튼
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		
		selectPanelPage1.add(startButton);
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
				
				mainPanelPage1.setVisible(false); 
				
				panel = new Page2(); // 다음 페이지로 이동
				frame.getContentPane().add(panel);
		}
			
		});
		
		//종료버튼
		quitButton.setBorderPainted(false); //버튼 외곽선X
		quitButton.setContentAreaFilled(false); // 내용영역 채우지X
		quitButton.setFocusPainted(false); // 선택됐을 때 테두리X
		quitButton.setOpaque(false);
		
		selectPanelPage1.add(quitButton);
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
		
		
		frame.setVisible(true);
	}
}

