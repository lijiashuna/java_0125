package com.net_code;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 使用UDP协议接收数据步骤
 * 1.创建Socket对象
 * 2.接收数据
 * 3.解析数据
 * 4.数据检查，---测试输出
 * 5.释放资源
 */

public class UDPreceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] bys = new byte[1024];
        int length = 1024;
        DatagramPacket dp = new DatagramPacket(bys, length);
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        System.out.println(address);
        int lens = dp.getLength();
        byte[] item = dp.getData();
        System.out.println(new String(address.getHostName()));
        System.out.println(new String(address.getHostAddress()));
        System.out.println(lens);
        System.out.println(new String(item));
        ds.close();

    }

}
