package phquartin.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int random = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < random; i++) {
            System.out.printf("%s executing callable...\n", Thread.currentThread().getName());
        }
        return String.format("%s finished executing callable and the random number is %d", Thread.currentThread().getName(), random);
    }
}

public class CallableTest01 {
    public static void main(String[] args) {
        RandomNumberCallable callable = new RandomNumberCallable();
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            Future<String> submit = executorService.submit(callable);
            Future<String> submit2 = executorService.submit(callable);
            Future<String> submit3 = executorService.submit(callable);
            System.out.println(submit.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
