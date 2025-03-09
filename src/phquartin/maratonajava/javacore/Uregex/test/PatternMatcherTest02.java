package phquartin.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d Numeros
        // \D Tudo que nao for numero
        // \s Espacos em Branco
        // \S Todos os caracteres menos os em branco
        // \w a-z A-Z, numeros e _
        // \W caracteres especiais e espacos em branco
        String regex = "\\D";
        String texto = "h12h3d2jdijs@s123192jddjas";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.start() + " - " + matcher.group());
        }
    }
}
