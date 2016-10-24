package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/19/16.
 */

public class Demo {
    public static void main(String[] args) {

        VampireKing vking = new VampireKing("vking");
        vking.showInfo();

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));

        conan.showInventory();
        conan.dropLoot("Cursed Shield");
        conan.showInventory();
    }
}
