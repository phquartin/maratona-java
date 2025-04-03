package phquartin.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path relativo = Paths.get("dev");
        Path absoluto = Paths.get("/home/maratona");

        System.out.println(absoluto.resolve(relativo));
        System.out.println(relativo.resolve(absoluto));

    }
}
