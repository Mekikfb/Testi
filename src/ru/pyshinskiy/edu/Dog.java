package ru.pyshinskiy.edu;

public class Dog extends HomeAnimal implements Fighter {

    public Dog(String name, Human owner, int health) {
        super(name, owner, health);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return 6;
    }

    @Override
    public void receiveDamage(int damage) {
        System.out.println(getName() + " receive " + damage + " damage point");
        this.health = health - damage;
    }

    @Override
    public void hit(Fighter fighter) {
        System.out.println(getName() + " make " + getDamage() + " damage point to " + fighter.getName());
        fighter.receiveDamage(getDamage());
    }
}
