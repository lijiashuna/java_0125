package com.net_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class loginserveDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket so=ss.accept();
        BufferedReader buf= new BufferedReader(new InputStreamReader(so.getInputStream()));
        String username=buf.readLine();
        String password=buf.readLine();
        boolean flag=false;
//        if(username.equals("xiaoli" )&& password.equals("970128")){
//            flag=true;
//        }
        List<login_User> users =login_database.getusers();
        login_User user=new login_User(username,password);
        if(users.contains(user)){
            flag=true;
        }
        PrintWriter out=new PrintWriter(so.getOutputStream(),true);
        if(flag){
            out.println("you had login system successfully !");
        }
        else{
            out.println("you had login system failed !");
        }
        so.close();


    }
}
