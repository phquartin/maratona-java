package phquartin.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Banco {
    private static int contador;
    private static double juros;
    private int id;
    private String nome;
    private String CPF;
    private double saldo;

    static{
        Banco.juros = 1.3;
    }

    {
        this.id = ++Banco.contador;
    }

    public Banco(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public static int getContador() {
        return Banco.contador;
    }

    public static double getJuros() {
        return Banco.juros;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
