package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author Yingjie Yang 10/06/2022.
 */
public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }
}
