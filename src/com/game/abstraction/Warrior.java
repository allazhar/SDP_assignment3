package com.game.abstraction;

import com.game.implementor.AttackStrategy;

public class Warrior extends Character {
    public Warrior(String name, int baseDamage, AttackStrategy attackStrategy) {
        super(name, baseDamage, attackStrategy);
    }

    @Override
    public void performAttack() {
        System.out.print("[WARRIOR ACTION] ");
        attackStrategy.executeAttack(name, baseDamage);
    }
}
