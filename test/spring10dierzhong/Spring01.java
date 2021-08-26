package spring10dierzhong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring01 {
    @Test
    public void test01() {
        String xml = "spring10dierzhong/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher2 teacher = ac.getBean("teacher2", Teacher2.class);
        System.out.println("teacher = " + teacher);
    }
}