package phquartin.maratonajava.javacore.Minterfaces.test;

import phquartin.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import phquartin.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();
        FileLoader fl = new FileLoader();
        db.load();
        fl.load();
        db.remove();
    }
}
