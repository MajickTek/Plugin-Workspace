package com.mojang.ld22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GameWindow {

	private Game game = new Game();
	private JFrame frmMinicraft;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow window = new GameWindow();
					window.frmMinicraft.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinicraft = new JFrame();
		frmMinicraft.setTitle("Minicraft");
		frmMinicraft.setBounds(100, 100, 800, 600);
		frmMinicraft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinicraft.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frmMinicraft.add(game, BorderLayout.CENTER);
		game.start();
		
	}

}
