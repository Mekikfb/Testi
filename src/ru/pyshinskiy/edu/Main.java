package ru.pyshinskiy.edu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runTheGame();
    }

    public static void runTheGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST OWNER NAME: ");
        String firstOwnerName = scanner.nextLine();
        System.out.println("ENTER SECOND OWNER NAME: ");
        String secondOwnerName = scanner.nextLine();

        System.out.println("ENTER DOG NAME: ");
        String dogName = scanner.nextLine();
        System.out.println("ENTER CAT NAME: ");
        String catName = scanner.nextLine();

        Human firstOwner = new Human(firstOwnerName);
        Human secondOwner = new Human(secondOwnerName);
        Cat cat = new Cat(catName, secondOwner, 30);
        Dog dog = new Dog(dogName, firstOwner, 40);

        Ring ring = new Ring(dog, cat);
        ring.fight();
    }
}
