package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import phquartin.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import phquartin.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        //searchPricesWithDiscountSync(service);
        searchPricesWithDiscountAsync(service);

    }
    private static void searchPricesWithDiscountSync(StoreServiceWithDiscount service) {
        List<String> stores = List.of("store1", "store2", "store3", "store4");

        //stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        List<String> stores = List.of("store1", "store2", "store3", "store4");

        //stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        List<CompletableFuture<String>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .toList();
        list.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

    }
}
