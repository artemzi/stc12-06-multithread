package ru.innopolis.stc12.multithread.shop;

public class Consumer implements Runnable {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            store.get();
        }
    }
}
