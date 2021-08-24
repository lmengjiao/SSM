package spring07chizuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring01 {
    @Test
    public void test01() {
        String xml = "spring07chizuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        Person person = ac.getBean("person", Person.class);
        person.Eat();
    }
}
