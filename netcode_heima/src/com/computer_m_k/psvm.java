package com.computer_m_k;

public class psvm {
    public static void main(String[] args) {
        Computer computer=new Computer("xiaoli");
        USB mouse=new Mouse("hp");
        USB keyboard =new KeyBoard("huawei");
        //用USB这个接口类来实例 Mouse这个实现类，多态的应用
        computer.installUSB(mouse);
        computer.installUSB(keyboard);
    }
}
