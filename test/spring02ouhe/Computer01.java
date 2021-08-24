package spring02ouhe;

import org.junit.Test;

public class Computer01 implements Usb{
    //电脑的usb传输
    public void usbDate(){
        System.out.println("电脑的usb传输");
    }

    @Test
    public void Test01(){
        try {
            Class<?> computer01 = Class.forName("spring02ouhe.Computer01");
            System.out.println("computer01 = " + computer01.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
