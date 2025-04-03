package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        return switch (country) {
            case EUA -> new USD();
            case BRAZIL -> new Real();
        };
    }
}
