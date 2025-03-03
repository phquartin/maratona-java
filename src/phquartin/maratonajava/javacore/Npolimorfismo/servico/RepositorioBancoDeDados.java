package phquartin.maratonajava.javacore.Npolimorfismo.servico;

import phquartin.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando banco de dados");
    }
}
