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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Smartphone that = (Smartphone) obj;
        return serial.equals(that.serial) && marca.equals(that.marca);
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
