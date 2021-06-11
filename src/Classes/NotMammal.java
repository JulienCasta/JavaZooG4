package Classes;

public abstract class NotMammal extends Animal{
    private int gestationDay;

    public NotMammal(String species, Gender gender, float height, float weight, int age, int hunger, int health, boolean isAsleep, int gestationDay) {
        super(species, gender, height, weight, age, hunger, health, isAsleep);
        this.gestationDay = gestationDay;
    }

    public abstract void layEgg();
}
