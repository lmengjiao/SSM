package spring08zidongzhuangpei;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//自动装配
        public class Spring01 {
            @Test
            public void test01(){
                String xml="spring08zidongzhuangpei/applicationContext.xml";
                ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
        Student student=ac.getBean("student",Student.class);
        student.play();
    }
}
