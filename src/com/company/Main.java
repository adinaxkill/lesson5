package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(200);
        boss.setBossDefence("Kinetic");

        System.out.println("Boss:" + " " + boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefence() );
    }
}
