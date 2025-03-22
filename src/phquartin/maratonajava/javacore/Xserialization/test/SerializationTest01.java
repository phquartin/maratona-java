package phquartin.maratonajava.javacore.Xserialization.test;

import phquartin.maratonajava.javacore.Xserialization.dominio.Aluno;
import phquartin.maratonajava.javacore.Xserialization.dominio.Turma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Pedro", "admin", new Turma("1A"));
        serialize(aluno);
        Aluno alunoSerialize = (Aluno) unserialize();
        System.out.println(alunoSerialize);
    }

    private static void serialize(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static Object unserialize() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

}
