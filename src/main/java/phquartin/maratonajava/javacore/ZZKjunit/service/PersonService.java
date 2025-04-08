package phquartin.maratonajava.javacore.ZZKjunit.service;

import phquartin.maratonajava.javacore.ZZKjunit.dominio.Person;

import java.util.Objects;

public class PersonService {

    public boolean isOlderThan18(Person person){
        Objects.requireNonNull(person, "Person cannot be null");
        return person.getAge() >= 18;
    }

}
