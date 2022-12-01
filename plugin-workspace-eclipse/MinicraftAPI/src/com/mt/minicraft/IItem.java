package com.mt.minicraft;

public interface IItem {
	int getColor();
	int getSprite();
	void onTake();
	boolean interact();
	boolean interactOn();
	boolean isDepleted();
	boolean canAttack();
	int getAttackDamageBonus();
	String getName();
	default boolean matches(IItem item) {
		return getClass().equals(item.getClass());
	}
}
