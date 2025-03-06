package phquartin.maratonajava.javacore.Oexception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo(){
        File file = new File("aruivo\\test.tx");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println(isCriado);
        }catch (IOException e) {
            System.out.println("Erro ao criar arquivo");
        }
    }
}
