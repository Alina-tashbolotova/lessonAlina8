package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int chance =RPG_Game.random.nextInt(3) + 1;
        if (chance == 3){ //50 * 50
         boss.setStunned(true);
            System.out.println("Boss is stunned by Thor");
        }else {
            boss.setStunned(false);
        }

    }

}

