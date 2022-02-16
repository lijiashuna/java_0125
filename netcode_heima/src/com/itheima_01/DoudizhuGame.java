package com.itheima_01;

import java.util.ArrayList;
import java.util.Collections;

public class DoudizhuGame {
    public static ArrayList<String> cards= new ArrayList<>();
    static {
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] flower={"♠","♥","♦","♣"};
        for (String value : number) {
            for (String s : flower) {
                cards.add(value + s);
            }
        }
        cards.add("大王");
        cards.add("小王");
    }

    public static void main(String[] args) {
        //System.out.println(cards.size());
        Collections.shuffle(cards);
        ArrayList<String> player1=new ArrayList<>(cards.subList(0,17));
        ArrayList<String>player2=new ArrayList<>(cards.subList(17,34));
        ArrayList<String>player3=new ArrayList<>(cards.subList(34,51));
        for (int i2 = 0; i2 < player1.size(); i2++) {
            System.out.print(i2==16?player1.get(i2)+"\n":player1.get(i2)+" ");///换行输出
        }
        System.out.println("---------------------------");
        for (String value : player2) {
            System.out.print(value);
        }
        System.out.println("---------------------------");
        for (String s : player3) {
            System.out.print(s);
        }
        System.out.println("---------------------------");
        for (int i5 = 51; i5 < 54; i5++) {
            System.out.print(i5==53?cards.get(i5)+"\n":cards.get(i5)+" ");
        }

//        while(i<54){
//            int now=rand.nextInt(54);
//            for (int i1 = 0; i1 < visited.length; i1++) {
//                if(now==visited[i1]){
//                    continue;
//                }
//            }
//            for (int j1 = 0; j1 < visited.length; j1++) {
//                if(visited[j1]==0){
//                    visited[j1]=now;
//                }
//            }
 //       }



    }
}
