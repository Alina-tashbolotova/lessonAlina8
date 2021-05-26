package kg.geektech.game.player;

public class Avrora extends Hero {
    public Avrora(int health, int damage) {
        super(health, damage,SuperAbility.INVISIBILITY );
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
