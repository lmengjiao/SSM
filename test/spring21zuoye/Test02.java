package spring21zuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test01(){
        String xml="spring21zuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        VideoService1 impl = ac.getBean("impl1", VideoService1.class);
        impl.start();
        impl.stop();
        impl.trans();
        impl.lose();
    }
}
