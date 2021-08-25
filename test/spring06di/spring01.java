package spring06di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring01 {
    //以set方式注入 叫做set注入 常用
    @Test
    public void test01(){
        String xml="spring06di/applicationContext.xml";
        ApplicationContext cpxa = new ClassPathXmlApplicationContext(xml);

        //拿主体
        Person person = cpxa.getBean("person", Person.class);
        person.play();

        //如何提高依赖效率？ 提取成一个接口 同时也解耦了代码 让依赖关系由实体类依赖变成抽象的依赖 依赖关系就解开了
        //也解释了Java的三层架构为什么要用接口
        //oop 面向接口编程
    }
}
