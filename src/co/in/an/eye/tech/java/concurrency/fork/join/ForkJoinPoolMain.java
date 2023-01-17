package co.in.an.eye.tech.java.concurrency.fork.join;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class ForkJoinPoolMain {
    public static void main(String[] args) {
        int proc = Runtime.getRuntime().availableProcessors();
        System.out.println("numbers of core available in your processor:"  +proc);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        System.out.println(" Before invoking number of active thread   :" +pool.getActiveThreadCount());
        int a[] = {1, 2, 3, 4, 5, 6, 7, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4};
        SearchCount searchCount = new SearchCount(a, 0, a.length, 3);
        Integer count = pool.invoke(searchCount);
        System.out.println("Count of 3 : " + count);
        System.out.println(" After invoking Numbers of active thread   :" +pool.getActiveThreadCount());
        System.out.println("Common Pool Size   :" +pool.getPoolSize());
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4};
        System.out.printf(String.valueOf(Stream.of(arr).count()));

    }
}
