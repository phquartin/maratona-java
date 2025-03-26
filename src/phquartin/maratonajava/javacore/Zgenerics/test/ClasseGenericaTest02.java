package phquartin.maratonajava.javacore.Zgenerics.test;

import phquartin.maratonajava.javacore.Zgenerics.dominio.Barco;
import phquartin.maratonajava.javacore.Zgenerics.dominio.Carro;
import phquartin.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import phquartin.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Audi"), new Carro("Honda")));
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Jetski"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(carroList);

        Carro carro = rentalService.buscarObjetoDisponivel();
        rentalService.retornarCarroAlugado(carro);
        Carro carro2 = rentalService.buscarObjetoDisponivel();
        rentalService.retornarCarroAlugado(carro2);

        System.out.println("-----------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoList);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        rentalServiceBarco.retornarCarroAlugado(barco);
    }
}
