package com.mojang.ld22;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JFrame;

import com.mt.minicraft.BaseAPI;
import com.mt.pluginloader.PluginRegistryServiceLoader;

public class Start {
	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		HashMap<String, BaseAPI> plugins = prsl.getPlugins(BaseAPI.class);
		
		Game game = new Game();
		game.setMinimumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
		game.setMaximumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
		game.setPreferredSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));

		JFrame frame = new JFrame(Game.NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(game, BorderLayout.CENTER);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
		game.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plugins.forEach((n, p) -> {
			p.postInit(game);
		});
	}
}
