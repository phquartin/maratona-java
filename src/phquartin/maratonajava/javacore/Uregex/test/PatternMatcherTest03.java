package phquartin.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d Numeros
        // \D Tudo que nao for numero
        // \s Espacos em Branco
        // \S Todos os caracteres menos os em branco
        // \w a-z A-Z, numeros e _
        // \W caracteres especiais e espacos em branco
        // []
        String regex = "[a-zA-C]";
        String texto = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(STR."\{matcher.start()} - \{matcher.group()}");
        }
    }
}
