package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void CatSetNameTest(){
        //Given
        String expected = "cutieCat";
        //When
        Cat c = new Cat("notCutieCate",new Date(22,2,12), 01);
        c.setName("cutieCat");
         //Then
         Assert.assertEquals(expected,c.getName());

    }
    // TODO - Create tests for `speak`
    @Test
    public void catSpeakTest(){
        //Given
        String expected = "meow!";
        //When
        Cat c = new Cat("notCutieCate",new Date(22,2,12), 02);
        //Then
        Assert.assertEquals(expected,c.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void catSetBirthDateTest(){
        //Given
        Date expected = new Date(22,1,23);

        //When
        Cat c = new Cat("GoodCate",new Date(12,2,28), 1002);
        c.setBirthDate(new Date(22,1,23));

        //Then
        Assert.assertEquals(expected, c.getBirthDate());

    }

    //@Test
    // TODO - Create tests for `void eat(Food food)`
//    public void catEatTest(){
//        //Given
//
//    }
    //@Test

    // TODO - Create tests for `Integer getId()`
    @Test
    public void catGetIdTest(){
        //Given
        int id = 123;
        String name = "Leon";
        Date birthDate = new Date();
        Cat c = new Cat(name, birthDate,id);

        //When
        int getId = c.getId();

        //Then
        Assert.assertEquals(id, getId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }

}
