package Classes;

public abstract class Animal {
    private String species;
    enum Gender {
        F, M
    }

    public Animal(String species, Gender gender, float height, float weight, int age, int hunger, int health, boolean isAsleep) {
        this.species = species;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.hunger = hunger;
        this.health = health;
        this.isAsleep = isAsleep;
    }

    private Gender gender;
    private float height, weight;
    private int age, hunger, health;
    private boolean isAsleep;

    public abstract void eat();
    public abstract void sound();
    public abstract void getHealed();
    public abstract void fallAsleep();

    @Override
    public String toString() {
        return "Animal{" +
                "species=" + species + " | " +
                " gender=" + gender + " | " +
                " height=" + height + " | " +
                " weight=" + weight + " | " +
                " age=" + age +" | " +
                " hunger=" + hunger + " | " +
                " health=" + health + " | " +
                " isAsleep=" + isAsleep +
                "\n";
    }
}
