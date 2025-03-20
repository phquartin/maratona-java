package phquartin.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args){
        Path path = Paths.get("/home/pedro/IdeaProjects/maratona-java/src/phquartin/maratonajava/javacore");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
