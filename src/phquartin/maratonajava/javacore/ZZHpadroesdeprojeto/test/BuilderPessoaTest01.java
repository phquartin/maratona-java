package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPessoaTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("John")
                .lastName("Doe")
                .username("john")
                .email("john@doe.com")
                .build();

        System.out.println(build);
    }
}
