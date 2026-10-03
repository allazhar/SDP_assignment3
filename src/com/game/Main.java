package com.game;

import com.game.abstraction.Character;
import com.game.abstraction.Warrior;
import com.game.abstraction.Mage;
import com.game.implementor.AttackStrategy;
import com.game.implementor.MagicAttack;
import com.game.implementor.MeleeAttack;

public class Main {
    public static void main(String[] args) {
        AttackStrategy melee = new MeleeAttack();
        AttackStrategy magic = new MagicAttack();

        Character warrior = new Warrior("Conan", 15, melee);
        warrior.performAttack();

        Character mage = new Mage("Gandalf", 20, magic);
        mage.performAttack();

        System.out.println("\n--- DYNAMIC SWITCH OF IMPLEMENTATION ---");

        System.out.println("Conan picks up a magic staff!");
        warrior.setAttackStrategy(magic);
        warrior.performAttack();

        System.out.println("Gandalf pulls out a broadsword!");
        mage.setAttackStrategy(melee);
        mage.performAttack();
    }
}