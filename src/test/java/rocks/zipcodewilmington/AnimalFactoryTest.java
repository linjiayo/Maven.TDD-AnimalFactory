package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        String expName = "doge";
        Date expDate = new Date();
        Integer expId = 0;

        Dog actual = AnimalFactory.createDog(expName, expDate);

        Assert.assertEquals(expName, actual.getName());
        Assert.assertEquals(expDate, actual.getBirthDate());
        Assert.assertEquals(expId, actual.getId());
    }

    @Test
    public void testCreateCat() {
        String expName = "catcat";
        Date expDate = new Date();
        Integer expId = 0;

        Cat actual = AnimalFactory.createCat(expName, expDate);

        Assert.assertEquals(expName, actual.getName());
        Assert.assertEquals(expDate, actual.getBirthDate());
        Assert.assertEquals(expId, actual.getId());
    }
}
