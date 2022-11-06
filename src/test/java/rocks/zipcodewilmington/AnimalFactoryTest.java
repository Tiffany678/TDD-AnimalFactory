package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.*;
/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void animalCreateDogTest(){
       //Given:
        String name= "yellowDog";
        Date birthDate =new Date();
        int id = 100;

        //When
       Dog dog= new Dog(name,birthDate, id);

        //Then
      Assert.assertEquals(name, dog.getName());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void animalCreateCatTest(){
        //Given:
        String name= "yellowCat";
        Date birthDate =new Date();
        int id = 101;

        //When
        Cat cat= new Cat(name,birthDate, id);

        //Then
        Assert.assertEquals(name, cat.getName());
    }


}
