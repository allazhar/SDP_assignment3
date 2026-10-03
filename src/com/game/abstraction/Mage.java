package com.game.abstraction;

import com.game.implementor.AttackStrategy;

public class Mage extends Character {
    public Mage (String name, int baseDamage, AttackStrategy attackStrategy) {
        super(name, baseDamage, attackStrategy);
    }

    @Override
    public void performAttack() {
        System.out.print("[MAGE ACTION] ");
        attackStrategy.executeAttack(name, baseDamage);
    }
}
