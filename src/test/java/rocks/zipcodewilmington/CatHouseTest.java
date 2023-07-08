package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @After
    public void cleanAfterTest () {
        CatHouse.clear();
    }

    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void  testAddCat () {
        Cat cat = new Cat("cat1",new Date(),2);
        CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);
        Integer expected = CatHouse.getNumberOfCats();
        Integer actual = 4 ;
        Assert.assertEquals(actual,expected);


    }

    // TODO - Create tests for `void remove(Integer id)1

    @Test
    public void trestRemoveById () {
        Cat cat = new Cat("cat1",new Date(),2);
        CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.remove(2);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 3;
        Assert.assertEquals(actual,expected);

    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testRemoveByCat () {
        Cat cat = new Cat("cat1", new Date(), 2);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.remove(cat);
        CatHouse.remove(cat);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 6;
        Assert.assertEquals(actual,expected);
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void testGetCatById () {
        Cat cat = new Cat("cat1", new Date(), 2);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.getCatById(2);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats () {
        Cat cat = new Cat("cat1", new Date(), 2);
        CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.add(cat);CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 4;
        Assert.assertEquals(actual,expected);

    }
}
