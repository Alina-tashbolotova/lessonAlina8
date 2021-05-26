package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int ran = RPG_Game.random.nextInt(7) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() + ran);


            }


        }

        System.out.println("Mag увеличил урон "  + ran);
    }


}
