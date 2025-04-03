package phquartin.maratonajava.javacore.Npolimorfismo.test;

import phquartin.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import phquartin.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();

    }
}
