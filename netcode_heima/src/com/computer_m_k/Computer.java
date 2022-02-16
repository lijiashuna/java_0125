package com.computer_m_k;

public class Computer {
    private String name;

    public void installUSB(USB usb){
        usb.connect();
        //判断传入的真是类型
        if(usb instanceof KeyBoard){
            ((KeyBoard) usb).KnockKeyboard();
        }
        else if(usb instanceof Mouse ){
            ((Mouse) usb).clickMouse();
        }
        usb.unconnect();
    }
    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
