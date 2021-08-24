package spring02ouhe;

import org.junit.Test;

public class Spring01 {
    //创建几个类 模拟耦合
    @Test
    public void test01() throws Exception {
//        //①未创建接口
//        //如果使用电脑传输数据
//        Computer01 computer01 = new Computer01();
//        computer01.usbDate();
//        //如果使用电视传输数据
//        Tv01 tv01 = new Tv01();
//        tv01.usbDate();

        //②创建接口后 代码优化了 解耦一次
//      Usb u=new Computer01();
//        Usb u=new Tv01();
//        u.usbDate();

        //③创建工厂模式后更方便
//        Usb usb=FactoryBean.getInstance("Computer01");  //用来生成唯一的实例
//        usb.usbDate();

        //④反射的第二种方法
        //spring底层也是工厂模式
        Usb u=FactoryBean.getInstance("spring02ouhe.Computer01");
        u.usbDate();
        Usb uu=FactoryBean.getInstance("spring02ouhe.Tv01");
        uu.usbDate();

        //需求1：电脑电视都可以usb传输数据 电脑不用 只用电视 直接修改代码量比较大
        //把usb传输提取成接口 使用多态思想进行代码更新 解耦一次
        //第一次使用接口，多态的思想解耦 好处是可以多次修改代码 一个u就代表上边的变量
        //第二次解耦 使用工厂类 代码更方便
        //第二次解耦 让用户输入字符比打开源代码更方便 将来代码要加密
    }
}
