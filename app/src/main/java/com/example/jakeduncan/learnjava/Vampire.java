package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/23/16.
 */

public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = damage / 2;
        super.takeDamage(damageDone);
    }

}
