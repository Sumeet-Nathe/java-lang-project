package co.in.an.eye.tech.java.concurrency.fork.join;

import java.util.concurrent.RecursiveTask;

public class SearchCount extends RecursiveTask<Integer> {
    int a[];
    int start;
    int end;
    int element;

    public SearchCount(int[] a, int start, int end, int element) {
        this.a = a;
        this.start = start;
        this.end = end;
        this.element = element;
    }

    @Override
    protected Integer compute() {
        return count();
    }


    private Integer count() {
        int count = 0;
        int pos = 0;
        for (int i : a
        ) {
            if (element == i) {
                System.out.println("Array index Postions : "+pos);
                count++;
            }
            pos++;
        }
        return count;
    }
}
