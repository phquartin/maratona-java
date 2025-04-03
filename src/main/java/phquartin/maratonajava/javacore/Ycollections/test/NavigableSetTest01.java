package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> navigableSet = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone nokia = new Smartphone("1234", "Nokia");
        Smartphone apple = new Smartphone("1234", "Apple");
        Smartphone canoa = new Smartphone("1234", "Canoa");
        Smartphone ifruit = new Smartphone("1234", "iFruit");
        navigableSet.add(nokia);
        navigableSet.add(apple);
        navigableSet.add(ifruit);
        navigableSet.add(canoa);
        System.out.println(navigableSet.descendingSet());
    }
}
