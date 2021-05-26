package kg.geektech.game.player;

public class Golem extends Hero {
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.TAKE_OVER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] == this){
                heroes[i].setHealth(this.getHealth()- boss.getDamage() /10);
                this.setHealth(this.getHealth() - boss.getDamage() + 20 );
                System.out.println("Golem принял урон");

            }

        }



    }
}
