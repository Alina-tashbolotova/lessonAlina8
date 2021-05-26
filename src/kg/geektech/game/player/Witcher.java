package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

import java.util.Random;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.REVIVE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(0);
                System.out.println("Witcher revived" + heroes[i].getClass().getSimpleName() + "by" +
                        heroes[i].getHealth());
                break;
            }

        }


    }
}














