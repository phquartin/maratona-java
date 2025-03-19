package phquartin.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String dir = "home/pedro/dev";
        String path = "/../../texto.txt";
        Path arquivo = Paths.get(dir, path);
        System.out.println(arquivo);
        System.out.println(arquivo.normalize());
    }
}
