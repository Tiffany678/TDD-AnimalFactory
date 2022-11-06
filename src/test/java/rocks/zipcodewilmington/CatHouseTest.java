package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.*;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public  void addTest(){
        Integer num = CatHouse.getNumberOfCats();
        String name =  "LittleCate";
        Date birthDate =  new Date();
        int id = 01;
        Cat cat = new Cat(name, birthDate, id);
         CatHouse.add(cat);
        Assert.assertEquals((int)num+1, (int)CatHouse.getNumberOfCats());

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest(){

        Cat cat = new Cat("LittleCate", new Date(2022, 12,23),02);
        CatHouse.add(cat);
        int num = CatHouse.getNumberOfCats();
        CatHouse.remove(02);
        Assert.assertEquals((int)CatHouse.getNumberOfCats(),num-1);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeObjectTest(){
        Cat cat = new Cat("LittleCate", new Date(2022, 12,23),02);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertEquals(CatHouse.getCatById(02), null);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat("LittleCate", new Date(2022, 12,23),03);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertEquals(CatHouse.getCatById(03), null);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        int expectedCatNumber =3;
        Cat cat = new Cat("firstCate", new Date(2022, 12,23),1345);
        Cat cat1 = new Cat("SecondCate", new Date(2021,3,23),2345);
        CatHouse.add(cat);
        CatHouse.add(cat1);
        Assert.assertEquals((int)CatHouse.getNumberOfCats(), expectedCatNumber);
    }
}
