package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @After
    public void catClean () {
        CatHouse.clear();
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public  void testSetName () {
        Cat cat = new Cat("catA",new Date(), 1);
        CatHouse.add(cat);
        cat.setName("CatNewName");
        String actual = cat.getName();
        String expected  = "CatNewName";
        Assert.assertEquals(actual,expected);
    }

    // TODO - Create tests for `speak`
    @Test
    public  void testForSpeak() {
        Cat cat = new Cat("catA",new Date(), 1);
        CatHouse.add(cat);
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(actual,expected);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public  void testSetDateB() {
        Cat cat = new Cat("catA",new Date(), 1);
        CatHouse.add(cat);
        cat.setBirthDate(new Date());
        Date actual = cat.getBirthDate();
        Date expected = new Date();
        Assert.assertEquals(actual,expected);
    }

//     TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat () {
        Cat cat = new Cat("catA",new Date(), 1);
        CatHouse.add(cat);
        Food food = new Food();
        cat.eat(food);
        Integer actual = cat.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `Integer getId()`

    @Test
    public void testGetByID() {
        Cat cat = new Cat("catA",new Date(), 5);
        CatHouse.add(cat);
        Integer actual = cat.getId();
        Integer expected = 5;
        Assert.assertEquals(actual,expected);
    }



    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceofOfAnimal () {
        Cat cat = new Cat("catA",new Date(), 5);
        CatHouse.add(cat);
        Boolean actual = cat instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceofOfMamal () {
        Cat cat = new Cat("catA",new Date(), 5);
        CatHouse.add(cat);
        Boolean actual = cat instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

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
