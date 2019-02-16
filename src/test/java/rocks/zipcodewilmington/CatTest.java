package rocks.zipcodewilmington;

import org.junit.Assert;
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
    @Test
    public void setNameTest() {
        //given
        Cat cat = new Cat(null, null, null);
        //given
        String expected = "Zula";
        //when
        String actual = cat.getName();
        cat.setName(expected);
        //then

        Assert.assertEquals(expected, actual);
    }
        // TODO - Create tests for `speak`
        @Test
        public void speakTest() {
            //given
            Cat cat = new Cat(null, null, null);

            //when
            String actual = cat.speak();
            String expected =cat.speak();
            //then
            Assert.assertEquals(expected, actual);
        }
        // TODO - Create tests for `setBirthDate(Date birthDate)`
        @Test
        public void setBirthDateTest() {
            //given
            Cat cat = new Cat(null, null, null);
            //given
            Date expected = new Date();
            //when
            cat.setBirthDate(expected);
            //when
            Date actual = cat.getBirthDate();
            //then
            Assert.assertEquals(expected, actual);
        }
            // TODO - Create tests for `void eat(Food food)`
            @Test
            public void eatTest () {
                //given
                Cat cat = new Cat(null, null, null);
                int preMealCount = cat.getNumberOfMealsEaten();
                int expected = preMealCount + 1;

                //when
                cat.eat(new Food());
                int actual = cat.getNumberOfMealsEaten();

                //then
                Assert.assertEquals(expected, actual);
            }
            // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
            @Test
            public void testAnimalInheritance() {
                //given
                Cat cat = new Cat(null, null, null);
                boolean outcome = cat instanceof Animal;
                Assert.assertTrue(outcome);
            }
                // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
                @Test
                public void testMammalInheritance() {
                    Cat cat = new Cat(null, null, null);
                    boolean result = cat instanceof Mammal;
                    Assert.assertTrue(result);
                }
                @Test
                public void constructorTest () {

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
            }