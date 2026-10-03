package com.game.implementor;

public class MagicAttack implements AttackStrategy {
    @Override
    public void executeAttack(String characterName, int baseDamage) {
        int totalDamage = baseDamage * 2;
        System.out.println(characterName + " casts a fiery MAGIC spell dealing " + totalDamage + " elemental damage!");
    }
}
