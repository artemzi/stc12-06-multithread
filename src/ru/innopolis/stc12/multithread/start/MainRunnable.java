package ru.innopolis.stc12.multithread.start;

public class MainRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Завершение");
    }
}
