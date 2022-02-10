package com.luckynumber;



import java.util.Random;
import java.util.Scanner;

public class LuckynumberGame {
    public static void main(String[] args) {
        int[] luckynumbers=setluckynumbers();
        for (int i = 0; i < luckynumbers.length; i++) {
            System.out.println(luckynumbers[i]);
        }
        int[] userluckynubers=get_usrtluckynumber();
        boolean res=compare(luckynumbers,userluckynubers);
        System.out.println(res);



    }
    public static boolean compare(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static int[] get_usrtluckynumber(){
        int[] userluckynuber=new int[7];
        System.out.println("please input your seven luckynumbers as follows");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            userluckynuber[i]=sc.nextInt();
        }
        return userluckynuber;
    }

    public static int[] setluckynumbers(){
        int[] luchynumbers= new int[7];
        Random rand =new Random();
        for (int i = 0; i < luchynumbers.length-1; i++) {
            while(true) {
                int new_data = rand.nextInt(32) + 1;
                for (int j = 0; j < i; j++) {
                    if (luchynumbers[j] == new_data) {
                        continue;
                    }
                }
                luchynumbers[i] = new_data;
                break;
            }
        }
        luchynumbers[6]=rand.nextInt(16)+1;
        return luchynumbers;
    }
}
