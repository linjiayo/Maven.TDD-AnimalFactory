package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    Dog dog;
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
    @Before
    public void setUp() throws Exception {
        dog = new Dog("Milo", new Date(), 0);
    }

    @Test
    public void setName() {
        String exp = "Jeff";
        dog.setName(exp);

        String actual = dog.getName();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void setBirthDate() {
        Date exp = new Date();
        dog.setBirthDate(exp);

        Date actual = dog.getBirthDate();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void eat() {
        dog.eat(new Food());
        int exp = 1;

        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void getId() {
        int exp = 0;

        int actual = dog.getId();

        Assert.assertEquals(exp, actual);
    }

    @Test
    public void speak() {
        String exp = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(exp, actual);
    }
}
