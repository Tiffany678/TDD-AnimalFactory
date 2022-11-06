package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        String expected = "Milo";
        String name = "Milo";
        Date birthDate = new Date();
        int  id = 01;

        Dog dog1 = new Dog(name, birthDate, id);
        DogHouse.add(dog1);

        Assert.assertEquals(dog1.getName(),expected);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        String expected ="secondDog";
        String name = "secondDog";
        Date birthDate = new Date();
        int id = 02;
        Dog dog2 = new Dog(name, birthDate, id);
        DogHouse.add(dog2);
        DogHouse.remove(dog2);
        Assert.assertEquals(expected,dog2.getName() );
    }

    @Test
    // TODO - Create tests for `void remove(Dog dog)`
    public void removeObjectTest() {


        Dog dog3 = new Dog("ThirdDog", new Date(), 03);
        DogHouse.add(dog3);
        DogHouse.remove(dog3);
        Assert.assertEquals(1, DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    public void getDogByIdTest() {
        int expected = 04;
        Dog dog4 = new Dog("ForthDog", new Date(), 04);
        DogHouse.add(dog4);

        Assert.assertEquals(expected, (int)dog4.getId());
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
        int expected = 1;
        Dog dog5 = new Dog("FithDog", new Date(), 05);
        DogHouse.add(dog5);
        DogHouse.clear();
        DogHouse.add(dog5);

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
