package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.valueOf("Brazil".toUpperCase()));
        System.out.println(currency.getSymbol());
    }
}
