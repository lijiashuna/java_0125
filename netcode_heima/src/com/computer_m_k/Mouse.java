package com.computer_m_k;

public class Mouse implements USB{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void clickMouse(){
        System.out.println("guys are click mouse !");
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(this.name+"mouse is connected !");

    }

    @Override
    public void unconnect() {
        System.out.println(this.name+"mouse is out of connected !");


    }
}
