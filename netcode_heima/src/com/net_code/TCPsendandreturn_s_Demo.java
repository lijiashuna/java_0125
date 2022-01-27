package com.net_code;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPsendandreturn_s_Demo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket ss=new Socket(InetAddress.getByName("LAPTOP-BJ4THLCS"),10086);
        //创建输出流
        OutputStream os=ss.getOutputStream();
        //输出数据
        os.write("tcp iam comming again".getBytes());


        //接受数据,也可以指定新端口
//        ServerSocket so=new ServerSocket(1086);
//        Socket sso=so.accept() ;
        InputStream is= ss.getInputStream();
        byte[] bys_back=new byte[1024];
        int lens;
        lens=is.read(bys_back);
        System.out.println(new String(bys_back,0,lens));
        ss.close();

    }
}
