package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd() {
        Dog expected = new Dog(null, null, null);
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(expected.getId());
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        Dog dog = new Dog(null, null, 10);
        int id = dog.getId();
        DogHouse.add(dog);
        DogHouse.remove(id);
        Dog actual = DogHouse.getDogById(id);
        Assert.assertNull(actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTestWithNameOfDog() {
        Dog dog = new Dog(null, null, null);
        DogHouse.add(dog);
        Dog dogFromDogHouse = DogHouse.getDogById(null);
        Assert.assertNull(dogFromDogHouse);

        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(null);
        Assert.assertNull(actual);

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
        public void getNumberOfDogsTest () {
            int expected = 1;
            Dog dog = new Dog(null, null, null);
            int actual = DogHouse.getNumberOfDogs();
            Assert.assertEquals(expected, actual);

        }
        public void testGetNumberOfDogs () {

                // Given (some
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
