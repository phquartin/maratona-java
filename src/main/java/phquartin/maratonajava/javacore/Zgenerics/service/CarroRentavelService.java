package phquartin.maratonajava.javacore.Zgenerics.service;

import phquartin.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carroList = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Audi"), new Carro("Honda")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponivel.........");
        Carro carro = carroList.removeFirst();
        System.out.println("Alugando carro "+ carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carroList);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Retornando carro alugado" + carro);
        carroList.add(carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carroList);
    }

}
