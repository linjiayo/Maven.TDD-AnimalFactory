package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    Cat cat;

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
    @Before
    public void setUp() throws Exception {
        cat = new Cat("Cat", new Date(), 0);
    }

    @Test
    public void testSetName() {
        String exp = "Kitty";
        cat.setName(exp);

        String actual = cat.getName();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void testSetBirthDate() {
       Date exp = new Date();
       cat.setBirthDate(exp);

       Date actual = cat.getBirthDate();

       Assert.assertEquals(exp, actual);
    }

    @Test
    public void testEat() {
        Food food = new Food();
        cat.eat(food);

        int actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void testGetId() {
        int exp = 0;

        int actual = cat.getId();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void testSpeak() {
        String exp = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void testAnimalInheritance() {
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Assert.assertTrue(cat instanceof Mammal);
    }
}
