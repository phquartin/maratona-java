package phquartin.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading Database...");
    }
}
