package ru.innopolis.stc12.multithread.start;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        int iterations = 5_000_000;
        double sum = 0;
        for (int i = 1; i < iterations; i++) {
            sum += 10000 / i;
        }
        System.out.println(sum);
    }
}
