package com.example.jakeduncan.learnjava;

import java.util.Random;

/**
 * Created by jakeduncan on 10/23/16.
 */

public class VampireKing extends Vampire {
    public VampireKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
    public boolean runAway(){
       return (getLives() < 2);
    }
    public boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6);

        if(chance > 3){
            System.out.println("Dodged.");
            return true;
        }
        return false;
    }
}

