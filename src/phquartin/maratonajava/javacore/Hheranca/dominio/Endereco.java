package phquartin.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String CEP;

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", CEP='" + CEP + '\'' +
                '}';
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
