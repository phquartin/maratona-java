package phquartin.maratonajava.javacore.ZZGconcorrencia.service;

import phquartin.maratonajava.javacore.ZZGconcorrencia.dominio.Discount;
import phquartin.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPriceSync(String storeName){
        double price = priceGenerator();
        Discount.Code code = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format(Locale.US,"%s:%.2f:%s",storeName, price, code);
    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * ((100 - quote.getCode().getPercentage()) / 100.0 );
        return String.format(Locale.US, "'%s' original price: '%.2f'. Applying discount code '%s'. Final price '%.2f'",
                quote.getStrore(),
                quote.getPrice(),
                quote.getCode(),
                discountValue
        );
    }

    private double priceGenerator(){
        delay();
        return ThreadLocalRandom.current().nextDouble(1,500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
