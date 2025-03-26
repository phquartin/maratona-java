package phquartin.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}
class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animals = {new Gato(), new Cachorro()};

        consulta(cachorros);
        consulta(gatos);
        consulta(animals);
    }

    private static void consulta(Animal[] animal) {
        for (Animal a : animal) {
            a.consulta();
        }
        System.out.println("------------------");
    }

}
