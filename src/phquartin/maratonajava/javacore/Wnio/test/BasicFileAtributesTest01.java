package phquartin.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAtributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/arquivo.txt");

        BasicFileAttributes BasicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println(BasicFileAttributes.creationTime());
        System.out.println(BasicFileAttributes.lastModifiedTime());
        System.out.println(BasicFileAttributes.lastAccessTime());

    }
}
