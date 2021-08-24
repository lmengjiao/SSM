package spring04iocrongqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/*
容器偶的由来 根据刚刚工厂模式得知 一个项目中有大量的对象
大量的对象需要管理 为了管理更方便 使用容器 把对象通一处理

Spring中的容器 IOC
IOC有个思想 控制反转 控制就是我控制你 你控制我 我如何才算控制你 你的出生使用死亡都归我管
反转就是事情本来由A控制 现在是B控制 反转就是控制的主体改变了

容器是负责控制反转的
 */
public class Spring01 {
    //spring容器是管理对象
    //传统对象创建的三种方式
    //传统对象的缺点  控制权在方法中 执行顺序也在方法中
    @Test
    public void test01(){
        //1.new 关键字
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("11111111111111");
        //2.static 静态方法创建 静态工厂创建
        Calendar calendar=Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("22222222222222222222222");
        //3.实例工厂创建
        Date time = calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("33333333333333");
    }

    //使用spring管理对象（创建 使用 销毁）
    @Test
    public void test02(){
        //1.加载容器的xml
        String xml="spring04iocrongqi/applicationContext.xml";
        //xml一经加载 所有的对象就已经诞生 拿到了对象的控制权
        //传统对象是new new一个拿到一个控制权 现在spring通过反射 拿到了对象 这就是控制权的改变 控制反转
//        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext(xml);
        //执行生命周期的死亡方法 ClassPathXmlApplicationContext->ApplicationContext
       ApplicationContext cpxa = new ClassPathXmlApplicationContext(xml);
        System.out.println("cpxa = " + cpxa);
        //如何获取对象
       Date date=cpxa.getBean("date",Date.class); //依赖注入
        System.out.println("date = " + date);
        
        //作用域 测试spring默认创建对象是否是单例模式 
        Pc pc = cpxa.getBean("pc", Pc.class);
        Pc pc2 = cpxa.getBean("pc", Pc.class);
        System.out.println("pc = " + pc);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc==pc2); //单例模式 ==为true 默认内存地址一样
        System.out.println(pc==pc2); //原型模式 ==为false scope="prototype"

        ((ClassPathXmlApplicationContext) cpxa).close();//关闭容器 执行死亡方法
        //如果生命周期中使用原型模式 那么无法调用对象的死亡方法 所以尽量使用单例模式
    }
}
