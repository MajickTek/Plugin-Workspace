package com.mojang.ld22;

import java.awt.Point;

import com.mt.minicraft.TextParticle;
import com.mt.pluginloader.util.GenericConverter;

public class TextParticleConverter
		implements GenericConverter<com.mt.minicraft.TextParticle, com.mojang.ld22.entity.particle.TextParticle> {

	@Override
	public TextParticle createFromU(com.mojang.ld22.entity.particle.TextParticle other) {
		class Dummy implements com.mt.minicraft.TextParticle {

			@Override
			public String text() {
				return other.getMessage();
			}

			@Override
			public Point location(int x, int y) {
				return new Point(other.x, other.y);
			}

			@Override
			public int color() {
				return other.getColor();
			}

		}

		return new Dummy();
	}

	@Override
	public com.mojang.ld22.entity.particle.TextParticle createFromT(TextParticle other) {
		Point p = new Point(Game.GAME.player.x, Game.GAME.player.y);

		return new com.mojang.ld22.entity.particle.TextParticle(other.text(), (int) other.location(p.x, p.y).getX(),
				(int) other.location(p.x, p.y).getY(), other.color());
	}

}
