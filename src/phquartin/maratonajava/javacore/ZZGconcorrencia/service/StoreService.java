package phquartin.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("%s loja gerando o preco\n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPriceAsync(String storeName){
        System.out.printf("%s loja gerando o preco\n", storeName);
        return executorService.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPriceCompletableAsync(String storeName){
        System.out.printf("%s loja gerando o preco\n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator(){
        System.out.printf("%s generating price\n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextDouble(1,500) * 10;
    }

    public static void shutdown(){
        executorService.shutdown();
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
