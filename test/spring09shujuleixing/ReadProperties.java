package spring09shujuleixing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class ReadProperties {
    @Test
    public void test01(){
        String xml = "spring09shujuleixing/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Properties db = ac.getBean("db", Properties.class);
        System.out.println("db = " + db);
    }
}
