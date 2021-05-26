package kg.geektech.game.player;

public class Hacker extends Hero {
    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.TRANSLATE_HEALTH);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
