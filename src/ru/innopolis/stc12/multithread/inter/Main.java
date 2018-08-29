package ru.innopolis.stc12.multithread.inter;

public class Main {
    public static void main(String[] args) {
        InterruptThread thread = new InterruptThread();
        thread.start();
        System.out.println("Thread started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("now try to stop");
        thread.interrupt();
    }
}
