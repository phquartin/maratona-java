package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Users> lista = new ArrayList<>();
        Users user1 = new Users("John", 30);
        Users user2 = new Users("Peter", 18);
        Users user3 = new Users("Connor", 28);
        Users user4 = new Users("Jaime", 17);
        Users user5 = new Users("Alex", 34);
        Users user6 = new Users("Steve", 23);
        lista.add(user1);
        lista.add(user2);
        lista.add(user3);
        lista.add(user4);
        lista.add(user5);
        lista.add(user6);

        Collections.sort(lista);
        Users user = new Users("Steve", 23);
        int index = Collections.binarySearch(lista, user);
        System.out.println(index);
        System.out.println(lista.get(index));


    }
}