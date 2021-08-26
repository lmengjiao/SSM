package spring15zhujieduquproperties;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        String xml="spring15zhujieduquproperties/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        OneBean oneBean = ac.getBean("oneBean", OneBean.class);
        System.out.println("oneBean = " + oneBean);
    }
}
