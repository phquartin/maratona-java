package phquartin.maratonajava.javacore.ZZKjunit.service;

import org.junit.jupiter.api.Test;
import phquartin.maratonajava.javacore.ZZKjunit.dominio.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    /**
     * Class under test: PersonService
     * Method: isOlderThan18
     * Description: This method checks if a person is 18 years or older.
     */

    @Test
    void shouldReturnTrueWhenPersonIs18YearsOld() {
        // Arrange
        Person person = new Person(18);
        PersonService personService = new PersonService();

        // Act
        boolean result = personService.isOlderThan18(person);

        // Assert
        assertTrue(result, "Expected the method to return true for a person who is 18 years old.");
    }

    @Test
    void shouldReturnTrueWhenPersonIsOlderThan18YearsOld() {
        // Arrange
        Person person = new Person(25);
        PersonService personService = new PersonService();

        // Act
        boolean result = personService.isOlderThan18(person);

        // Assert
        assertTrue(result, "Expected the method to return true for a person who is older than 18 years.");
    }

    @Test
    void shouldReturnFalseWhenPersonIsYoungerThan18YearsOld() {
        // Arrange
        Person person = new Person(17);
        PersonService personService = new PersonService();

        // Act
        boolean result = personService.isOlderThan18(person);

        // Assert
        assertFalse(result, "Expected the method to return false for a person who is younger than 18 years.");
    }

    @Test
    void shouldThrowExceptionWhenPersonIsNull() {
        // Arrange
        PersonService personService = new PersonService();

        // Act & Assert
        assertThrows(NullPointerException.class,
                () -> personService.isOlderThan18(null),
                "Expected the method to throw NullPointerException when the person is null.");
    }
}