package phquartin.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Database...");
    }
}
