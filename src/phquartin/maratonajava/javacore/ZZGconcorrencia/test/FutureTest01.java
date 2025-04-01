package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Future<Double> dollar = executorService.submit(() -> {
                TimeUnit.SECONDS.sleep(4);
                return 5.76D;
            });
            System.out.println(doingSometging());
            System.out.println(dollar.get(3, TimeUnit.SECONDS));
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }


    private static long doingSometging(){
        System.out.println("doing something");
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}

