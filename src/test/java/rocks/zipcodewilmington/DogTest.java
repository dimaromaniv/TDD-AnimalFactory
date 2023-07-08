package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    @After
    public void dogClean() {
        DogHouse.clear();
    }


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testNewDog () {
        Dog dog = new Dog("DogA",new Date(), 2);
        String  actualName = dog.getName();
        String  expectedName = "DogA";
        Date actualDate = dog.getBirthDate();
        Date expectedDate = new Date();
        Integer actualId = dog.getId();
        Integer expectedId = 2;
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,expectedDate);
        Assert.assertEquals(actualId,expectedId);
    }
    // TODO - Create tests for `speak`

    @Test
    public void testForSpeak () {
        Dog dog = new Dog("DogA",new Date(), 2);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBD () {
        Dog dog = new Dog("DogA",new Date(), 2);
        dog.setBirthDate(new Date());
        Date actual = dog.getBirthDate();
        Date expected = new Date();
        Assert.assertEquals(actual,expected);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
//        Dog dog = new Dog("DogA",new Date(), 2);
//        dog.eat("meal");

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId () {
        Dog dog = new Dog("DogA",new Date(), 2);
        Integer actual = dog.getId();
        Integer expected = 2;
        Assert.assertEquals(actual,expected);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceofOfAnimal () {
        Dog dog = new Dog("DogA",new Date(), 2);
        Boolean actual = dog instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(actual,expected);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceofOfMammal () {
        Dog dog = new Dog("DogA",new Date(), 2);
        Boolean actual = dog instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
