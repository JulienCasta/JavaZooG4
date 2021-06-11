package Classes;

import java.util.ArrayList;

public class Aquarium extends Enclosure{
    private int depth;
    private boolean salinity;
    enum Pool
    {
        bad, correct, good
    }
    private Aquarium.Pool poolState;

    public Aquarium(String name, Cleanness cleanliness, int surface, int maxAnimals, ArrayList<Animal> animals, int depth, boolean salinity, Pool poolState) {
        super(name, cleanliness, surface, maxAnimals, animals);
        this.depth = depth;
        this.salinity = salinity;
        this.poolState = poolState;
    }

    @Override
    public boolean clean() {
        if(this.getNbAnimals() == 0 && this.poolState!=Pool.good) {
            this.setSalinity(true);
            this.setPoolState(Pool.good);
            return true;
        }
        return false;
    }

    public Pool getPoolState() {
        return poolState;
    }

    public void setPoolState(Pool poolState) {
        this.poolState = poolState;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean getSalinity() {
        return salinity;
    }

    public void setSalinity(boolean salinity) {
        this.salinity = salinity;
    }
}
