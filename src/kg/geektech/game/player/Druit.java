package kg.geektech.game.player;

public class Druit extends Hero{
    public Druit(int health, int damage) {
        super(health, damage,SuperAbility.CALL_ON_A_HELPER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
