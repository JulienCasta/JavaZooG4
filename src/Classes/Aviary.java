package Classes;

import java.util.ArrayList;

public class Aviary extends Enclosure{

    private int height;
    enum Roof
    {
        bad, correct, good
    }
    private Aviary.Roof roofState;
    public Aviary(String name, Cleanness cleanliness, int surface, int maxAnimals, ArrayList<Animal> animals, Roof roofState, int height) {
        super(name, cleanliness, surface, maxAnimals, animals);
        this.roofState = roofState;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Roof getRoofState() {
        return roofState;
    }

    public void setRoofState(Roof roofState) {
        this.roofState = roofState;
    }

    @Override
    public boolean clean() {
        if(this.getNbAnimals() == 0 && this.roofState!=Roof.good){
            this.setRoofState(Roof.good);
            this.setCleanliness(Cleanness.good);
            return true;
        }
        return false;
    }
}
