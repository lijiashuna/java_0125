package com.net_code;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用TCP发送数据
 *      1.创建socket对象
 *      2.获取输出对象
 *      3.发送数据
 *      4.释放资源
 * 发送端又称客户端 client
 */

public class TCPsendDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("LAPTOP-BJ4THLCS"),10086);
        OutputStream os=s.getOutputStream();
        String str="hello tcp iam comming";
        os.write(str.getBytes());
        os.close();
        s.close();
    }
}
