package com.net_code;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPsendandreturn_r_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket sss=new ServerSocket(10086);
        Socket s=sss.accept();
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len;
        len=is.read(bys);
        String tmp=new String(bys,0,len);
        System.out.println(tmp);
        String r_back=tmp.toUpperCase();
        //Socket back_s=new Socket(InetAddress.getByName("LAPTOP-BJ4THLCS"),1086);
        OutputStream os=s.getOutputStream();
        os.write(r_back.getBytes());



    }
}
