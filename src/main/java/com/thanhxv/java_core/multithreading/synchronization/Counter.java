package com.thanhxv.java_core.multithreading.synchronization;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + ":" + count);
    }

    public void incrementNoSynchronization() {
        for (int i = 0; i < 10000; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ":" + count);
        }
    }

    public int getCount() {
        return count;
    }
}
