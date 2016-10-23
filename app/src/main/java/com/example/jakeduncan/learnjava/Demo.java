package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/19/16.
 */

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Tommyz", 8);
//        System.out.println(tim.getHandleName());
//
//        System.out.println("Level: " + tim.getLevel());
//        System.out.println("Lives: " + tim.getLives());
//
//        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 50, 50);
        tim.setWeapon(myAxe);

     //   System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tim.pickUpLoot(redPotion);

        tim.pickUpLoot(new Loot("Chest Armor", LootType.ARMOR, 80));
        tim.pickUpLoot(new Loot("Ring", LootType.RING, 50));
        tim.pickUpLoot(new Loot("Mana Potion", LootType.POTION, 8));

        tim.showInventory();

     //   Loot bluePotion = new Loot("blue potion", LootType.POTION, 6);
        boolean wasDeleted = tim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tim.showInventory();
    }
}
