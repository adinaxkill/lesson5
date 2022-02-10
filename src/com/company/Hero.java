package com.company;

public class Hero {
    private int health;
    private int damage;
    private String attackType;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public Hero(int health, int damage, String attackType) {
        this.health = 300;
        this.damage = 50;
        this.attackType = "Physical";

    }

    public Hero(int health, int damage) {
        this.health = 300;
        this.damage = 50;
    }

    public int getHealth() {
        return health;
    }

    public String getAttackType() {
        return attackType;
    }

    public int getDamage() {
        return damage;
    }
}
