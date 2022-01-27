package com.net_code;

import java.io.IOException;
import java.net.*;

/**
 * UDP发送数据四个步骤
 * 1.创建发送端socket对象
 * 2.创建并打包
 * 3.发送数据
 * 4.断开资源
 * class DatagramSocket:此类用来表示数据的接受和发送是基于UDP协议的
 * DatagramSocket()        随机端口号  ...发送端可无参构造
 * DatagramSocket(int port)  创建socket对象并指定端口号
 * DatagramPacket:此类表示数据包
 */

public class UDPsendDemo {
    public static void main(String[] args) throws IOException {
        //create a DatagramSocket item
        DatagramSocket ds = new DatagramSocket();
        /**
         * DatagramPacket:此类表示数据包
         * 内容：
         *      数据byte[]
         *      接受设备的ip
         *      进程地址（端口号  port）
         * DatagramPacket(byte[] buf, int length, InetAddress address, int port)
         *
         */
        String s = "hello UDP i am here and coming again";
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("LAPTOP-BJ4THLCS");
        System.out.println(address);
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        ds.send(dp);
        ds.close();
    }
}
