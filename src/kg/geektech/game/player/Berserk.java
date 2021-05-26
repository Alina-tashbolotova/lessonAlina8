package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class
Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int saved_damage = RPG_Game.random.nextInt(15) + 1;
        this.setHealth(this.getHealth() - (boss.getDamage() - saved_damage));
        boss.setHealth(boss.getHealth() - (this.getDamage() + saved_damage));
        System.out.println("Berserk saved and reverted" + saved_damage);

    }
}


