package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int number = RPG_Game.random.nextInt(5) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i].getSuperAbility() !=SuperAbility.REVIVE) {
                heroes[i].setDamage(heroes[i].getDamage() + number);


            }


        }

        System.out.println("Mag увеличил урон " + number);
    }


}
