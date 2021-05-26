package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class TrickyBastard extends Hero{

    public TrickyBastard(int health, int damage) {
        super(health, damage, SuperAbility.PRETEND_TO_BE_DEAD);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean random = RPG_Game.random.nextBoolean();
        if (random){
          this.setHealth(this.getHealth() + boss.getDamage());
        }else {
            this.setHealth(this.getHealth() - boss.getDamage());
        }
        System.out.println("Притворился мертвым");

    }
}
