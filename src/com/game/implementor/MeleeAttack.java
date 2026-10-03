package com.game.implementor;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void executeAttack(String characterName, int baseDamage) {
        int totalDamage = baseDamage + 15;
        System.out.println(characterName + " performs a heavy MELEE strike with a sword for " + totalDamage + " physical damage!");
    }
}