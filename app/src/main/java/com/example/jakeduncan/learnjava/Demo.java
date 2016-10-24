package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/19/16.
 */

public class Demo {
    public static void main(String[] args) {

//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.takeDamage(11);
//        enemy.showInfo();
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(38);

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();
    }
}
