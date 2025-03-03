package phquartin.maratonajava.javacore.Npolimorfismo.servico;

import phquartin.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Arquivo");
    }
}
