package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()),
                () -> assertEquals(Long.valueOf(1l), person.getId()));
    }

    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test props Set",
                () -> assertEquals("Joe2", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Buckx", person.getLastName(), "Last Name Failed"),
                () -> assertEquals(Long.valueOf(1l), person.getId(), "Id failed"));
    }
}