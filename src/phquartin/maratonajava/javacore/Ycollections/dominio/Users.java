package phquartin.maratonajava.javacore.Ycollections.dominio;

import java.util.Comparator;
import java.util.Objects;

public class Users implements Comparable<Users> {
    private static Long maxId = 0L;

    private final Long ID;
    private String nome;
    private int age;

    public Users(String nome, int age) {
        Objects.requireNonNull(nome, "Nome nao pode ser NULL");
        this.ID = ++maxId;
        this.nome = nome;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(ID, users.ID) && Objects.equals(nome, users.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nome, age);
    }

    @Override
    public int compareTo(Users o) {
        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return STR."Users{id=\{ID}, nome='\{nome}', age=\{age}}";
    }

    public Long getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
