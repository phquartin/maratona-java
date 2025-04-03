package phquartin.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello World");
            bw.newLine();
            bw.write("My name is Pedro");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
