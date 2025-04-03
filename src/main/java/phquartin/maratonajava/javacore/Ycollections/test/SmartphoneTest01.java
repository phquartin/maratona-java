package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("12345", "iPhone");
        Smartphone phone2 = new Smartphone("28374", "Samsung");
        Smartphone phone3 = new Smartphone("13455", "Xiomi");

        List<Smartphone> phones = new ArrayList<Smartphone>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);

        for (Smartphone phone : phones) {
            System.out.println(phone);
        }

        Smartphone phone4 = new Smartphone("13455", "Xiomi");
        int indexOf = phones.indexOf(phone4);
        System.out.println((indexOf == -1) ? indexOf : phones.get(indexOf));

    }
}
