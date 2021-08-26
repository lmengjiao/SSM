package spring07di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//06讲的set注入 07讲的构造器注入
public class Spring01 {
    @Test
    public void tese01(){
        String xml="spring07di/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Person p=ac.getBean("person",Person.class);
        p.play();
    }
}
