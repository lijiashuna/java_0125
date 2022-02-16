package com.computer_m_k;

/**
 * 实现类
 */

public class KeyBoard implements USB {
    public KeyBoard(String name) {
        this.name = name;
    }

    private String name;

    public void KnockKeyboard(){
        System.out.println("guys are knocking keyboard ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+" keyboard was connect from computer  successfully !");

    }

    @Override
    public void unconnect() {
        System.out.println(name+" keyboard was out of connect from computer successfully !");

    }
}
