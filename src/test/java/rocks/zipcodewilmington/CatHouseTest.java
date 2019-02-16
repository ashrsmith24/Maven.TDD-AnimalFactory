package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd() {
        Cat expected = new Cat(null, null, null);
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(expected.getId());
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        Cat cat = new Cat(null, null, 10);
        int id = cat.getId();
        CatHouse.add(cat);
        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);
        Assert.assertNull(actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeWithNameOfCatTest() {
        Cat cat = new Cat(null, null, null);
        CatHouse.add(cat);
        Cat catFromCatHouse = CatHouse.getCatById(null);
        Assert.assertNull(catFromCatHouse);

        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(null);
        Assert.assertNull(actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        int expected = 1;
        Cat cat = new Cat(null, null, null);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
