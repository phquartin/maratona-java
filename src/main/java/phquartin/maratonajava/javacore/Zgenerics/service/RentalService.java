package phquartin.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel.........");
        T t = objetosDisponiveis.removeFirst();
        System.out.println("Alugando objeto "+ t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("Retornando objeto alugado" + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
    }
}
