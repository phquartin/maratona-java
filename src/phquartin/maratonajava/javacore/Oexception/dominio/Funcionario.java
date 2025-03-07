package phquartin.maratonajava.javacore.Oexception.dominio;

import javax.xml.stream.FactoryConfigurationError;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario");
    }
}
