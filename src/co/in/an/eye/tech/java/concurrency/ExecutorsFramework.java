package co.in.an.eye.tech.java.concurrency;

import java.util.concurrent.*;

public class ExecutorsFramework {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(()->{
            System.out.println("Using runnable");
        });
        Future<?> submit1 = executorService.submit(() -> {
            String name = Thread.currentThread().getName();
            System.out.println("Current Thread : " + name);
            return "String";

        });
        System.out.println("Using Callable : submit : "+submit1.get());

        ExecutorService ex = Executors.newFixedThreadPool(3);
        Future<String> name = ex.submit(()-> Thread.currentThread().getName());
        ex.execute(()-> System.out.println("Runnable using execute : "+Thread.currentThread().getName()));
        System.out.println("Future Current thread : "+name.get());

        Callable<String> call = ()-> "new Thread using callable!";
        Future<String> submit = ex.submit(call);
        System.out.println("Return type by callable -> future ->submit : "+submit.get());
        ExecutorService scheduledExecService = Executors.newScheduledThreadPool(1);
    }
}
