package Classes;

import Interfaces.Flyer;

public class Pengouin extends Animal implements Flyer {

    public Pengouin(String species, Gender gender, float height, float weight, int age, int hunger, int health, boolean isAsleep) {
        super(species, gender, height, weight, age, hunger, health, isAsleep);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void getHealed() {

    }

    @Override
    public void fallAsleep() {

    }

    @Override
    public void fly() {

    }
}