package phquartin.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/pedro/IdeaProjects/maratona-java/pasta");
        Path file = Paths.get(dir.toString(), "texto.txt");
        try {
            Path txtPath = Files.createFile(file);
            System.out.println(txtPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
