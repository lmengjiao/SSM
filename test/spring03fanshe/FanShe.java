package spring03fanshe;

import org.junit.Test;

import java.util.Date;

//反射是干嘛的？ 创建对象 
//如何创建对象？ 有3种方式
//之前是如何创建对象？ new 会造成耦合
public class FanShe {
    @Test
    public void Test01(){
        //new对象
        Date date = new Date();
        System.out.println("date = " + date);
        //反射创建对象
        //1.找到类的出处并创建对象
        //缺点 必须先new一个对象 所以并不常用
        try {
            Date date1 = date.getClass().newInstance(); //实例化
            System.out.println("date1 = " + date1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //2.以文本的形式找到出处 常用
        try {
            Class<?> aClass = Class.forName("java.util.Date");
            System.out.println("aClass.newInstance() = " + aClass.newInstance()); //实例化
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3.直接.class
        Class c=Date.class;
        try {
            Date o= (Date) c.newInstance();
            System.out.println("o = " + o);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
