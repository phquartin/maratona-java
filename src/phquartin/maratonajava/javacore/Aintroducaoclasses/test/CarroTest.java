package phquartin.maratonajava.javacore.Aintroducaoclasses.test;

import phquartin.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.Marca = "Hyundai";
        carro1.Modelo = "HB20";
        carro1.Ano = 2022;
        carro2.Marca = "Wolkswagen";
        carro2.Modelo = "Polo";
        carro2.Ano = 2021;

        System.out.println("Marca: " + carro1.Marca +" | Modelo: " + carro1.Modelo + " | Ano: " + carro1.Ano);
        System.out.println("Marca: " + carro2.Marca +" | Modelo: " + carro2.Modelo + " | Ano: " + carro2.Ano);
    }
}
