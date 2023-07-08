package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testcreatingADog () {
        Date date = new Date();
        Dog dog1 = AnimalFactory.createDog("name", date);

        String actualName = dog1.getName();
        String expectedName = "name" ;
        Date actualDate = dog1.getBirthDate();
        Assert.assertEquals(date, actualDate);
        Assert.assertEquals(actualName,expectedName);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`



    @Test
    public void testCreatingDog () {
        Date date= new Date();

        Cat cat1 = AnimalFactory.createCat("name",date);
        String actualName = cat1.getName();
        String expectedName = "name";
        Date actualDate = cat1.getBirthDate();
        Date expectedDate = date;
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,expectedDate);

    }

}
