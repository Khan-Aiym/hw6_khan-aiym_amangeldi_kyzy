package com.company;

public class GameEntitiy {
   private int health;
   private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public GameEntitiy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}