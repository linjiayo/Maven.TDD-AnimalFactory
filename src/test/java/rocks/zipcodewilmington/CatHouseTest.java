package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    Cat cat;
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Before
    public void setUp() throws Exception {
        cat = new Cat("cat", new Date(), 0);
    }

    @After
    public void tearDown() {
        CatHouse.clear();
        System.out.println("CatHouse cleared");
    }

    @Test
    public void testAdd() {
       String expName = "cat";
       Integer expId = 0;
       Date expDate = cat.getBirthDate();

       CatHouse.add(cat);
       Cat actual = CatHouse.getCatById(0);

        Assert.assertEquals(expName, actual.getName());
        Assert.assertEquals(expId, actual.getId());
        Assert.assertEquals(expDate, actual.getBirthDate());
    }

    @Test
    public void testRemoveById() {
        CatHouse.remove(0);

        Cat actual = CatHouse.getCatById(0);

        Assert.assertNull(actual);
    }

    @Test
    public void testRemoveByCat() {
        CatHouse.add(cat);
        Cat getCat = CatHouse.getCatById(0);
        Integer expected = 0;

        Assert.assertNotNull(getCat);
        CatHouse.remove(getCat);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetCatById() {
        Cat expected = cat;
        CatHouse.add(expected);

        Cat actual = CatHouse.getCatById(cat.getId());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfCats() {
        CatHouse.add(cat);
        Integer expected = 1;

        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
