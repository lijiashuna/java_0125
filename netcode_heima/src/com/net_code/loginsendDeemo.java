package com.net_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class loginsendDeemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket so =new Socket("LAPTOP-BJ4THLCS",8888);
        //获取用户名和密码
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input your account username");
        String username=br.readLine();
        System.out.println("please input your account password");
        String password=br.readLine();
        //创建输出对象
        PrintWriter out=new PrintWriter(so.getOutputStream(),true);
        out.println(username);
        out.println(password);

        BufferedReader buf= new BufferedReader(new InputStreamReader(so.getInputStream()));
        String result=buf.readLine();
        System.out.println(result);
        so.close();
    }
}
