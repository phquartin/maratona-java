package phquartin.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int codigo;
    private String nome;
    TipoCliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public static TipoCliente obterTipoCliente(int codigo) {
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (tipoCliente.getCodigo() == codigo) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
