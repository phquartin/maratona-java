package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        nome.add("Maratona");
        nome.add("Rodrigo");
        nome.add("Java");
        for (String s : nome) {
            System.out.println(s);
            System.out.println(nome.indexOf(s));
        }
    }
}
