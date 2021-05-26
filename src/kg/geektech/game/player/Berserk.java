package kg.geektech.game.player;

public class
Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] == this) {
                heroes[i].setDamage(25);
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + boss.getDamage() / 2));
                System.out.println("Berserk наносит урон Боссу");

            }
        }
    }
}


