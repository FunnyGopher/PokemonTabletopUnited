package com.ptu.pokemon;

import java.util.List;

import com.ptu.CombatStatManager;
import com.ptu.trainer.inventory.item.Item;

public class Pokemon {
	private Species species;
	private String nickname;
	private Type type1, type2;
	private int level;
	private Item heldItem;
	private int loyalty;
	private String gender;
	private Nature nature;
	private List<Ability> abilities;
	private CombatStatManager combatStats;
	
}
