package phquartin.maratonajava.javacore.Ycollections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(4, "D");
        map.put(1, "A");
        map.put(5, "E");
        map.put(3, "C");
        map.put(2, "B");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
