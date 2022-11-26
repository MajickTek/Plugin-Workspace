package com.mojang.ld22;

import java.awt.Point;
import java.util.function.Function;

import com.mojang.ld22.entity.particle.TextParticle;
import com.mt.pluginloader.util.Converter;

public class TextParticleConverter
		extends Converter<com.mojang.ld22.entity.particle.TextParticle, com.mt.minicraft.TextParticle> {

	public TextParticleConverter(Function<TextParticle, com.mt.minicraft.TextParticle> fromDto,
			Function<com.mt.minicraft.TextParticle, TextParticle> fromEntity) {
		super(TextParticleConverter::convertToEntity, TextParticleConverter::convertToDto);

	}

	public TextParticleConverter() {
		super(TextParticleConverter::convertToEntity, TextParticleConverter::convertToDto);
	}

	private static com.mojang.ld22.entity.particle.TextParticle convertToDto(com.mt.minicraft.TextParticle tp) {
		Point p = new Point(Game.GAME.player.x, Game.GAME.player.y);
		
		return new com.mojang.ld22.entity.particle.TextParticle(tp.text(), (int) tp.location(p.x, p.y).getX(),
				(int) tp.location(p.x, p.y).getY(), tp.color());
	}

	private static com.mt.minicraft.TextParticle convertToEntity(com.mojang.ld22.entity.particle.TextParticle dto) {
		class Dummy implements com.mt.minicraft.TextParticle {

			@Override
			public String text() {
				return dto.getMessage();
			}

			@Override
			public Point location(int x, int y) {
				return new Point(dto.x, dto.y);
			}

			@Override
			public int color() {
				return dto.getColor();
			}

		}

		return new Dummy();
	}
}
