package phquartin.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir(){
        System.out.println("-------------------------------");
        System.out.println("Marca: " + this.marca
        + "\nVelocidade Maxima: " + this.velocidadeMaxima
        + "\nVelocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
