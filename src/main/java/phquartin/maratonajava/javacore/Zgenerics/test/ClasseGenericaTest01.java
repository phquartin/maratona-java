package phquartin.maratonajava.javacore.Zgenerics.test;

import phquartin.maratonajava.javacore.Zgenerics.dominio.Carro;
import phquartin.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por 1 mes....");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
