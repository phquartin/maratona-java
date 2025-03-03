package phquartin.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return 0.9 * valor;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return 0.85 * valor;
        }
    };

    public abstract double calcularDesconto(double valor);

}
