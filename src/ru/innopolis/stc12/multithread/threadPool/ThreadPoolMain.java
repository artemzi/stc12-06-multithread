package ru.innopolis.stc12.multithread.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(400);
        Slave slave = new Slave();
        long start = System.currentTimeMillis();

        List<Future<Double>> futures = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            //final int j = i;
            futures.add(CompletableFuture.supplyAsync(() -> slave.count(), threadPool));
        }

        double value = 0;
        for (Future<Double> future : futures) {
            value += future.get();
        }

        System.out.println("Результат " + value);
        System.out.println("Время " + (System.currentTimeMillis() - start));
        threadPool.shutdown();
    }
}
