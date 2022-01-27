package com.net_code;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class interaddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("itheima");
        //LAPTOP-BJ4THLCS
        //System.out.println(address);
        //InetAddress address=InetAddress.getByAddress("LAPTOP-BJ4THLCS");
        System.out.println(address);
        String hostname=address.getHostName();
        String hostaddress=address.getHostAddress();
        System.out.println(hostname);
        System.out.println(hostaddress);
    }
}
