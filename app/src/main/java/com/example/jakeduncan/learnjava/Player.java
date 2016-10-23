package com.example.jakeduncan.learnjava;

import java.util.ArrayList;

/**
 * Created by jakeduncan on 10/19/16.
 */

public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player() {
        this("unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
    }

    public Player(String handle, int startingLevel) {
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    public void setNameAndLevel(int level, String name) {
        setHandleName(name);
        setLevel(level);
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String s) {

        if (s.length() < 4) {
            return;
        }
        handleName = s;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }
    public void showInventory(){
        for(Loot item : inventory){
            System.out.println(item.getName());
        }
        System.out.println("===========================");
    }
}
