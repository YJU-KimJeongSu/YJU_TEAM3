package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.CardLayout;

public class testpage1 {

	private JFrame frame;
	private ImageIcon nextButtonImage=new ImageIcon(testpage1.class.getResource("/images/nextButton.png"));
	private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testpage1 window = new testpage1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testpage1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		JPanel page2MainPanel = new JPanel();
		JPanel page2TextPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) page2TextPanel.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setHgap(630);
		page2TextPanel.setBounds(257, 78, 789, 595);
		
		frame.getContentPane().add(page2MainPanel);
		page2MainPanel.setBounds(0, 0,  1266, 683);
		page2MainPanel.setBackground(Color.LIGHT_GRAY);
		page2MainPanel.add(page2TextPanel);
		
		JPanel page2TopPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) page2TopPanel.getLayout();
		flowLayout_1.setVgap(300);
		flowLayout_1.setHgap(450);
		page2TopPanel.setBounds(0, 0, 1266, 71);
		page2MainPanel.add(page2TopPanel);
		
		
		JPanel page2NextBtPanel = new JPanel();
		page2NextBtPanel.setBounds(1123, 580, 106, 82);
		page2MainPanel.add(page2NextBtPanel);

		
		JButton nextButton = new JButton(nextButtonImage);
		nextButton.setBounds(5, 5, 96, 72);
		page2NextBtPanel.add(nextButton);
		page2NextBtPanel.setSize(200,100);
		page2NextBtPanel.setLocation(200,100);
		
		nextButton.setIcon(nextButtonImage);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
	
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				NextButton.setVisible(false);
//				panel = new Page2(); // 다음 페이지로 이동
//				frame.getContentPane().add(panel);
//				setVisible(false); 	
//		}
			
		});
	}
}
