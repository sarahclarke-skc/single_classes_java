import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("John", "Smith", 10, 4.5);
    }

    @Test
    public void hasPersonFirstName() {
        assertEquals("John", person.getFirstName());
    }

    @Test
    public void hasPersonLastName() {
        assertEquals("Smith", person.getLastName());
    }

    @Test
    public void hasPersonAge() {
        assertEquals(10, person.getAge());
    }

    @Test
    public void hasPersonHeight() {
        assertEquals(4.5, person.getPersonHeight(), 0.0);
    }

    @Test
    public void checkFullName() {
        assertEquals("John Smith", person.fullName());
    }

    @Test
    public void checkAgeIncreases() {
        assertEquals(11, person.increaseAge());
    }

    @Test
    public void checkHeightIncreases() {
        assertEquals(4.6, person.increaseHeight(), 0.0);
    }

    @Test
    public void checkHeightIncreasesWithAge() {
        person.increaseHeightWithAge();
        assertEquals(11, person.getAge());
        assertEquals(4.6, person.getPersonHeight(), 0.0);
    }
}
