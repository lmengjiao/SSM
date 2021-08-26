package spring09shujuleixing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring02 {
    @Test
    public void test01() {
        String xml = "spring09shujuleixing/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        TeacherEl tacherEl = ac.getBean("teacherEl", TeacherEl.class);
        System.out.println("tacherEl = " + tacherEl);
    }
}