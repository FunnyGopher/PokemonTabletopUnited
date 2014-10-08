package com.ptu.pokemon;

import com.ptu.CombatStatManager;
import com.ptu.trainer.inventory.item.Item;

public class Pokemon {
	private String name;
	private Type type1;
	private Type type2;
	private int level;
	private Item heldItem;
	private int loyalty;
	private String gender;
	private Nature nature;
	private CombatStatManager combatStats;
}
