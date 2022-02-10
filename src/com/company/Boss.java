package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefence;

    public String getBossDefence() {
        return bossDefence;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
}


