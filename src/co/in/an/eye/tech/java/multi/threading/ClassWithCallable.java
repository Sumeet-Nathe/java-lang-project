package co.in.an.eye.tech.java.multi.threading;

import java.util.concurrent.*;

public class ClassWithCallable implements Callable<String> {

    String message;

    public ClassWithCallable(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassWithCallable c = new ClassWithCallable("Sumeet");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(c);
        System.out.println(future.get());
        executorService.submit(() -> System.out.println("From Runnable : Hi Sumeet"));

        executorService.shutdown();
        //executorService.submit(()-> System.out.println("Hi"));
    }

    @Override
    public String call() {
        return "Hi " + message;
    }
}
