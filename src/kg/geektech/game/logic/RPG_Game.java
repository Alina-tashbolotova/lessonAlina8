package kg.geektech.game.logic;

import kg.geektech.game.player.*;

import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();

    public static void start() {
        Boss boss = new Boss(1000, 50);
        Warrior warrior = new Warrior(260, 15);
        Magic magic = new Magic(270, 20);
        Medic doc = new Medic(230, 10, 15);
        Berserk berserk = new Berserk(250, 25);
        Medic assistant = new Medic(260, 15, 5);
        Thor thor = new Thor(270, 30);
        Golem golem = new Golem(300,10);
        Witcher witcher = new Witcher(270,0);
        Avrora avrora = new Avrora(280,20);
        Hacker hacker = new Hacker(200,20);
        TrickyBastard trickyBastard = new TrickyBastard(250,0);
        Antman antman = new Antman(250,20);
        Hero[] heroes = {warrior, magic, doc, berserk, assistant,thor,golem,witcher,avrora,hacker,
                trickyBastard,antman};
        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }

    }

    private static void round(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            bossHits(boss, heroes);
        }
        heroesHits(boss, heroes);
        applySuperPower(boss, heroes);
        printStatistics(boss, heroes);

    }


    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

            }
        }


    }

    private static void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperAbility(boss, heroes);

            }
        }

    }


    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }

    }


    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("---------------------");
        System.out.println("Boss health:   " + boss.getHealth() + " [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName()
                    + " health:   " + heroes[i].getHealth()
                    + " [" + heroes[i].getDamage() + "]");

        }

    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;

        }
        boolean allHeroesDead = true;

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;

    }
}
