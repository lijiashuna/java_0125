package com.triantickect;

/**
 * 模拟火车站售票系统
 * 分析：
 *      指定车票总数
 *      当剩余车票不足一张时停止售票
 *      使用多线程模拟多个窗口售票
 *      当火车票售馨仍然保持开门
 *      static void sleep(long millis):让当前线程睡一会儿
 *      long millis单位为毫秒
 */

public class TickectTest {
    public static void main(String[] args) {
        tickectThread it=new tickectThread();

        Thread it1= new Thread(it);
        it1.setName("windows 01");
        Thread it2= new Thread(it);
        it2.setName("windows 02");
        Thread it3= new Thread(it);
        it3.setName("windows 03");
        Thread it4= new Thread(it);
        it4.setName("windows 04");
        it1.start();
        it2.start();
        it3.start();
        it4.start();



    }

}
