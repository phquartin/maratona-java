package phquartin.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File dir = new File("pasta");
        boolean isDirCreated = dir.mkdir();
        if (isDirCreated) {
            System.out.println("Directory created");
        }
        File file = new File(dir, "texto.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
