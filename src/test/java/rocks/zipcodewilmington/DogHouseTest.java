package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @After
    public void cleanMethod () {
        DogHouse.clear();
    }


    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testAdd() {
        Dog dog = new Dog("dog1",new Date(),7);
        DogHouse.add(dog);
        DogHouse.add(dog);DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 3;
        Assert.assertEquals(actual,expected);
    }


//     TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveById () {
        Dog dog = new Dog("dog1",new Date(),4);
        DogHouse.add(dog); DogHouse.add(dog);DogHouse.add(dog);
        Assert.assertEquals((Integer) 3,DogHouse.getNumberOfDogs());
        DogHouse.remove(4);
        Integer actual = 2;
        Integer expected = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual,expected);
        DogHouse.clear();


    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test

    public void testRemoveByDog() {
        Dog dog = new Dog("dog1",new Date(),1);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(actual,expected);


    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test

    public void testGetDogById() {
        Dog dog = new Dog("dog1",new Date(),2);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.getDogById(3);
        Integer expected = DogHouse.getNumberOfDogs();
        Integer actual = 2;
        Assert.assertEquals(actual,expected);
        DogHouse.clear();


    }


    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test

    public void testGetNumberOfDogs1() {
        Dog dog = new Dog("dog1",new Date(),2);
        DogHouse.add(dog);DogHouse.add(dog);DogHouse.add(dog);DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 4;
        Assert.assertEquals(actual, expected);
        DogHouse.clear();

    }


    @Test
    public void testGetNumberOfDogs() {
        //Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
