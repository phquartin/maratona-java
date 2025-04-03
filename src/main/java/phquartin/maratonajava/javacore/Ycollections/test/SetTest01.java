package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Users;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Users> usersSet = new LinkedHashSet<>();
        Users user1 = new Users("John", 30);
        Users user2 = new Users("Peter", 18);
        Users user3 = new Users("Connor", 28);
        Users user4 = new Users("Jaime", 17);
        Users user5 = new Users("Alex", 34);
        Users user6 = new Users("Steve", 23);
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        usersSet.add(user5);
        usersSet.add(user6);

        System.out.println(usersSet);
    }
}
