package spring14zhujiechangyongzhuru;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
   @Test
    public void test01(){
       String xml="spring14zhujiechangyongzhuru/applicationContext.xml";
       ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
       Teacher teacher = ac.getBean("teacher", Teacher.class);
       System.out.println("teacher = " + teacher);
   }
}
