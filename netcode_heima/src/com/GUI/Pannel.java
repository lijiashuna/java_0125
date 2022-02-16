package com.GUI;

import javax.swing.*;

public class Pannel {
    public static void main(String[] args) {
        JFrame win=new JFrame("登陆界面");
        JButton btn=new JButton("登录按钮");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("handsome guys is click me now !");
//            }
//        });
        btn.addActionListener(e ->System.out.println("handsome guys is click me now !"));
        JPanel jp=new JPanel();
        jp.add(btn);
        win.add(jp);
        win.setSize(400,300);
        win.setResizable(false);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
