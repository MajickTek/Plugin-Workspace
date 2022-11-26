package com.mojang.ld22;

import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import java.awt.BorderLayout;

import com.mt.minicraft.BaseAPI;
import com.mt.pluginloader.*;
public class GameWindow {

	private Game game = new Game();
	private JFrame frmMinicraft;
	private static PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
	public static final HashMap<String, BaseAPI> plugins = prsl.getPlugins(BaseAPI.class);
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
		plugins.forEach((name, plugin) -> {
			System.out.println(name);
		});
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
