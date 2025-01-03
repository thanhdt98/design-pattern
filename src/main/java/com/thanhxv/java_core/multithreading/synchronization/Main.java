package com.thanhxv.java_core.multithreading.synchronization;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                counter.increment();
//            }
            counter.incrementNoSynchronization();
        });

        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                counter.increment();
//            }
            counter.incrementNoSynchronization();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
