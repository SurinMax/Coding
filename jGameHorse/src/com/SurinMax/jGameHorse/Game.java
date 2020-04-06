package com.SurinMax.jGameHorse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Game extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame jFrame;
	private JPanel jPanel;
	private JMenuBar jMenuBar;
	private JMenu jMenuGame;
	private JMenu jMenuExit;
	private JMenuItem jMenuItem5;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItemExit;
	private JMenuItem jMenuItemExitProgram;
	GameHorse5 gameHorse5;
	private boolean startGame = false;
	
	public Game() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jFrame = new JFrame();
		jPanel = new JPanel();
		jFrame.add(jPanel);
		jMenuBar = new JMenuBar();
		jMenuBar.add(createMenuGame());
		jMenuBar.add(createMenuExit());
		setJMenuBar(jMenuBar);
	}
	
	private JMenu createMenuGame() {
		jMenuGame = new JMenu("Game");
		jMenuItem5 = new JMenuItem("Game 5x5");
		jMenuItem8 = new JMenuItem("Game 8x8");
		jMenuGame.add(jMenuItem5);
		jMenuGame.add(jMenuItem8);
		jMenuItem5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!startGame) {
					gameHorse5 = new GameHorse5();
					jPanel = gameHorse5.windowBuilder(jPanel);
					getContentPane().add(jPanel);
					jPanel.revalidate();
					jPanel.repaint();
					startGame = true;					
				}
				
				
			}
		});
		return jMenuGame;
	}
	
	private JMenu createMenuExit() {
		jMenuExit = new JMenu("Exit");
		jMenuItemExit = new JMenuItem("Exit Game");
		jMenuItemExitProgram = new JMenuItem("Exit Program");
		jMenuExit.add(jMenuItemExit);
		jMenuExit.add(jMenuItemExitProgram);
		jMenuItemExitProgram.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		jMenuItemExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(startGame) {
					gameHorse5.dellComponents(jPanel);
					gameHorse5 = null;
					jPanel.revalidate();
					jPanel.repaint();
					startGame = false;
				}
				
			}
		});
		return jMenuExit;
	}
	public void windowBuilder() {
		setSize(300, 300);
		setTitle("Game");
		setVisible(true);
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.windowBuilder();
	}

}
