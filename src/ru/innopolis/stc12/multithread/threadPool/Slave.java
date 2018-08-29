package ru.innopolis.stc12.multithread.threadPool;

public class Slave {
    public Double count() {
        double sum = 0;
        for (int i = 1; i < 5_000_000; i++) {
            sum += 10000 / i;
        }
        return sum;
    }
}
