package phquartin.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Pedro"; // String constant Pool
        String nome2 = "Pedro";
        System.out.println(nome == nome2); // Mesmo endereço de REFERÊNCIA no Pool de Strings
        String nome3 = new String("Pedro"); // 1 variavel de REF, 2 Cria um objeto do tipo String, 3 Cria uma string no pool de strings ( caso nao exista )
        System.out.println(nome3 == nome2);
        System.out.println(nome3.intern() == nome2); // intern puxa o endereço de referencia interno(do Pool)
    }
}
