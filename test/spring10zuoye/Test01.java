package spring10zuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        String xml="spring10zuoye/applicationContext.xml";
        ApplicationContext cc = new ClassPathXmlApplicationContext(xml);

//        Student student = cc.getBean("student", Student.class);
//        System.out.println("student = " + student);

        Cpu cpu = cc.getBean("cpu", Cpu.class);
        cpu.start();
    }
}
