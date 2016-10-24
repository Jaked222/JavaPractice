package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/23/16.
 */

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingHitPoints = this.hitPoints - damage;
        if (remainingHitPoints > 0) {
            setHitPoints(remainingHitPoints);
            System.out.println("I took " + damage + " points of damage, and have " + remainingHitPoints + " left.");
        }
        else {
            this.lives = this.lives - 1;

            if (lives > 0) {
                System.out.println("Lost a life, " + this.lives + " lives left.");
            }
            else {
                System.out.println("No lives left! I'm Dead.");
            }
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " Lives: " + this.lives + " Hitpoints: " + this.hitPoints);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
