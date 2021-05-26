package kg.geektech.game.player;

public class Antman extends Hero{
    public Antman(int health, int damage) {
        super(health, damage,SuperAbility.INCREASE_OR_DECREASE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
