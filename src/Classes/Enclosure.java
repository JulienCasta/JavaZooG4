package Classes;

import java.util.ArrayList;

public class Enclosure {
    private String name;
    enum Cleanness
    {
        bad, correct, good
    }
    private Cleanness cleanliness;
    private int surface, maxAnimals, nbAnimals;
    ArrayList<Animal> animals = new ArrayList<>();

    public Enclosure(String name, Cleanness cleanliness, int surface, int maxAnimals, ArrayList<Animal> animals) {
        this.name = name;
        this.cleanliness = cleanliness;
        this.surface = surface;
        this.maxAnimals = maxAnimals;
        this.animals = animals;
        this.nbAnimals = animals.size();
    }

    public void removeAnimal(Animal animal){
        this.animals.remove(animal);
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void feedAnimals(){
        for (Animal animal : this.animals){
            animal.eat();
        }
    }

    public boolean clean(){
        if(this.getNbAnimals() == 0 && this.cleanliness!=Cleanness.good){
            this.setCleanliness(Cleanness.good);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Enclosure : " +
                "name='" + name + '\'' +
                ", cleanliness=" + cleanliness +
                ", surface=" + surface +
                ", maxAnimals=" + maxAnimals +
                ", nbAnimals=" + nbAnimals +
                "\n Animals state :" + "\n" +animals
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cleanness getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Cleanness cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public void setMaxAnimals(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public int getNbAnimals() {
        return this.animals.size();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
