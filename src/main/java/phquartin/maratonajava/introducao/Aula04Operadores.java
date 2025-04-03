package phquartin.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02 + numero01);
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = numero01 % numero02;
        System.out.println(resto);

        // > < == != => =<
        System.out.println(resto <= numero02);
        System.out.println(resto >= numero01);
        System.out.println(resto == numero02);
        System.out.println(resto != numero01);

        // && (AND) || (OR) ! (NOT)
        int idade = 18;
        float salario = 5500.0F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 1000;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;
        boolean comprarPlaystation = valorTotalContaPoupanca >= valorPlaystation || valorTotalContaCorrente >= valorPlaystation;
        System.out.println("Playstation compravel = "+comprarPlaystation);

        // = += -= *= /= %=
        double bonus = 1000;
        bonus += 1000;
        bonus -= 500;
        System.out.println("Bonus = "+bonus);
    }
}
