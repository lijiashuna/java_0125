package com.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please input user's arr :");
        int [] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println(arr[0]);

    }


}
