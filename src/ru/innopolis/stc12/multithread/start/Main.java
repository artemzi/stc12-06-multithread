package ru.innopolis.stc12.multithread.start;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        MyThread myThread1 = new MyThread("Thread 1");
        MyThread myThread2 = new MyThread("Thread 2");
        MyThread myThread3 = new MyThread("Thread 3");
        MyThread myThread4 = new MyThread("Thread 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread4.join();

        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("Завершение основного потока");


    }
}
