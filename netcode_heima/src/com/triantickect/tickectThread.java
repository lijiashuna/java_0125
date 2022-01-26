package com.triantickect;

/**
 * 线程睡眠会使程序在sleep位置停住，导致数据出现延时，出现重复卖，以及卖负票
 *出现的情况分析：
 *              存在多个线程
 *              多个线程存在共享数据
 *              多个线程并发的访问数据
 *
 *public class tickectThread implements Runnable {
 *     int tickect_sum = 100;
 *
 *     @Override
 *     public void run() {
 *         while (true) {
 *             if (tickect_sum > 0) {
 *                 //---------------------------------------------------------
 *                 try {
 *                     Thread.sleep(1000);
 *                 } catch (InterruptedException e) {
 *                     e.printStackTrace();
 *                 }
 *                 //---------------------------------------------------------
 *                 System.out.println(Thread.currentThread().getName() + "  " + tickect_sum--);
 *             } else {
 *                 //System.out.println(Thread.currentThread().getName() + "  "+"we don't have any tickect for sale");
 *             }
 *         }
 *     }
 * }
 *
 * 解决方法：
 * synchronized：同步
 *               可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，
 *               则直接锁住，无法访问
 * 同步代码块：
 *           synchronized(锁对象){
 *
 *           }
 *notice:锁对象需要被所有线程共享
 *        静态同步方法的锁对象是当前字节码对象
 *        public synchronized static void method(){
 *        非静态同步方法的对象是this
 *        public synchronized void method(){
 *
 * 同步：效率低，安全性高
 * 非同步：效率高，安全性低
 */


public class tickectThread implements Runnable {
    int tickect_sum = 100;
    Object obj =new Object();

    @Override
    public void run() {
        while(true) {
//            synchronized (obj){
//               method();
//            }
            method();
        }
    }
//
    public synchronized void method(){
        if (tickect_sum > 0) {
            //---------------------------------------------------------
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //---------------------------------------------------------
            System.out.println(Thread.currentThread().getName() + "  " + tickect_sum--);
        }
        //else {
        //System.out.println(Thread.currentThread().getName() + "  "+"we don't have any tickect for sale");
        //}
    }


}
