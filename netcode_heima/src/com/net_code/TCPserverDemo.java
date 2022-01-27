package com.net_code;
/**
 *使用TCP获取数据步骤
 *      1.创建Socket对象
 *      2.监听<阻塞>
 *      3.获取输入流对象
 *      4.输出数据***
 *      5.释放资源
 */


import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        InetAddress address=s.getInetAddress();
        len= is.read(bys);
        System.out.println(address.getHostName());
        System.out.println(new String(bys,0,len));
    }

}
