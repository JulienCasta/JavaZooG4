package Classes;

import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {
        Wolf loup1 = new Wolf("loup", Animal.Gender.M, 2, 120, 7, 100, 100, false);
        Wolf loup2 = new Wolf("loup", Animal.Gender.F, 2, 120, 7, 100, 100, false);
        Wolf loup3 = new Wolf("loup", Animal.Gender.M, 2.2F, 130, 7, 100, 50, false);
        Wolf loup4 = new Wolf("loup", Animal.Gender.F, 1.9F, 110, 5, 75, 100, true);
        ArrayList<Animal> Liste = new ArrayList<Animal>();
        Liste.add(loup1);
        Liste.add(loup2);
        Liste.add(loup3);
        Liste.add(loup4);

        Enclosure Enclos = new Enclosure("Enclos1", Enclosure.Cleanness.good, 150, 7, Liste);
        System.out.println(Enclos.toString());
    }
}