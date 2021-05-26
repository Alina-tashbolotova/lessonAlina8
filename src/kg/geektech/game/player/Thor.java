package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean random = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (random) {
                System.out.println(" Тор оглушил");

                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                break;
            }


        }

    }

}

