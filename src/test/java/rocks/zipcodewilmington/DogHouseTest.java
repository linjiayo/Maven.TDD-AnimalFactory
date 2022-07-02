package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    Dog dog;
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

        Assert.assertEquals(Integer.valueOf(1), DogHouse.getNumberOfDogs());
    }
    @Before
    public void setUp() throws Exception {
        dog = new Dog("dog", new Date(), 0);
    }

    @After
    public void tearDown() {
        DogHouse.clear();
    }

    @Test
    public void testAdd() {
        String expName = "dog";
        Integer expId = 0;
        Date expDate = dog.getBirthDate();

        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expName, actual.getName());
        Assert.assertEquals(expId, actual.getId());
        Assert.assertEquals(expDate, actual.getBirthDate());
    }

    @Test
    public void testRemoveById() {
        DogHouse.remove(0);

        Dog actual = DogHouse.getDogById(0);

        Assert.assertNull(actual);
    }

    @Test
    public void testRemoveByDog() {
        DogHouse.add(dog);
        Dog getDog = DogHouse.getDogById(0);
        Integer expected = 0;

        Assert.assertNotNull(getDog);
        DogHouse.remove(getDog);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetDogById() {
        Dog expected = dog;
        DogHouse.add(expected);

        Dog actual = DogHouse.getDogById(dog.getId());

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testGetNumberOfDogs() {
//        DogHouse.add(dog);
//        Integer expected = 1;
//
//        Integer actual = DogHouse.getNumberOfDogs();
//
//        Assert.assertEquals(expected, actual);
//    }
}
