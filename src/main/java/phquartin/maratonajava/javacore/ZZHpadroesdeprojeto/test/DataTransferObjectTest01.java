package phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import phquartin.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder("Pedro")
                .lastName("Matos")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
