package com.codegym;

public class Main {

    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();

    }
}
