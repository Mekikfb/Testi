package ru.pyshinskiy.edu;

public interface Fighter {

    String getName();
    int getHealth();
    int getDamage();
    void receiveDamage(int damage);
    void hit(Fighter fighter);
}
