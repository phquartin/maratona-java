package phquartin.maratonajava.javacore.Ycollections.dominio;

public class Smartphone {
    private String serial;
    private String marca;

    public Smartphone(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
