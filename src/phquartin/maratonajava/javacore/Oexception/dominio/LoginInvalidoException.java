package phquartin.maratonajava.javacore.Oexception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String message) {
        super(message);
    }

    public LoginInvalidoException() { super(); }
}
