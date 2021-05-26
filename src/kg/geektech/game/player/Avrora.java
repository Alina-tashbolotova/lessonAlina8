package kg.geektech.game.player;

import kg.geektech.game.logic.RPG_Game;

public class Avrora extends Hero {
    private boolean isDissapeared;
    private int roundCounter;

    public Avrora(int health, int damage) {
        super(health, damage, SuperAbility.DISAPEAR);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean chance = RPG_Game.random.nextBoolean();
        if (roundCounter != 2 && chance) {
            isDissapeared = true;
            System.out.println("Avrora dissapeared");
        }


    }

    public boolean isDissapeared() {
        return isDissapeared;
    }

    public void setDissapeared(boolean dissapeared) {
        isDissapeared = dissapeared;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }
}
