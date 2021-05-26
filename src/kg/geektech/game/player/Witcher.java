package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

import java.util.Random;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.ENLIVEN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean ran = RPG_Game.random.nextBoolean();
        if (ran){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() <= 0){
                    heroes[i].setHealth(this.getHealth());
                    this.setHealth(0);
                    break;
                }

            }
        }




    }
}














