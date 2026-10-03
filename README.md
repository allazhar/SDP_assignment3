# Assignment 3: Bridge Design Pattern

**Course:** Software Design Patterns  
**Topic:** Game Character & Attack Strategy System

---

## 1. Project Overview

This project implements the **Bridge Pattern** to decouple high-level character abstractions (`Character`, `Warrior`, `Mage`) from low-level attack execution implementations (`AttackStrategy`, `MeleeAttack`, `MagicAttack`).

By applying the Bridge pattern:
- Characters and attack strategies can vary independently without modifying existing code.
- Attack implementations can be switched dynamically at runtime without altering the character abstractions.

---

## 2. Clean Code Principles Applied

### Principle 1: Decoupling Abstraction from Implementation (Bridge Core)
- **Description:** The high-level character logic (`Character`) does not depend on concrete attack implementations; instead, it delegates attack execution through the `AttackStrategy` interface.
- **Code Excerpt:**
  ```java
  public abstract class Character {
      protected AttackStrategy attackStrategy;

      public Character(String name, int baseDamage, AttackStrategy attackStrategy) {
          this.name = name;
          this.baseDamage = baseDamage;
          this.attackStrategy = attackStrategy;
      }
  }
Principle 2: Open/Closed Principle (Backward-Compatible Design)
Description: Adding new concrete implementors (e.g., RangedAttack) or refined abstractions (e.g., Rogue) requires zero changes to existing classes.

Code Excerpt:

Java
// Adding a new attack strategy only requires implementing the interface:
public class RangedAttack implements AttackStrategy {
@Override
public void executeAttack(String characterName, int baseDamage) {
System.out.println(characterName + " shoots an arrow for " + baseDamage + " damage!");
}
}
Principle 3: Single Responsibility Principle (SRP)
Description: Abstraction classes (Warrior, Mage) manage character state, while Implementor classes (MeleeAttack, MagicAttack) exclusively handle damage calculations and execution logic.

Code Excerpt:

Java
public class MeleeAttack implements AttackStrategy {
@Override
public void executeAttack(String characterName, int baseDamage) {
int totalDamage = baseDamage + 15;
System.out.println(characterName + " performs a heavy MELEE strike for " + totalDamage + " damage!");
}
}
Principle 4: Meaningful, Domain-Specific Names
Description: Class and method names explicitly convey their intent within the domain, clearly separating the Abstraction role (Warrior, Mage) from the Implementor role (AttackStrategy, MagicAttack).

Code Excerpt:

Java
public interface AttackStrategy {
void executeAttack(String characterName, int baseDamage);
}
Principle 5: Encapsulation & Dynamic Behavior Change
Description: Attack implementations are safely encapsulated behind a setter method, enabling dynamic state/behavior modifications at runtime without exposing class internals.

Code Excerpt:

Java
public void setAttackStrategy(AttackStrategy attackStrategy) {
this.attackStrategy = attackStrategy;
}