package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import phquartin.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        //searchPricesAsync(storeService);
        searchPricesCompletableAsync(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println();
        System.out.println(storeService.getPriceSync("Store1"));
        System.out.println(storeService.getPriceSync("Store2"));
        System.out.println(storeService.getPriceSync("Store3"));
        System.out.println(storeService.getPriceSync("Store4"));
        long end = System.currentTimeMillis();
        System.out.println("Time Passed SYNC " + ((end - start) / 1000) + " seconds\n\n");
    }


    private static void searchPricesAsync(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> store1 = storeService.getPriceAsync("Store1");
        Future<Double> store2 = storeService.getPriceAsync("Store2");
        Future<Double> store3 = storeService.getPriceAsync("Store3");
        Future<Double> store4 = storeService.getPriceAsync("Store4");
        System.out.println();
        try {
            store1.get();
            store2.get();
            store3.get();
            store4.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            StoreService.shutdown();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Passed ASYNC " + ((end - start) / 1000) + " seconds");
    }

    private static void searchPricesCompletableAsync(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> store1 = storeService.getPriceCompletableAsync("Store1");
        CompletableFuture<Double> store2 = storeService.getPriceCompletableAsync("Store2");
        CompletableFuture<Double> store3 = storeService.getPriceCompletableAsync("Store3");
        CompletableFuture<Double> store4 = storeService.getPriceCompletableAsync("Store4");
        System.out.println();

        store1.join();
        store2.join();
        store3.join();
        store4.join();
        long end = System.currentTimeMillis();
        System.out.println("Time Passed ASYNC " + ((end - start) / 1000) + " seconds");
    }
}
