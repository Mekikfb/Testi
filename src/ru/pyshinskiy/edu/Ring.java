package ru.pyshinskiy.edu;

public class Ring {

    private final Dog dogFighter;
    private final Cat catFighter;

    public Ring(Dog dogFighter, Cat catFighter) {
        this.dogFighter = dogFighter;
        this.catFighter = catFighter;
    }

    public void fight() {
        while(dogFighter.getHealth() > 0 && catFighter.getHealth() > 0) {
            dogFighter.hit(catFighter);
            catFighter.hit(dogFighter);
        }
        String winner = "";
        if(dogFighter.getHealth() <= 0) {
            winner = catFighter.getName();
        }
        else {
            winner = dogFighter.getName();
        }
        System.out.println("Fight is over!");
        System.out.println(dogFighter.getName() + " has " + dogFighter.getHealth() + " health");
        System.out.println(catFighter.getName() + " has " + catFighter.getHealth() + " health");
        System.out.println("THE WINNER IS " + winner);

    }
}
