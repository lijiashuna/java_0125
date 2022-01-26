package com.itheima_01;

public class mythread_runable implements Runnable {

    @Override
    public void run() {
        int i = 100;
        for (int i1 = 0; i1 < i; i1++) {
//            Thread tm = Thread.currentThread();
//            System.out.println(tm + ": " + i);
            System.out.println(Thread.currentThread().getName()+ ": " + i1);
        }

    }
}
