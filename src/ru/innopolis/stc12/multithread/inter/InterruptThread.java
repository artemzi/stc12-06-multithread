package ru.innopolis.stc12.multithread.inter;

import java.util.Random;

public class InterruptThread extends Thread {
    boolean inter;

    @Override
    public void run() {
        do {
            long sum = 0;
            Random random = new Random(1000);
            for (int i = 0; i < 100; i++) {
                sum += random.nextInt();
            }
        } while (!inter);
        System.out.println("Thread stopped");
    }
}
