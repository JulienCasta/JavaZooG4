package Classes;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class Employe {

    enum Gender {
        F, M
    }
    private String name;
    private Animal.Gender gender;
    private int age;

    public void examineEnclosure(Enclosure enclosure){
        System.console().writer().println(enclosure);
    }

    public boolean cleanEnclosure(Enclosure enclosure){
        return enclosure.clean();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal.Gender getGender() {
        return gender;
    }

    public void setGender(Animal.Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
