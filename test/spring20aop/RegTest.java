package spring20aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的 把message的次要业务融合到主要业务
    //用spring实现
    @Test
    public void test01(){
        String xml="spring20aop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        RegService regService = ac.getBean("regService", RegService.class);
        regService.addUser();
        System.out.println("-------");
        regService.loginUser();
        System.out.println("-------");
        regService.transMoney();
        System.out.println("-------");

    }
}
