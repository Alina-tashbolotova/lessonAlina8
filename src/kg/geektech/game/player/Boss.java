package kg.geektech.game.player;

public class Boss extends GameEntity {
    private boolean isStunned;

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }

}
