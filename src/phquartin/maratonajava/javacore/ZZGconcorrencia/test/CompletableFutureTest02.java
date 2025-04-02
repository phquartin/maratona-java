package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import phquartin.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesSync(storeService);
    }

    private static void searchPricesSync(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("store1", "store2", "store3", "store4");

        List<CompletableFuture<Double>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
                .toList();

        List<Double> list1 = list.stream()
                .map(CompletableFuture::join)
                .toList();

        list1.forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.println("Time Passed SYNC " + ((end - start) / 1000) + " seconds\n\n");
    }
}
