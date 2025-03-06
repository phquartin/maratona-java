package phquartin.maratonajava.javacore.Oexception.test;

import phquartin.maratonajava.javacore.Oexception.dominio.Leitor1;
import phquartin.maratonajava.javacore.Oexception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
            System.out.println("ler ler ler usar usar usar");
        }catch (IOException e){
            System.out.println("IO EXCEPTION");
        }
    }
}
