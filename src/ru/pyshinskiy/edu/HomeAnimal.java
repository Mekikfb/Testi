package ru.pyshinskiy.edu;

public abstract class HomeAnimal {

    protected int health;
    protected String name;
    protected Human owner;

    public HomeAnimal(String name, Human owner, int health) {
        this.health = health;
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
