package com.game.abstraction;

import com.game.implementor.AttackStrategy;

public abstract class Character {
    protected AttackStrategy attackStrategy;
    protected String name;
    protected int baseDamage;

    public Character(String name, int baseDamage, AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        this.name = name;
        this.baseDamage = baseDamage;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public abstract void performAttack();
}
