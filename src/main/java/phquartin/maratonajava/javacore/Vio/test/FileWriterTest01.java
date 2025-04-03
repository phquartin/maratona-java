package phquartin.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
