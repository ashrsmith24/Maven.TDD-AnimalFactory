package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest() {
        //given
        Dog dog = new Dog(null, null, null);
        //given
        String expected = "Cash";
        //when
        String actual = dog.getName();
        dog.setName(expected);
        //then
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //given
        Dog dog = new Dog(null, null, null);

        //when
        String actual = dog.speak();
        String expected = dog.speak();
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //given
        Dog dog = new Dog(null, null, null);
        //given
        Date expected = new Date();
        //when
        dog.setBirthDate(expected);
        //when
        Date actual = dog.getBirthDate();
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        //given

        Dog dog = new Dog(null, null,null);

        int preMealCount = dog.getNumberOfMealsEaten();
        int expected = preMealCount + 1;

        //when
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        //given
        Dog dog = new Dog(null, null, null);
        boolean outcome = dog instanceof Animal;
        Assert.assertTrue(outcome);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        //given
        Dog dog = new Dog(null, null, null);
        boolean result = dog instanceof Mammal;
        Assert.assertTrue(result);
    }

}

